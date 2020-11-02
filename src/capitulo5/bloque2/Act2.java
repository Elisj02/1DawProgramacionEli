package capitulo5.bloque2;

import capitulo5.bloque1.Utils;

public class Act2 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que inicialice dos arrays de 150 elementos enteros al
		 * azar entre 0 y 100. Debes crear un tercer array, compuesto de la siguiente
		 * forma: en los elementos de índice impar del tercer array debes copiar los
		 * elementos de índice impar del primer array; en los elementos de índice par
		 * del tercer array debes copiar los elementos de índice par del segundo array.
		 */

		int num1[] = new int[150];

		for (int i = 0; i < num1.length; i++) {
			num1[i] = Utils.obtenerNumeroAzar(0, 100);
			System.out.println("Array 1: " + num1[i]);
		}

		int num2[] = new int[150];

		for (int i = 0; i < num2.length; i++) {
			num2[i] = Utils.obtenerNumeroAzar(0, 100);
			System.out.println("Array 2: " + num2[i]);
		}

		int num3[] = new int[150];

		for (int i = 0; i < num3.length; i++) {
			if (num3[i] % 2 != 0) {
				num3[i] = num1[i];
			}
			if (num3[i] % 2 == 0) {
				num3[i] = num2[i];
			}
			System.out.println("Array 3: " + num3[i]);

		}
	}

}
