package capitulo3.bloque3;

import javax.swing.JOptionPane;

public class Act7 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que pida n�meros al usuario, hasta que uno de ellos sea
		 * 0 (cero). Al finalizar se debe imprimir en pantalla cuantos son positivos y
		 * cuantos negativos. No debes tener en cuenta el 0 (cero).
		 */

		String srt;
		int num = 0, positivo = 0, negativo = 0, i;

		do {
			srt = JOptionPane.showInputDialog(
					"Introduzca n�meros para mostrar cuantos son positivos y cuantos negativos. 0 para salir: ");
			num = Integer.parseInt(srt);

			if (num > 0) {
				positivo = positivo + 1;
			} else {
				if (num == 0) {
					break;
				}

				if (num < 0) {
					negativo = negativo + 1;
				}
			}

		} while (num != 0);
	System.out.println("Hay " + negativo + " n�meros negativos y " + positivo + " positivos.");
	}
}
