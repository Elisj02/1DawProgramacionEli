package capitulo5.bloque7_listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Act1_editorDeTextos {

	public static void main(String[] args) {
		/*
		 * 1.- Escribe un programa editor de textos. Debes utilizar la consola de Java.
		 * El objetivo es que se pueda editar el contenido de un archivo ficticio. Para
		 * hacer esto utilizar�s una lista de elementos de tipo String. Cada l�nea del
		 * texto ser� representada como un String. Debes mostrar un men� en pantalla,
		 * que contenga todas las opciones siguientes, y que funcionen adecuadamente:
		 * a)"Abandonar el programa". 
		 * b) "Agregar una l�nea al texto". Pediras al
		 * usuario un String y lo agregar�s al final de la lista que representa tu
		 * fichero ficticio. 
		 * b) "Insertar una l�nea en cualquier posici�n del texto".
		 * Pedir�s al usuario un String y un n�mero. Insertar�s el String en la l�nea
		 * pedida. 
		 * c)"Editar una l�nea (reescribir su contenido)". Pedir�s al usuario un
		 * n�mero de l�nea para sobrescribir, mostrar�s al usuario la l�nea actual que
		 * desea sobrescribir. Pedir�s un nuevo String. Eliminar�s el String actual y
		 * cambiar�s con el nuevo
		 * d) "Borrar una l�nea". Pedir�s un n�mero de l�nea y la
		 * eliminar�s de la lista. 
		 * e) "Cortar un conjunto de l�neas", (marcadas por su
		 * posici�n inicial y final). Pedir�s un n�mero de l�nea inicial y uno final.
		 * "Transportar�s todas las l�neas del intervalo a una nueva lista y las
		 * borrar�s de la lista original.
		 * f)"Pegar un conjunto de l�neas cortadas en una determinada posici�n". Pedir�s
		 * un n�mero de l�nea en la que insertar lo que tienes cortado con la opci�n
		 * anterior. 
		 * g) "Imprimir el fichero". Mostrar�s cada l�nea del fichero
		 * ficticio, aparecer� numerada en la consola.
		 */

		// Declaro variables necesarias
				int opcion;
				List<String> fichero = new ArrayList<String>();
				List<String> portapapeles2 = new ArrayList<String>();
				List<String> fichero2 = new ArrayList<String>();

				
				// Inicializo algo de contenido en la lista. Esto debe eliminarse cuando el programa est� finalizado
				fichero.add("Primera l�nea"); fichero.add("Segunda l�nea"); fichero.add("Tercera l�nea"); fichero.add("Cuarta l�nea"); fichero.add("Quinta l�nea"); fichero.add("Sexta l�nea");
				
				do {
					opcion = menu();
					//Cada caso seg�n la opci�n que introduzca el usuario.
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
			String strMenu = "\n\nMEN�"
					+ "\n0.- SALIR."
					+ "\n1.- AGREGAR UNA L�NEA."
					+ "\n2.- INSERTAR UNA L�NEA EN UNA POSICI�N."
					+ "\n3.- EDITAR UNA L�NEA."
					+ "\n4.- ELIMINAR UNA L�NEA."
					+ "\n5.- CORTAR UN CONJUNTO DE L�NEAS."
					+ "\n6.- PEGAR UN CONJUNTO DE L�NEAS."
					+ "\n7.- VISUALIZAR EL FICHERO."
					+ "\n8.- VISUALIZAR EL FICHERO 2."
					+ "\n\n INTRODUZCA LA OPCI�N QUE QUIERA: ";
			// Muestro el men�
			System.out.println(strMenu);
			// Pido una opci�n al usuario
			int opcionUsuario;
			opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
			// Devuelvo la opci�n seleccionada
			return opcionUsuario;
		}

		public static void visualizaLista (List<String> lista) {
			System.out.println("\n\nContenido del fichero");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println("\t" + i + " - " + lista.get(i));
			}
		}
		
		public static void agregarLinea (List<String>lista) {
			System.err.println("AGREGAR UNA L�NEA.");
			String str = JOptionPane.showInputDialog("Introduzca la l�nea que quiere a�adir: ");
			lista.add(str);
		}
		
		public static void insertarLinea(List<String>lista) {
			String str;
			int linea;
		System.err.println("INSERTAR UNA L�NEA EN UNA POSICI�N.");
		str = JOptionPane.showInputDialog("�En qu� posici�n quiere introducir una l�nea?");
		linea = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca la l�nea que quiere a�adir: ");
		lista.add(linea, str);
		}
		
		public static void editarLinea(List<String>lista) {
			
			System.err.println("EDITAR UNA L�NEA.");
			String str = JOptionPane.showInputDialog("Introduzca el n�mero de l�nea que quiere editar: ");
			int linea = Integer.parseInt(str);
			
			str = JOptionPane.showInputDialog(lista.get(linea) + "\nIntroduzca la nueva l�nea: ");
			lista.remove(linea);
			lista.add(linea, str);
		}
		
		public static void eliminarLinea (List<String>lista) {
			System.err.println("ELIMINAR UNA L�NEA.");
			String str = JOptionPane.showInputDialog("�Qu� l�nea quiere eliminar?: ");
			int linea = Integer.parseInt(str);
			
			lista.remove(linea);
		}
		
		public static List<String> cortarLineas(List<String>lista) {
			List<String>portapapeles = new ArrayList<String>();
			
			System.err.println("CORTAR UN CONJUNTO DE L�NEAS.");
			String str = JOptionPane.showInputDialog("Introduzca la primera l�nea que quiere borrar: ");
			int minLin = Integer.parseInt(str);
			
			str = JOptionPane.showInputDialog("Introduzca la �ltima l�nea que quiere borrar: ");
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
			str = JOptionPane.showInputDialog("�En que l�nea quieres pegar el portapapeles?");
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
	
