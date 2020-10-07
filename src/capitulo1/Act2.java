package capitulo1;

import javax.swing.JOptionPane;

public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Realiza un programa igual al anterior, con la particularidad de que ahora 
//se debe mostrar cada número justo a continuación del momento en que ha sido introducido.
	
	//Declaro las variables
		
		String srt;
		int numentero;
		float numflotante;
		double numdoble; 
		
		//Pido 3 números con srt = JOptionPane.showInputDialog y los guardo en las variables. Después los muestro.
		
		srt = JOptionPane.showInputDialog("Introduzca un número entero: ");
		numentero = Integer.parseInt(srt);
		System.out.println("El número entero es: " + numentero);
		
		srt = JOptionPane.showInputDialog("Introduzca un número flotante: ");
		numflotante = Float.parseFloat(srt);
		System.out.println("El número flotante es: " + numflotante);
		
		srt = JOptionPane.showInputDialog("Introduzca un número doble: ");
		numdoble = Double.parseDouble(srt);
		System.out.println("El número doble es: " + numdoble);

}
}