package capitulo3.bloque2;

import javax.swing.JOptionPane;

public class Act3 {

	public static void main(String[] args) {
		/*
		 * Ejercicio que obtenga todos los m�ltiplos de un n�mero introducido por el
		 * usuario. Se imprimir�n todos los m�ltiplos menores de 100, este ser� el
		 * l�mite.
		 */

		String srt;
		int num, i;

		srt = JOptionPane.showInputDialog("Introduce un n�mero para mostrar todos sus m�ltiplos menores de 100: ");
		num = Integer.parseInt(srt);

		for (i = 1; num < 100; i++) {
			num *= i;
			System.out.println(num);
		}

	}
}
