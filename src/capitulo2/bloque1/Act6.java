package capitulo2.bloque1;

import javax.swing.JOptionPane;

public class Act6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un ejercicio en Java que pida un número al usuario e indique en
		 * pantalla si se trata de un número par o impar. Recuerda que un número par es
		 * aquel cuyo resto de su división entre dos sea siempre cero, y recuerda que un
		 * número impar es aquel cuyo resto de su división entre dos sea siempre uno.
		 */

		String srt;

		int num;

		srt = JOptionPane.showInputDialog("Introduzca un número para mostrar si es par o impar: ");
		num = Integer.parseInt(srt);

		if (num % 2 == 0) {
			System.out.println("El número es par");
		}

		if (num % 2 == 1) {
			System.out.println("El número es impar");
		}
	}

}
