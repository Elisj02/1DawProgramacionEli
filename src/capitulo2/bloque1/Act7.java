package capitulo2.bloque1;

import javax.swing.JOptionPane;

public class Act7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Utiliza la operación AND y el operador "if", para tratar de averiguar si un
		 * número introducido por el usuario es par o impar. Sería recomendable que
		 * estudiases el código de la clase "OperadoresANivelDeBits" del capítulo 1 de
		 * este tutorial.
		 */

		String srt;
		int num;

		srt = JOptionPane.showInputDialog("Introduce un número para determinar si es par o impar: ");
		num = Integer.parseInt(srt);
//num & 1=1 porque los números en binario siempre que acaban en 1 son impares
		if ((num & 1) == 1) {
			System.out.println("El número es impar.");
		} else
			System.out.println("El número es par.");
	}

}
