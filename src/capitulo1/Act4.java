package capitulo1;

import javax.swing.JOptionPane;

public class Act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Realiza un programa que muestre la media
//de tres números introducidos.

		String srt;
		int num1, num2, num3, media;

		srt = JOptionPane.showInputDialog("Introduzca 3 números para hacer la media. \nNúmero 1: ");

		num1 = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("Número 2: ");

		num2 = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("Número 3: ");

		num3 = Integer.parseInt(srt);

		media = (num1 + num2 + num3) / 2;

		System.out.println("La media de los 3 números es: " + media);
	}

}
