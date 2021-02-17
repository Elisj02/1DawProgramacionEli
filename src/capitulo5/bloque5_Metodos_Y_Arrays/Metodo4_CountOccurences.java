package capitulo5.bloque5_Metodos_Y_Arrays;

import capitulo5.bloque1.Utils;

public class Metodo4_CountOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar();
		}
	}

	public static int countOccurrences(int array[], int valor) {
		/*
		 * Realiza un m�todo llamado "countOccurrences", que reciba: - Un array de
		 * n�meros enteros. - Un valor entero. El m�todo debe devolver un valor entero,
		 * que corresponda con el n�mero de veces que el valor entero recibido como
		 * segundo par�metro exista dentro del array recibido como primer par�metro.
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