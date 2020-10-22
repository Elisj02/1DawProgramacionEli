package capitulo3.bloque3;

import javax.swing.JOptionPane;

public class Act3 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que pida números al usuario hasta que este introduzca el
		 * 0 (cero). Al finalizar el ejercicio se debe imprimir en pantalla el valor
		 * mayor introducido. El valor 0 (cero) no debe tenerse en cuenta.
		 */

		String srt;
		int num = -1, i, mayor = 0;
		
		for (i = 0; num != 0; i++) {
			srt = JOptionPane.showInputDialog("Introduce un número. 0 para acabar: ");
			num = Integer.parseInt(srt);
			
			if (i == 0) {
				mayor = num;
			}
			else {
				if (num > mayor && num != 0) {
					mayor = num;
				}
			}
		}
		System.out.println("El mayor es: " + mayor);
}
}