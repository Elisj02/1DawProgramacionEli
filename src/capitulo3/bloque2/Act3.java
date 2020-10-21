package capitulo3.bloque2;

import javax.swing.JOptionPane;

public class Act3 {

	public static void main(String[] args) {
		/*
		 * Ejercicio que obtenga todos los múltiplos de un número introducido por el
		 * usuario. Se imprimirán todos los múltiplos menores de 100, este será el
		 * límite.
		 */

		String srt;
		int num, i;

		srt = JOptionPane.showInputDialog("Introduce un número para mostrar todos sus múltiplos menores de 100: ");
		num = Integer.parseInt(srt);

		for (i = 1; num < 100; i++) {
			num *= i;
			System.out.println(num);
		}

	}
}
