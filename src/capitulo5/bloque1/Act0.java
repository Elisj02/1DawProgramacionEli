package capitulo5.bloque1;

public class Act0 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar
		 * entre 0 y 100. Debes mostrar el array en pantalla y obtener la suma, la
		 * media, el menor y el mayor de todos los números que aparecen en el array.
		 */

		int suma, mayor, menor;
		int num[] = new int[150];

		for (int i = 0; i < num.length; i++) {
			num[i] = Utils.obtenerNumeroAzar();
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
		mayor = num[0];
		menor = num[0];
		suma = num[0];
		// mayor
		for (int i = 1; i < num.length; i++) {
			suma += num[i];
			if (num[i] > mayor) {
				mayor = num[i];
			}
			// menor
			if (num[i] < menor) {
				menor = num[i];
			}
		}
		System.out.println("El mayor es: " + mayor + " .El menor es: " + menor + " .La suma es: " + suma
				+ " .La media es: " + suma / (float) num.length);
	}
}