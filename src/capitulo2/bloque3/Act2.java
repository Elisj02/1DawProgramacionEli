package capitulo2.bloque3;

import javax.swing.JOptionPane;

public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Realiza una calculadora avanzada, pero con la particularidad de que
las operaciones deben ser raices, potencias y el m�dulo de la divisi�n.*/
	
	String srt;
	double indice, exponente, num, restodiv, divisor, raiz, pot;
	
	srt = JOptionPane.showInputDialog("Introduce un n�mero para realizar la ra�z, la potencia y el resto de la divisi�n. N�mero: ");
	num = Double.parseDouble(srt);
	
	srt = JOptionPane.showInputDialog("Introduce el �ndice de la ra�z: ");
	indice = Double.parseDouble(srt);
	
	srt = JOptionPane.showInputDialog("Introduce el exponente de la potencia: ");
	exponente = Double.parseDouble(srt);
	
	srt = JOptionPane.showInputDialog("Introduce un divisor para realizar la divisi�n: ");
	divisor = Double.parseDouble(srt);
	
	raiz = Math.pow(num, 1/indice);
	pot = Math.pow(num, exponente);
	restodiv = num % divisor;
	
	System.out.println("El resultado de la ra�z es: "+ raiz + "\nEl resultado de la potencia es: " + pot + "\nEl resto de la divisi�n es: " + restodiv);
	}

}
