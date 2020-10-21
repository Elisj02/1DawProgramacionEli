package capitulo3.bloque3;

import javax.swing.JOptionPane;

public class Act2 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio igual al anterior, con la particularidad de imprimir la
		 * media al final del ejercicio, no la suma.
		 */

		String srt;
		int num, suma = 0, media = 0, i = 0;

		do {
			srt = JOptionPane.showInputDialog("Introduce un número. Para salir introduzca el 0: ");
			num = Integer.parseInt(srt);
			suma = suma + num;		
			i++;
		
		} while (num != 0);
		media = suma / (i-1);

		System.out.println("Media de todos los números: " + media);
	}

}
