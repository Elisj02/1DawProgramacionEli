package capitulo2.bloque1;

import javax.swing.JOptionPane;

public class Act7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Utiliza la operaci�n AND y el operador "if", para tratar de averiguar si un
		 * n�mero introducido por el usuario es par o impar. Ser�a recomendable que
		 * estudiases el c�digo de la clase "OperadoresANivelDeBits" del cap�tulo 1 de
		 * este tutorial.
		 */

		String srt;
		int num;

		srt = JOptionPane.showInputDialog("Introduce un n�mero para determinar si es par o impar: ");
		num = Integer.parseInt(srt);
//num & 1=1 porque los n�meros en binario siempre que acaban en 1 son impares
		if ((num & 1) == 1) {
			System.out.println("El n�mero es impar.");
		} else
			System.out.println("El n�mero es par.");
	}

}
