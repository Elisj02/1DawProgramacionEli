package capitulo3.bloque2;

import javax.swing.JOptionPane;

public class Act4 {

	public static void main(String[] args) {
		/*
		 * Reforma el ejercicio anterior, para que el l�mite sea tambi�n introducido por
		 * el usuario.
		 */

		String srt;
		int num, limite, i;

		srt = JOptionPane.showInputDialog("Introduce un l�mite para mostrar los m�ltiplos de un n�mero a elegir: ");
		limite = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("Introduce un n�mero: ");
		num = Integer.parseInt(srt);

		for (i = 1; (num * i) < limite; i++) {
			System.out.println(num * i);
		}
	}

}
