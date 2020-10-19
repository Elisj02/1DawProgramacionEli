package capitulo3.bloque1;

import javax.swing.JOptionPane;

public class Act1 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida al usuario cuatro números enteros, y calcule la
		 * suma solo de aquellos números introducidos por el usuario, que sean mayores
		 * de 10. Es decir, que si el usuario introduce el 5, el 15, el 6 y el 25, el
		 * programa debe calcular la suma solo de 15 más 25, ya que 5 y 6 son menores de
		 * 10.
		 */

		String srt;
		int num, i, suma = 0;
//para que se realice 4 veces
		for (i = 0; i < 4; i++) {
			srt = JOptionPane.showInputDialog(
					"Introduce cuatro números enteros para realizar la suma de los mayores de 10. Número : ");
			num = Integer.parseInt(srt);

			if (num > 10) {
				suma += num; //suma += num es los mismo que suma = suma + num
			}
		}
		System.out.println("La suma de los mayores de 10 es: " + suma);
	}
}
