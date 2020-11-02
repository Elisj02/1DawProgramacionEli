package capitulo5.bloque2;

import javax.swing.JOptionPane;

import capitulo5.bloque1.Utils;

public class Act5 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio igual al anterior, pero en el que el usuario pueda
		 * indicar la cantidad de posiciones que deseamos desplazar.
		 */

		int num[] = new int[5];
		int i, aux, cant;
		String srt;

		for (i = 0; i < num.length; i++) {
			num[i] = Utils.obtenerNumeroAzar(0, 100);
			System.out.println("Array sin intercambiar: " + num[i]);
		}

		srt = JOptionPane.showInputDialog("Introduce la cantidad de posiciones que desea desplazar: ");
		cant = Integer.parseInt(srt);

		for (int vueltas = 1; vueltas <= cant; vueltas++) {

			// El último lo guardo en aux
			aux = num[num.length - 1];

			// desplazo todos los elementos a la derecha dejando la posición 0 vacía
			for (i = num.length - 1; i > 0; i--) {
				num[i] = num[i - 1];
			}
			// El último pasa a la posición 0
			num[0] = aux;

		}
		for (i = 0; i < num.length; i++) {
			System.out.println("Array intercambiado: " + num[i]);

		}
	}

}
