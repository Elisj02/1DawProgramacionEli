package capitulo6_Recursos;

import javax.swing.JOptionPane;

public class Ecuaciones2Grado {

	public static void main(String[] args) {
		// Crear un programa que resuelva ecuaciones de segundo grado con una incógnita.
		// El programa debe pedir los parámetros a, b y c de la ecuación, e imprimir, en
		// caso de que las haya, la solución o soluciones de la ecuación.

		int a, b, c;
		double formula1, formula2;
		String str;
		
		str = JOptionPane.showInputDialog("Vamos a realizar la ecuación de segundo grado. Introduce el parámetro A:");
		a = Integer.parseInt(str); //1
		
		str = JOptionPane.showInputDialog("Introduce el parámetro B:");
		b = Integer.parseInt(str); //3
		
		str = JOptionPane.showInputDialog("Vamos a realizar la ecuación de segundo grado. Introduce el parámetro C:");
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
