package capitulo5.bloque2;

import javax.swing.JOptionPane;

import capitulo5.bloque1.Utils;

public class Act6 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio igual al anterior, en el que el usuario también pueda
		 * deteminar la dirección del movimiento.
		 */
		int num[] = new int[5];
		int aux, cant = 0, direcc;
		String srt;

		srt = JOptionPane
				.showInputDialog("Introduce una dirección para desplazar el array. 1 - izquierda. 2 - derecha: ");
		direcc = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("Introduce la cantidad de posiciones que desea desplazar: ");
		cant = Integer.parseInt(srt);

		for (int i = 0; i < num.length; i++) {
			num[i] = Utils.obtenerNumeroAzar(0, 100);
			System.out.println("Array sin intercambiar: " + num[i]);
		}
		if (direcc == 1) {
			for (int i = 0; i < cant; i++) {

				// Salvaguardo la primera posición del array
				aux = num[0];
				// Recorro las posiciones del array de primera a penúltima
				for (int j = 0; j < num.length - 1; j++) {
					num[j] = num[j + 1];
				}
				// La primera posición, guardada en aux, pasa a ser la última
				num[num.length - 1] = aux;
			}
			for (int i = 0; i < num.length; i++) {
				System.out.println("Array desplazado hacia la izquierda " + cant + " veces: " + num[i]);

			}
		}

		else {

			for (int i = 0; i < cant; i++) {

				// El último lo guardo en aux
				aux = num[num.length - 1];

				// desplazo todos los elementos a la derecha dejando la posición 0 vacía
				for (int j = num.length - 1; j > 0; j--) {
					num[j] = num[j - 1];
				}
				// El último pasa a la posición 0
				num[0] = aux;

			}
			for (int i = 0; i < num.length; i++) {
				System.out.println("Array desplazado hacia la derecha " + cant + " veces: " + num[i]);

			}
		}
	}
}
