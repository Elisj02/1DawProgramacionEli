package capitulo2.bloque1;

import javax.swing.JOptionPane;

public class Act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Realiza un ejercicio que pida dos variables al usuario,
tras lo cual, muestre en pantalla el n�mero mayor de los 
dos introducidos.*/
	
		String srt;
		int var1, var2;
		
		srt = JOptionPane.showInputDialog("Introduzca dos n�meros para mostrar el mayor. \nN�mero 1: ");
		var1 = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("N�mero 2: ");
		var2 = Integer.parseInt(srt);
		 
		if (var1 > var2) {
			System.out.println("El n�mero mayor es: " + var1);
		}
		else System.out.println("El n�mero mayor es: " + var2);
	}

}
