package capitulo2.bloque1;

import javax.swing.JOptionPane;

public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Repetir el ejercicio anterior para mostrar el n�mero
 menor de los dos introducidos. */


		String srt;
		int var1, var2;
		
		srt = JOptionPane.showInputDialog("Introduzca dos n�meros para mostrar el menor. \nN�mero 1: ");
		var1 = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("N�mero 2: ");
		var2 = Integer.parseInt(srt);
		 
		if (var1 < var2) {
			System.out.println("El n�mero menor es: " + var1);
		}
		else System.out.println("El n�mero menor es: " + var2);
	}

}
