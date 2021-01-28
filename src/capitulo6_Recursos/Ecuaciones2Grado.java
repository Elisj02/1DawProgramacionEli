package capitulo6_Recursos;

import javax.swing.JOptionPane;

public class Ecuaciones2Grado {

	public static void main(String[] args) {
		// Crear un programa que resuelva ecuaciones de segundo grado con una inc�gnita.
		// El programa debe pedir los par�metros a, b y c de la ecuaci�n, e imprimir, en
		// caso de que las haya, la soluci�n o soluciones de la ecuaci�n.

		int a, b, c;
		double formula1, formula2;
		String str;
		
		str = JOptionPane.showInputDialog("Vamos a realizar la ecuaci�n de segundo grado. Introduce el par�metro A:");
		a = Integer.parseInt(str); //1
		
		str = JOptionPane.showInputDialog("Introduce el par�metro B:");
		b = Integer.parseInt(str); //3
		
		str = JOptionPane.showInputDialog("Vamos a realizar la ecuaci�n de segundo grado. Introduce el par�metro C:");
		c = Integer.parseInt(str); //2
		
		double raiz;
		
		double denominador;
		
		denominador = 2 * a;
		
		raiz = Math.sqrt((Math.pow(b, 2))-4*a*c);
		
		formula1 = (-b + raiz ) / denominador;
		
		formula2 = (-b - raiz ) / denominador;
		
		System.out.println("El resultado es: " + formula1 + " y por el negativo: " + formula2);
				
	}

}
