package capitulo3.bloque3;

import javax.swing.JOptionPane;

public class Act1 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que pida n�meros al usuario. El programa debe detenerse
		 * cuando el usuario introduzca el n�mero 0 (cero), que no debe tenerse en
		 * cuenta para ninguna operaci�n aritm�tica, simplemente para salir de la
		 * aplicaci�n. Cuando el programa haya terminado, se debe sacar en pantalla el
		 * valor de la suma de todos los n�meros.
		 */
		String srt;
		int num, suma = 0;

		do {
			srt = JOptionPane.showInputDialog("Introduce un n�mero. Para salir introduzca el 0: ");
			num = Integer.parseInt(srt);
			suma += num;
		} while (num != 0);
		System.out.println("Suma de todos los n�meros: " + suma);
	}

}
