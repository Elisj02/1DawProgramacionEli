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
		 * mostrar un men� en pantalla y ofrecer al usuario las siguientes opciones a
		 * realizar sobre la lista: 
		 * a) "Abandonar el programa". 
		 * b)"Crear aleatoriamente la lista de valores". Pedir�s al usuario los siguientes
		 * datos: longitud de la lista, valor m�nimo y valor m�ximo. A continuaci�n
		 * limpiar�s la lista (por si conten�a valores), y agregar�s tantos elementos
		 * enteros como se haya indicado, con valores que deben oscilar entre el m�nimo
		 * y el m�ximo se�alado. 
		 * c) "Calcular suma, media, mayor y menor". Mostrar�s en
		 * pantalla esos cuatro valores. 
		 * d) "Agregar una cantidad de nuevos valores".
		 * Pedir�s al usuario los siguientes datos: cu�ntos datos nuevos quiere agregar,
		 * posici�n a partir de la que se deben introducir, valor m�nimo y valor m�ximo.
		 * Incluir�s tantos valores como indique el usuario, en la posici�n indicada,
		 * con valores entre m�nimo y m�ximo. 
		 * e)"Eliminar elementos cuyo valor est� en un intervalo". Pedir�s dos valores al
		 * usuario (m�nimo y m�ximo), que conforman un intervalo. Eliminar�s los valores
		 * de la lista de elementos que se encuentren dentro de ese intervalo
		 * (incluyendo los l�mites) e informar�s de cuantos elementos has eliminado de
		 * la lista. 
		 * f) "Imprimir la lista". Mostrar�s la lista en pantalla.
		 */
		
		int opcion;
		List<Integer> fichero = new ArrayList<Integer>();
				
		do {
			opcion = menu();
		
			switch (opcion) {
			case 0: 
				System.err.println("Has abandonado el programa.");
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
				System.err.println("Opci�n no v�lida");
			}
			
			
		} while (opcion != 0);

	}

	/**
	 * @return
	 */
	public static int menu () {
		String strMenu = "\n\nMen�"
				+ "\n0.- SALIR"
				+ "\n1.- CREAR ALEATORIAMENTE LA LISTA DE VALORES."
				+ "\n2.- CALCULAR SUMA, MEDIA, MAYOR Y MENOR."
				+ "\n3.- AGREGAR UNA CANTIDAD DE NUEVOS VALORES."
				+ "\n4.- ELIMINAR ELEMENTOS CUYO VALOR EST� EN UN INTERVALO."
				+ "\n5.- VISUALIZAR EL FICHERO."
				+ "\n\nIntroduzca su opci�n: ";

		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		return opcionUsuario;
	}
	
	/**
	 * @param lista
	 */
	public static void visualizaLista (List<Integer> lista) {
		System.err.println("VISUALIZAR LISTA.");
		System.out.println("\n\nContenido del fichero");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}
	
	public static void listaRandom(List<Integer>lista) {
		System.err.println("CREAR ALEATORIAMENTE LA LISTA DE VALORES.");
		String str;
		str = JOptionPane.showInputDialog("Introduce la longitud de la lista: ");
		int longitud = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el valor m�nimo: ");
		int valorMin = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce el valor m�ximo: ");
		int valorMax = Integer.parseInt(str);
		
		for (int i = 0; i < longitud; i++) {
			lista.add((Utils.obtenerNumeroAzar(valorMin, valorMax)));
		}
	
	}
	
	public static void calcular(List<Integer>lista) {
		System.err.println("CALCULAR SUMA, MEDIA, MAYOR Y MENOR");
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
		System.err.println("AGREGAR VALORES.");
		String str;
		str = JOptionPane.showInputDialog("�Cu�ntos valores quiere a�adir?: ");
		int aniadir = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("�En qu� posici�n los quiere a�adir?: ");
		int posicion = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca un valor mínimo: ");
		int valMin = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Introduzca un valor m�ximo: ");
		int valMax = Integer.parseInt(str);

		for (int i = 0; i < aniadir; i++) {
			lista.add(posicion, Utils.obtenerNumeroAzar(valMin, valMax));
		}
	}
	
	public static void eliminar(List<Integer>lista) {
		System.err.println("ELIMINAR UN INTERVALO DE VALORES.");
		String str;
		int veces = 0;
		str = JOptionPane.showInputDialog("Introduzca la primera l�nea del intervalo que quiere eliminar: ");
		int linPrim = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca la �ltima l�nea del intervalo que quiere eliminar: ");
		int linUlt = Integer.parseInt(str);
		
		for (int i = linPrim; i <= linUlt; i++) {
			lista.remove(linPrim);
			
			veces ++;
		}
		
		System.out.println("Se han eliminado: " + veces + " elementos");
		
	}


	}


