package capitulo5.bloque5_Métodos_Y_Arrays;

import capitulo5.bloque1.Utils;

public class Método4_CountOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar();
		}
	}

	public static int countOccurrences(int array[], int valor) {
		/*
		 * Realiza un método llamado "countOccurrences", que reciba: - Un array de
		 * números enteros. - Un valor entero. El método debe devolver un valor entero,
		 * que corresponda con el número de veces que el valor entero recibido como
		 * segundo parámetro exista dentro del array recibido como primer parámetro.
		 */

		int veces = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == valor) {
				veces += 1;
			}
		}

		return veces;
	}
}