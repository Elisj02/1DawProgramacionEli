package actividades;

import javax.swing.JOptionPane;

public class act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Realiza un programa que pida al usuario tres n�meros:
//uno de tipo entero, otro de tipo flotante y otro de tipo doble. 
//A continuaci�n se tienen que mostrar en pantalla los tres n�meros
//en una sola fila de la consola de salida.
		
		
		//Declaro las variables
		
		String srt;
		int numentero;
		float numflotante;
		double numdoble; 
		
		//Pido 3 n�meros con srt = JOptionPane.showInputDialog y los guardo en las variables
		
		srt = JOptionPane.showInputDialog("Introduzca un n�mero entero: ");
		numentero = Integer.parseInt(srt);
		
		srt = JOptionPane.showInputDialog("Introduzca un n�mero flotante: ");
		numflotante = Float.parseFloat(srt);
		
		srt = JOptionPane.showInputDialog("Introduzca un n�mero doble: ");
		numdoble = Double.parseDouble(srt);
		
		//Muestro los n�meros que he pedido antes
		System.out.println("El n�mero entero es: " + numentero + " El n�mero flotante es: " + numflotante + " El n�mero doble es: " + numdoble);
	}
	
}
