package capitulo2.bloque2;

import javax.swing.JOptionPane;

public class Act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza un ejercicio que acumule cinco n�meros introducidos por el usuario,
		 * es decir, que sume las cantidades introducidas, pero realizando cuatro
		 * categor�as: n�meros negativos, n�meros bajos (entre 0 y 25, ambos inclusive),
		 * n�meros medios (entre 26 y 250, ambos inclusie) y n�meros grandes (mayores de
		 * 250). Al finalizar el programa, se debe mostrar el total de las sumas de los
		 * n�meros introducidos en cada una de las categor�as.
		 */

		String srt;
		int numneg = 0, numbaj = 0, nummed = 0, numgr = 0;
		int num1, num2, num3, num4, num5;

		srt = JOptionPane.showInputDialog("Introduce 5 n�meros. \nN�mero 1: ");
		num1 = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("\nN�mero 2: ");
		num2 = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("\nN�mero 3: ");
		num3 = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("\nN�mero 4: ");
		num4 = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("\nN�mero 5: ");
		num5 = Integer.parseInt(srt);

// ponerlos en categor�as

		if (num1 < 0) {
			numneg = numneg + num1;
		}
		if (num2 < 0) {
			numneg = numneg + num2;
		}
		if (num3 < 0) {
			numneg = numneg + num3;
		}
		if (num4 < 0) {
			numneg = numneg + num4;
		}
		if (num5 < 0) {
			numneg = numneg + num5;
		}

		if (num1 >= 0 && num1 <= 25) {
			numbaj = numbaj + num1;
		}
		if (num2 >= 0 && num2 <= 25) {
			numbaj = numbaj + num2;
		}
		if (num3 >= 0 && num3 <= 25) {
			numbaj = numbaj + num3;
		}
		if (num4 >= 0 && num4 <= 25) {
			numbaj = numbaj + num4;
		}
		if (num5 >= 0 && num5 <= 25) {
			numbaj = numbaj + num5;
		}
		if (num1 >= 26 && num1 <= 250) {
			nummed = nummed + num1;
		}
		if (num2 >= 26 && num2 <= 250) {
			nummed = nummed + num2;
		}
		if (num3 >= 26 && num3 <= 250) {
			nummed = nummed + num3;
		}
		if (num4 >= 26 && num4 <= 250) {
			nummed = nummed + num4;
		}
		if (num5 >= 26 && num5 <= 250) {
			nummed = nummed + num5;
		}
		if (num1 > 250) {
			numgr = numgr + num1;
		}
		if (num2 > 250) {
			numgr = numgr + num2;
		}
		if (num3 > 250) {
			numgr = numgr + num3;
		}
		if (num4 > 250) {
			numgr = numgr + num4;
		}
		if (num5 > 250) {
			numgr = numgr + num5;
		}
		System.out.println("La suma de los n�meros introducidos negativos es: " + numneg
				+ ". \nLa suma de los n�meros bajos introducidos es: " + numbaj
				+ ". \nLa suma de los n�meros medios introducidos es: " + nummed
				+ ". \nLa suma de los n�meros grandes introducidos es: " + numgr);
	}
}
