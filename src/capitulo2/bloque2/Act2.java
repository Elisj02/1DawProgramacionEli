package capitulo2.bloque2;

import javax.swing.JOptionPane;

public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realiza un ejercicio igual al anterior, pero con las dos siguientes
		 * diferencias: no existe la categor�a de n�meros negativos, por tanto si el
		 * usuario introduce un negativo, el programa debe terminar; la otra diferencia
		 * es que, al acabar, el programa no debe mostrar la suma de los n�meros, sino
		 * cuantos han entrado en cada categor�a. A esto se llema contadores, a
		 * diferencia del ejercicio anterior, que reciben el nombre de acumuladores.
		 */

		String srt;
		int numbaj = 0, nummed = 0, numgr = 0;
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

		if (num1 >= 0 && num1 <= 25) {
			numbaj = numbaj + 1;
		}
		if (num2 >= 0 && num2 <= 25) {
			numbaj = numbaj + 1;
		}
		if (num3 >= 0 && num3 <= 25) {
			numbaj = numbaj + 1;
		}
		if (num4 >= 0 && num4 <= 25) {
			numbaj = numbaj + 1;
		}
		if (num5 >= 0 && num5 <= 25) {
			numbaj = numbaj + 1;
		}
		if (num1 >= 26 && num1 <= 250) {
			nummed = nummed + 1;
		}
		if (num2 >= 26 && num2 <= 250) {
			nummed = nummed + 1;
		}
		if (num3 >= 26 && num3 <= 250) {
			nummed = nummed + 1;
		}
		if (num4 >= 26 && num4 <= 250) {
			nummed = nummed + 1;
		}
		if (num5 >= 26 && num5 <= 250) {
			nummed = nummed + 1;
		}
		if (num1 > 250) {
			numgr = numgr + 1;
		}
		if (num2 > 250) {
			numgr = numgr + 1;
		}
		if (num3 > 250) {
			numgr = numgr + 1;
		}
		if (num4 > 250) {
			numgr = numgr + 1;
		}
		if (num5 > 250) {
			numgr = numgr + 1;
		}
		System.out.println("N�meros bajos introducidos: " + numbaj + " \nN�meros medios introducidos: " + nummed
				+ " \nN�meros grandes introducidos: " + numgr);
	}
}
