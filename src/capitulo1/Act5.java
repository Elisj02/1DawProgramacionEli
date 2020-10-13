package capitulo1;

import javax.swing.JOptionPane;

public class Act5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Realiza un programa en Java que pida dos variables al usuario,
//intercambie los valores de las dos variables y las muestre
//en pantalla ANTES y DESPUÈS del intercambio de valores.

		String srt;
		int var1, var2, var3;

		srt = JOptionPane
				.showInputDialog("Introduzca dos variables para que se intercambien los valores. \nVariable 1: ");

		var1 = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("Variable 2: ");

		var2 = Integer.parseInt(srt);

		var3 = var2;
		var2 = var1;

		System.out.println("La variable 1 es: " + var3 + " y la variable 2 es: " + var2);
	}

}
