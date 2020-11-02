package capitulo5.bloque2;

import javax.swing.JOptionPane;

import capitulo5.bloque1.Utils;

public class Act6 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio igual al anterior, en el que el usuario tambi�n pueda
		 * deteminar la direcci�n del movimiento.
		 */

		int num[] = new int[5];
		int aux = 0, cant, direcc;
		String srt;

		srt = JOptionPane.showInputDialog("Introduce una direcci�n para desplazar el array. 1 - izquierda. 2 - derecha: ");
		direcc = Integer.parseInt(srt);
		
		srt = JOptionPane.showInputDialog("Introduce la cantidad de posiciones que desea desplazar: ");
		cant = Integer.parseInt(srt);

		for (int i = 0; i < num.length; i++) {
			num[i] = Utils.obtenerNumeroAzar(0, 100);
			System.out.println("Array sin intercambiar: " + num[i]);
		}
		if (direcc == 1) {
			for (int i = 0; i < cant; i++) {

				// El primero lo guardo en aux
				num[0] = aux;
				
				// desplazo todos los elementos a la izq dejando la posici�n 4 vac�a
				for (int j = num.length + 1; j > 0; j++) {
					num[j] = num[j + 1];
				}
				// El primero pasa a la posici�n 4
				aux = num[num.length + 1];


			}
			for (int i = 0; i < num.length; i++) {
				System.out.println("Array desplazado hacia la izquierda " + cant + " veces: " + num[i]);

			}
		}	
		
		else {
			
			for (int i = 0; i < cant; i++) {

				// El �ltimo lo guardo en aux
				aux = num[num.length - 1];

				// desplazo todos los elementos a la derecha dejando la posici�n 0 vac�a
				for (int j = num.length - 1; j > 0; j--) {
					num[j] = num[j - 1];
				}
				// El �ltimo pasa a la posici�n 0
				num[0] = aux;

			}
			for (int i = 0; i < num.length; i++) {
				System.out.println("Array desplazado hacia la derecha " + cant + " veces: " + num[i]);

			}
		}

		

	}
}
