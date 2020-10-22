package capitulo3.bloque2;

import javax.swing.JOptionPane;

public class Act2 {

	public static void main(String[] args) {
		/*
		 * Mayor y menor de una cantidad de números dada por el usuario. El usuario
		 * introducirá una cantidad de números, tras lo cual se le deben pedir tantos
		 * como este haya indicado. Al final se debe imprimir el mayor y el menor de
		 * todos los introducidos.
		 */

		String srt;
		int num, i, veces, mayor = 0, menor = 0;

		srt = JOptionPane.showInputDialog(
				"Vamos a mostrar el número mayor y menor. \nIntroduzca la cantidad de números que quiere introducir: ");
		veces = Integer.parseInt(srt);

		for (i = 0; i < veces; i++) {

			srt = JOptionPane.showInputDialog("Introduce un número: ");
			num = Integer.parseInt(srt);

			if (i == 0) {
				mayor = num;
				menor = num;
			} else {
				if (num > mayor) {
					mayor = num;
					if (num < menor) {
						menor = num;
					}
				}
			}
		}

		System.out.println("El mayor es: " + mayor + " y el menor es: " + menor);
	}
}
