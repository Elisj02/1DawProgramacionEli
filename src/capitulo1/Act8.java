package capitulo1;

import javax.swing.JOptionPane;

public class Act8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Realiza un programa en C que pida al usuario tres
 n�meros enteros, y localice e imprima en pantalla el
 mayor y el menor de los tres introducidos. */

	String srt;
	int num1, num2, num3;
		
srt = JOptionPane.showInputDialog("Introduce 3 n�meros enteros para determinar"
+ " cu�l es el mayor y el menor. \nN�mero 1: ");
num1 = Integer.parseInt(srt);

srt = JOptionPane.showInputDialog("N�mero 2: ");
num2 = Integer.parseInt(srt);

srt = JOptionPane.showInputDialog("N�mero 3: ");
num3 = Integer.parseInt(srt);
	
	if (num1 > num2) {
		if (num1 > num3) {
		System.out.println("El n�mero " + num1 + " es el mayor de los tres.");
	}
	else System.out.println("El n�mero " + num3 + " es el mayor de los tres.");
	}
	else if (num2 > num3) {
		System.out.println("El n�mero " + num2 + " es el mayor de los tres.");	
	
	}
	else System.out.println("El n�mero " + num3 + " es el mayor de los tres.");
	}
}
