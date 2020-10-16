package capitulo2.bloque3;

import javax.swing.JOptionPane;

public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Realiza una calculadora avanzada, pero con la particularidad de que
las operaciones deben ser raices, potencias y el módulo de la división.*/
	
	String srt;
	double indice, exponente, num, restodiv, divisor, raiz, pot;
	
	srt = JOptionPane.showInputDialog("Introduce un número para realizar la raíz, la potencia y el resto de la división. Número: ");
	num = Double.parseDouble(srt);
	
	srt = JOptionPane.showInputDialog("Introduce el índice de la raíz: ");
	indice = Double.parseDouble(srt);
	
	srt = JOptionPane.showInputDialog("Introduce el exponente de la potencia: ");
	exponente = Double.parseDouble(srt);
	
	srt = JOptionPane.showInputDialog("Introduce un divisor para realizar la división: ");
	divisor = Double.parseDouble(srt);
	
	raiz = Math.pow(num, 1/indice);
	pot = Math.pow(num, exponente);
	restodiv = num % divisor;
	
	System.out.println("El resultado de la raíz es: "+ raiz + "\nEl resultado de la potencia es: " + pot + "\nEl resto de la división es: " + restodiv);
	}

}
