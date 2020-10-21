package capitulo3.bloque3;

import javax.swing.JOptionPane;

public class Act1 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que pida números al usuario. El programa debe detenerse
		 * cuando el usuario introduzca el número 0 (cero), que no debe tenerse en
		 * cuenta para ninguna operación aritmética, simplemente para salir de la
		 * aplicación. Cuando el programa haya terminado, se debe sacar en pantalla el
		 * valor de la suma de todos los números.
		 */
		String srt;
		int num, suma = 0;

		do {
			srt = JOptionPane.showInputDialog("Introduce un número. Para salir introduzca el 0: ");
			num = Integer.parseInt(srt);
			suma += num;
		} while (num != 0);
		System.out.println("Suma de todos los números: " + suma);
	}

}
