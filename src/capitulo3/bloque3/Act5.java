package capitulo3.bloque3;

import javax.swing.JOptionPane;

public class Act5 {

	public static void main(String[] args) {
		/*  Realiza un ejercicio parecido a los dos anteriores, d�nde se imprima el
		 *  mayor valor y el menor de todos los introducidos.
		 */

		String srt;
		int num = -1, i, menor = 0, mayor = 0;

		for (i = 0; num != 0; i++) {
			srt = JOptionPane.showInputDialog("Introduce un n�mero. 0 para acabar: ");
			num = Integer.parseInt(srt);

			if (i == 0) {
				menor = num;
			} else {
				if (num < menor && num != 0) {
					menor = num;
				}
			}
			if (i == 0) {
				mayor = num;
			} else {
				if (num > mayor && num != 0) {
					mayor = num;
				}
			}
		}
		System.out.println("El menor es: " + menor + " \nEl mayor es: " + mayor);
	}
}
