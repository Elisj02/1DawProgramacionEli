package capitulo5.bloque2;

import javax.swing.JOptionPane;

import capitulo5.bloque1.Utils;

public class Act3 {

	public static void main(String[] args) {
		/* Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		 * Debes conseguir multiplicar cada uno de los elementos del array por un número determinado, 
		 * pedido al usuario.
		 */

		String srt;
		int multi;
		
		srt = JOptionPane.showInputDialog("Introduce un número para multiplicar el array por él: ");
		multi = Integer.parseInt(srt);
		
		int num[] = new int[150];

		for (int i = 0; i < num.length; i++) {
			num[i] = Utils.obtenerNumeroAzar(0, 100);
			System.out.println("Array sin multiplicar: " + num[i]);
			num[i] = num[i] * multi;
			System.out.println("Array multiplicado: " + num[i]);
		}
		
	}

}
