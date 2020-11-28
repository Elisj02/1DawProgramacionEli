package capitulo5.bloque7_listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Act1_editorDeTextos {

	public static void main(String[] args) {
		/*
		 * 1.- Escribe un programa editor de textos. Debes utilizar la consola de Java.
		 * El objetivo es que se pueda editar el contenido de un archivo ficticio. Para
		 * hacer esto utilizarás una lista de elementos de tipo String. Cada línea del
		 * texto será representada como un String. Debes mostrar un menú en pantalla,
		 * que contenga todas las opciones siguientes, y que funcionen adecuadamente:
		 * a)"Abandonar el programa". 
		 * b) "Agregar una línea al texto". Pediras al
		 * usuario un String y lo agregarás al final de la lista que representa tu
		 * fichero ficticio. 
		 * b) "Insertar una línea en cualquier posición del texto".
		 * Pedirás al usuario un String y un número. Insertarás el String en la línea
		 * pedida. 
		 * c)"Editar una línea (reescribir su contenido)". Pedirás al usuario un
		 * número de línea para sobrescribir, mostrarás al usuario la línea actual que
		 * desea sobrescribir. Pedirás un nuevo String. Eliminarás el String actual y
		 * cambiarás con el nuevo
		 * d) "Borrar una línea". Pedirás un número de línea y la
		 * eliminarás de la lista. 
		 * e) "Cortar un conjunto de líneas", (marcadas por su
		 * posición inicial y final). Pedirás un número de línea inicial y uno final.
		 * "Transportarás todas las líneas del intervalo a una nueva lista y las
		 * borrarás de la lista original.
		 * f)"Pegar un conjunto de líneas cortadas en una determinada posición". Pedirás
		 * un número de línea en la que insertar lo que tienes cortado con la opción
		 * anterior. 
		 * g) "Imprimir el fichero". Mostrarás cada línea del fichero
		 * ficticio, aparecerá numerada en la consola.
		 */

		// Declaro variables necesarias
				int opcion;
				List<String> fichero = new ArrayList<String>();
				List<String> portapapeles2 = new ArrayList<String>();
				List<String> fichero2 = new ArrayList<String>();

				
				// Inicializo algo de contenido en la lista. Esto debe eliminarse cuando el programa esté finalizado
				fichero.add("Primera línea"); fichero.add("Segunda línea"); fichero.add("Tercera línea"); fichero.add("Cuarta línea"); fichero.add("Quinta línea"); fichero.add("Sexta línea");
				
				do {
					opcion = menu();
					//Cada caso según la opción que introduzca el usuario.
		switch (opcion) {
			case 0: 
				System.out.println("Has abandonado el programa.");
				break;
			case 1:	
					agregarLinea(fichero);
				break;
			case 2:
					insertarLinea(fichero);
				break;
			case 3:
					editarLinea(fichero);
					break;
			case 4:
					eliminarLinea(fichero);
					break;
			case 5:
					portapapeles2 = cortarLineas(fichero);
					break;
			case 6:
					pegarLineas(fichero2, portapapeles2);
					visualizaLista2(fichero2);
					break;
					
			case 7:	
				System.err.println("VISUALIZAR EL FICHERO.");
				visualizaLista(fichero);
					break;
				
			case 8:
				System.err.println("VISUALIZAR EL FICHERO 2.");
				visualizaLista2(fichero2);
				break;
		}
	} while (opcion != 0);
	}
	
		public static int menu () {
			String strMenu = "\n\nMENÚ"
					+ "\n0.- SALIR."
					+ "\n1.- AGREGAR UNA LÍNEA."
					+ "\n2.- INSERTAR UNA LÍNEA EN UNA POSICIÓN."
					+ "\n3.- EDITAR UNA LÍNEA."
					+ "\n4.- ELIMINAR UNA LÍNEA."
					+ "\n5.- CORTAR UN CONJUNTO DE LÍNEAS."
					+ "\n6.- PEGAR UN CONJUNTO DE LÍNEAS."
					+ "\n7.- VISUALIZAR EL FICHERO."
					+ "\n8.- VISUALIZAR EL FICHERO 2."
					+ "\n\n INTRODUZCA LA OPCIÓN QUE QUIERA: ";
			// Muestro el menú
			System.out.println(strMenu);
			// Pido una opción al usuario
			int opcionUsuario;
			opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
			// Devuelvo la opción seleccionada
			return opcionUsuario;
		}

		public static void visualizaLista (List<String> lista) {
			System.out.println("\n\nContenido del fichero");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println("\t" + i + " - " + lista.get(i));
			}
		}
		
		public static void agregarLinea (List<String>lista) {
			System.err.println("AGREGAR UNA LÍNEA.");
			String str = JOptionPane.showInputDialog("Introduzca la línea que quiere añadir: ");
			lista.add(str);
		}
		
		public static void insertarLinea(List<String>lista) {
			String str;
			int linea;
		System.err.println("INSERTAR UNA LÍNEA EN UNA POSICIÓN.");
		str = JOptionPane.showInputDialog("¿En qué posición quiere introducir una línea?");
		linea = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca la línea que quiere añadir: ");
		lista.add(linea, str);
		}
		
		public static void editarLinea(List<String>lista) {
			
			System.err.println("EDITAR UNA LÍNEA.");
			String str = JOptionPane.showInputDialog("Introduzca el número de línea que quiere editar: ");
			int linea = Integer.parseInt(str);
			
			str = JOptionPane.showInputDialog(lista.get(linea) + "\nIntroduzca la nueva línea: ");
			lista.remove(linea);
			lista.add(linea, str);
		}
		
		public static void eliminarLinea (List<String>lista) {
			System.err.println("ELIMINAR UNA LÍNEA.");
			String str = JOptionPane.showInputDialog("¿Qué línea quiere eliminar?: ");
			int linea = Integer.parseInt(str);
			
			lista.remove(linea);
		}
		
		public static List<String> cortarLineas(List<String>lista) {
			List<String>portapapeles = new ArrayList<String>();
			
			System.err.println("CORTAR UN CONJUNTO DE LÍNEAS.");
			String str = JOptionPane.showInputDialog("Introduzca la primera línea que quiere borrar: ");
			int minLin = Integer.parseInt(str);
			
			str = JOptionPane.showInputDialog("Introduzca la última línea que quiere borrar: ");
			int maxLin = Integer.parseInt(str);
			
			for (int i = minLin; i < maxLin; i++) {
				portapapeles.add(lista.get(minLin));
				lista.remove(minLin);
			}
			return portapapeles;
		}	
		
		public static void pegarLineas(List<String>lista, List<String>lista2) {
			String str;
			int linea;
			str = JOptionPane.showInputDialog("¿En que línea quieres pegar el portapapeles?");
			linea = Integer.parseInt(str);
			
			lista.addAll(linea, lista2);
		
		} 
		public static void visualizaLista2(List<String> lista) {
			System.out.println("\n\nContenido del fichero");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println("\t" + i + " - " + lista.get(i));
			}
		
		}
}
	
