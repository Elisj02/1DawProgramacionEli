package capitulo1;

import javax.swing.JOptionPane;

public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Realiza un programa igual al anterior, con la particularidad de que ahora 
//se debe mostrar cada n�mero justo a continuaci�n del momento en que ha sido introducido.
	
	//Declaro las variables
		
		String srt;
		int numentero;
		float numflotante;
		double numdoble; 
		
		//Pido 3 n�meros con srt = JOptionPane.showInputDialog y los guardo en las variables. Despu�s los muestro.
		
		srt = JOptionPane.showInputDialog("Introduzca un n�mero entero: ");
		numentero = Integer.parseInt(srt);
		System.out.println("El n�mero entero es: " + numentero);
		
		srt = JOptionPane.showInputDialog("Introduzca un n�mero flotante: ");
		numflotante = Float.parseFloat(srt);
		System.out.println("El n�mero flotante es: " + numflotante);
		
		srt = JOptionPane.showInputDialog("Introduzca un n�mero doble: ");
		numdoble = Double.parseDouble(srt);
		System.out.println("El n�mero doble es: " + numdoble);

}
}