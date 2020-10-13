package capitulo2.bloque1;

import javax.swing.JOptionPane;

public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Repetir el ejercicio anterior para mostrar el número
 menor de los dos introducidos. */


		String srt;
		int var1, var2;
		
		srt = JOptionPane.showInputDialog("Introduzca dos números para mostrar el menor. \nNúmero 1: ");
		var1 = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("Número 2: ");
		var2 = Integer.parseInt(srt);
		 
		if (var1 < var2) {
			System.out.println("El número menor es: " + var1);
		}
		else System.out.println("El número menor es: " + var2);
	}

}
