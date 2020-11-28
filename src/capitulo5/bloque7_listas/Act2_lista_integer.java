package capitulo5.bloque7_listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import capitulo5.bloque1.Utils;

public class Act2_lista_integer {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que trabaje con una Lista de elementos Integer. Debes
		 * mostrar un menú en pantalla y ofrecer al usuario las siguientes opciones a
		 * realizar sobre la lista: 
		 * a) "Abandonar el programa". 
		 * b)"Crear aleatoriamente la lista de valores". Pedirás al usuario los siguientes
		 * datos: longitud de la lista, valor mínimo y valor máximo. A continuación
		 * limpiarás la lista (por si contenía valores), y agregarás tantos elementos
		 * enteros como se haya indicado, con valores que deben oscilar entre el mínimo
		 * y el máximo señalado. 
		 * c) "Calcular suma, media, mayor y menor". Mostrarás en
		 * pantalla esos cuatro valores. 
		 * d) "Agregar una cantidad de nuevos valores".
		 * Pedirás al usuario los siguientes datos: cuántos datos nuevos quiere agregar,
		 * posición a partir de la que se deben introducir, valor mínimo y valor máximo.
		 * Incluirás tantos valores como indique el usuario, en la posición indicada,
		 * con valores entre mínimo y máximo. 
		 * e)"Eliminar elementos cuyo valor esté en un intervalo". Pedirás dos valores al
		 * usuario (mínimo y máximo), que conforman un intervalo. Eliminarás los valores
		 * de la lista de elementos que se encuentren dentro de ese intervalo
		 * (incluyendo los límites) e informarás de cuantos elementos has eliminado de
		 * la lista. 
		 * f) "Imprimir la lista". Mostrarás la lista en pantalla.
		 */
		
		int opcion;
		List<Integer> fichero = new ArrayList<Integer>();
				
		do {
			opcion = menu();
		
			switch (opcion) {
			case 0: 
				System.out.println("Has abandonado el programa.");
				break;
			case 1:
				listaRandom(fichero);
				break;
			case 2:
				calcular(fichero);
				break;
			case 3:
				agregar(fichero);
				break;
			case 4:
				eliminar(fichero);
				break;
			case 5: 
				visualizaLista(fichero);
				break;
			default:
				System.out.println("Opción no válida");
			}
			
			
		} while (opcion != 0);

	}

	/**
	 * @return
	 */
	public static int menu () {
		String strMenu = "\n\nMenÃº"
				+ "\n0.- SALIR"
				+ "\n1.- CREAR ALEATORIAMENTE LA LISTA DE VALORES."
				+ "\n2.- CALCULAR SUMA, MEDIA, MAYOR Y MENOR."
				+ "\n3.- AGREGAR UNA CANTIDAD DE NUEVOS VALORES."
				+ "\n4.- ELIMINAR ELEMENTOS CUYO VALOR ESTÉ EN UN INTERVALO."
				+ "\n5.- VISUALIZAR EL FICHERO."
				+ "\n\nIntroduzca su opción: ";

		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		return opcionUsuario;
	}
	
	/**
	 * @param lista
	 */
	public static void visualizaLista (List<Integer> lista) {
		System.out.println("\n\nContenido del fichero");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}
	
	public static void listaRandom(List<Integer>lista) {
		String str;
		str = JOptionPane.showInputDialog("Introduce la longitud de la lista: ");
		int longitud = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el valor mínimo: ");
		int valorMin = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el valor máximo: ");
		int valorMax = Integer.parseInt(str);
		
		for (int i = 0; i < longitud; i++) {
			lista.add((Utils.obtenerNumeroAzar(valorMin, valorMax)));
		}
	
	}
	
	public static void calcular(List<Integer>lista) {
		System.out.println("CALCULAR SUMA, MEDIA, MAYOR Y MENOR");
		int suma = 0, mayor = 0, menor = 0;
		float media = 0f;
		
		for(int i = 0; i < lista.size(); i++) {
			suma =+ lista.get(i);
		}
		
		media = suma / lista.size();
		
		mayor =	Collections.max(lista);
		
		menor = Collections.min(lista);
		
		/* int mayor = list.get(0);
		 * int menor = list.get(0);
		 *  for(i = 0; i < list.size(); i++) {
		 * if (list.get(i) > mayor){
		 * mayor = list.get(i);
		 * }
		 * if (list.get(i) < menor){
		 * menor = list.get(i);
		 * }
		 * } */
		
		System.out.println("La suma es: " + suma + "\nLa media es: " + media + "\nEl mayor es: " + mayor + "\nEl menor es: " + menor);
	}
	
	public static void agregar(List<Integer>lista) {
		String str;
		str = JOptionPane.showInputDialog("¿Cuántos valores quiere añadir?: ");
		int añadir = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("¿En qué posición los quiere añadir?: ");
		int posicion = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca un valor mínimo: ");
		int valMin = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Introduzca un valor máximo: ");
		int valMax = Integer.parseInt(str);

		for (int i = 0; i < añadir; i++) {
			lista.add(posicion, Utils.obtenerNumeroAzar(valMin, valMax));
		}
	}
	
	public static void eliminar(List<Integer>lista) {
		
		String str;
		int veces = 0;
		str = JOptionPane.showInputDialog("Introduzca la primera línea del intervalo que quiere eliminar: ");
		int linPrim = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca la última línea del intervalo que quiere eliminar: ");
		int linUlt = Integer.parseInt(str);
		
		for (int i = linPrim; i <= linUlt; i++) {
			lista.remove(linPrim);
			
			veces ++;
		}
		
		System.out.println("Se han eliminado: " + veces + " elementos");
		
	}


	}


