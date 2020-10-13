package capitulo1;

import javax.swing.JOptionPane;

public class Act8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Realiza un programa en C que pida al usuario tres
 números enteros, y localice e imprima en pantalla el
 mayor y el menor de los tres introducidos. */

	String srt;
	int num1, num2, num3;
		
srt = JOptionPane.showInputDialog("Introduce 3 números enteros para determinar"
+ " cuál es el mayor y el menor. \nNúmero 1: ");
num1 = Integer.parseInt(srt);

srt = JOptionPane.showInputDialog("Número 2: ");
num2 = Integer.parseInt(srt);

srt = JOptionPane.showInputDialog("Número 3: ");
num3 = Integer.parseInt(srt);
	
	if (num1 > num2) {
		if (num1 > num3) {
		System.out.println("El número " + num1 + " es el mayor de los tres.");
	}
	else System.out.println("El número " + num3 + " es el mayor de los tres.");
	}
	else if (num2 > num3) {
		System.out.println("El número " + num2 + " es el mayor de los tres.");	
	
	}
	else System.out.println("El número " + num3 + " es el mayor de los tres.");
	}
}
