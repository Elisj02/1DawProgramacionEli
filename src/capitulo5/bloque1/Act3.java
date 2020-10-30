package capitulo5.bloque1;

import javax.swing.JOptionPane;

public class Act3 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar
		 * entre 0 y 100. A continuaci�n pedir�s al usuario un valor y buscar�s dicho
		 * valor en el array. Si lo encuentras, debes indicar al usuario la posici�n del
		 * array en que se encuenta. En caso de que no encuentres el valor buscado,
		 * debes indic�rselo tambi�n al usuario.
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
				System.out.println("La posici�n del valor est� en: " + i);
				break;
			}
		}
		if (encontrado != true) {
			System.out.println("No se ha encontrado el valor en el array.");
		}
	}
}