package capitulo2.bloque1;

import javax.swing.JOptionPane;

public class Act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Repetir el ejercicio 1� de este bloque de ejercicios, pero pidiendo al
		 * usuario cinco variables. Es decir, se pedir�n al usuario cinco variables y se
		 * mostrar� el mayor valor en pantalla.
		 */

		String srt;
		int var1, var2, var3, var4, var5;

		srt = JOptionPane.showInputDialog("Introduzca cinco n�meros para mostrar el mayor. \nN�mero 1: ");
		var1 = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("N�mero 2: ");
		var2 = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("N�mero 3: ");
		var3 = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("N�mero 4: ");
		var4 = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("N�mero 5: ");
		var5 = Integer.parseInt(srt);

		if (var1 > var2) {
			if (var1 > var3) {
				if (var1 > var4) {
					if (var1 > var5) {

						System.out.println("El n�mero mayor es: " + var1);
					}
				}
			}
		}

		if (var1 < var2) {
			if (var2 > var3) {
				if (var4 < var2) {
					if (var5 < var2) {

						System.out.println("El n�mero mayor es: " + var2);

					}
				}
			}
		}
		if (var1 < var3) {
			if (var2 < var3) {
				if (var4 < var3) {
					if (var5 < var3) {

						System.out.println("El n�mero mayor es: " + var3);

					}
				}
			}
		}
		if (var1 < var4) {
			if (var2 < var4) {
				if (var3 < var4) {
					if (var5 < var4) {

						System.out.println("El n�mero mayor es: " + var4);

					}
				}
			}
		}
		if (var1 < var5) {
			if (var2 < var5) {
				if (var3 < var5) {
					if (var4 < var5) {

						System.out.println("El n�mero mayor es: " + var5);

					}
				}
			}
		}	
	}
}
