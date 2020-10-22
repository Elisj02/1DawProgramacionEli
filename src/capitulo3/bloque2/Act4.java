package capitulo3.bloque2;

import javax.swing.JOptionPane;

public class Act4 {

	public static void main(String[] args) {
		/*
		 * Reforma el ejercicio anterior, para que el límite sea también introducido por
		 * el usuario.
		 */

		String srt;
		int num, limite, i;

		srt = JOptionPane.showInputDialog("Introduce un límite para mostrar los múltiplos de un número a elegir: ");
		limite = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("Introduce un número: ");
		num = Integer.parseInt(srt);

		for (i = 1; (num * i) < limite; i++) {
			System.out.println(num * i);
		}
	}

}
