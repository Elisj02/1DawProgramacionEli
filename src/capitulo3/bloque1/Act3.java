package capitulo3.bloque1;

import javax.swing.JOptionPane;

public class Act3 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que pida números al usuario, tantos como indique el
		 * usuario. Al final debe aparecer cuantos números positivos y negativos se han
		 * introducido.
		 */

		String srt;
		int num, i, veces, positivos = 0, negativos = 0;

		srt = JOptionPane.showInputDialog(
				"Vamos a mostrar números positivos y negativos. \nIntroduzca la cantidad de números que quiere introducir: ");
		veces = Integer.parseInt(srt);

		for (i = 0; i < veces; i++) {

			srt = JOptionPane.showInputDialog("Introduce un número: ");
			num = Integer.parseInt(srt);

			if (num > 0) {
				positivos = positivos + 1;
			}

			else
				negativos = negativos + 1;
		}
		System.out.println(
				"Se han introducido " + positivos + " números positivos y " + negativos + " números negativos.");
	}
}
