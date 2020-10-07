package actividades;

import javax.swing.JOptionPane;

public class act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Realiza un programa que pida al usuario tres números:
//uno de tipo entero, otro de tipo flotante y otro de tipo doble. 
//A continuación se tienen que mostrar en pantalla los tres números
//en una sola fila de la consola de salida.
		
		
		//Declaro las variables
		
		String srt;
		int numentero;
		float numflotante;
		double numdoble; 
		
		//Pido 3 números con srt = JOptionPane.showInputDialog y los guardo en las variables
		
		srt = JOptionPane.showInputDialog("Introduzca un número entero: ");
		numentero = Integer.parseInt(srt);
		
		srt = JOptionPane.showInputDialog("Introduzca un número flotante: ");
		numflotante = Float.parseFloat(srt);
		
		srt = JOptionPane.showInputDialog("Introduzca un número doble: ");
		numdoble = Double.parseDouble(srt);
		
		//Muestro los números que he pedido antes
		System.out.println("El número entero es: " + numentero + " El número flotante es: " + numflotante + " El número doble es: " + numdoble);
	}
	
}
