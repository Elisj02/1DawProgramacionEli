package capitulo5.bloque5_Métodos_Y_Arrays;

public class Método2_FindAndReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[] { 1, 22, 8, 64, 18 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println(" ");
		FindAndReplace(array, 8, 20);

	}

	public static void FindAndReplace(int array[], int valor, int aux) {

		/*
		 * Un método llamado "findAndReplace", que reciba: - Un array de números
		 * enteros. - Un valor entero que debe buscarse en el array. - Un valor entero
		 * que debe servir para reemplazar.
		 * 
		 * El método buscará todas las ocasiones en las que el segundo parámetro
		 * aparezca dentro del array y reemplazará ese valor con el valor del tercer
		 * parámetro.
		 * 
		 * El método main debe crear un array, imprimirlo en consola, llamar al método
		 * "findAndReplace" y volver a imprimir el array en consola.
		 */

		for (int i = 0; i < array.length; i++) {
			if (array[i] == valor) {
				array[i] = aux;

			}
			System.out.print(array[i] + " ");	

		}
}
}
