package capitulo5.bloque1;

import javax.swing.JOptionPane;

public class Act1 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar
		 * entre un límite inferior y uno superior que debe especificar el usuario.
		 * Debes mostrar el array en pantalla para comprobar el funcionamiento
		 */

		String srt;
		int min, max;

		srt = JOptionPane.showInputDialog("Introduce un límite. Inferior: ");
		min = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("Superior: ");
		max = Integer.parseInt(srt);

		int num[] = new int[150];

		// utils para obtener un número al azar en el array
		for (int i = 0; i < num.length; i++) {
			num[i] = Utils.obtenerNumeroAzar(min, max);
			System.out.println(num[i] + " ");

		}
	}

}