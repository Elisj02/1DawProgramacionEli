package capitulo3.bloque2;

import javax.swing.JOptionPane;

public class Act1 {

	public static void main(String[] args) {
		/*
		 * Media de una cantidad de números introducidos por el usuario. El usuario
		 * especificará una cantidad de números, tras lo cual se le deben pedir tantos
		 * como este haya indicado. Al final se debe imprimir la media.
		 */

		String srt;
		int num, i, veces, suma = 0, media = 0;

		srt = JOptionPane.showInputDialog(
				"Vamos a mostrar números positivos y negativos. \nIntroduzca la cantidad de números que quiere introducir: ");
		veces = Integer.parseInt(srt);

		for (i = 0; i < veces; i++) {

			srt = JOptionPane.showInputDialog("Introduce un número: ");
			num = Integer.parseInt(srt);
			suma = suma + num;
			media = suma / 2;
		}
		System.out.println("La media de los números introducidos es: " + media);
	}
}