package capitulo1;

import javax.swing.JOptionPane;

public class Act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Realiza un programa que pida al usuario tres números
//y calcule y muestre en pantalla la suma de los tres.

		String srt;
		int num1, num2, num3, suma;

		srt = JOptionPane.showInputDialog("Introduzca tres números para que se realice su suma. Número 1: ");

		num1 = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("Número 2: ");

		num2 = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("Número 3: ");

		num3 = Integer.parseInt(srt);

		suma = num1 + num2 + num3;

		System.out.println("La suma de los tres números es: " + suma);

	}

}
