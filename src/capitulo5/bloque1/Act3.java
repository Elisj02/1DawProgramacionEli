package capitulo5.bloque1;

import javax.swing.JOptionPane;

public class Act3 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar
		 * entre 0 y 100. A continuación pedirás al usuario un valor y buscarás dicho
		 * valor en el array. Si lo encuentras, debes indicar al usuario la posición del
		 * array en que se encuenta. En caso de que no encuentres el valor buscado,
		 * debes indicárselo también al usuario.
		 */

		String srt;
		int valor;
		boolean encontrado = false;

		// declarar el array
		int num[] = new int[150];

		srt = JOptionPane.showInputDialog("Introduce un valor para buscarlo en el array: ");
		valor = Integer.parseInt(srt);

		// inicializar el array y mostrarlo
		for (int i = 0; i < num.length; i++) {
			num[i] = Utils.obtenerNumeroAzar(0, 100);
			System.out.println(num[i] + " ");
			if (valor == num[i]) {
				encontrado = true;
				System.out.println("La posición del valor está en: " + i);
				break;
			}
		}
		if (encontrado != true) {
			System.out.println("No se ha encontrado el valor en el array.");
		}
	}
}