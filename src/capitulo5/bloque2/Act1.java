package capitulo5.bloque2;

import capitulo5.bloque1.Utils;

public class Act1 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar
		 * entre -100 y 100. Debes conseguir que todos los números pares del array
		 * cambien de signo, los positivos deben pasar a negativos y viceversa.
		 */

		int num[] = new int[150];

		for (int i = 0; i < num.length; i++) {
			num[i] = Utils.obtenerNumeroAzar(-100, 100);
			System.out.println("Array original: " + num[i]);

			if (num[i] % 2 == 0) {
				num[i] = (num[i] * -1);
			}
			System.out.println("Array cambiado: " + num[i]);
		}
	}
}