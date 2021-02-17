package capitulo5.bloque5_Metodos_Y_Arrays;

public class Metodo2_FindAndReplace {

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
		 * Un m�todo llamado "findAndReplace", que reciba: - Un array de n�meros
		 * enteros. - Un valor entero que debe buscarse en el array. - Un valor entero
		 * que debe servir para reemplazar.
		 * 
		 * El m�todo buscar� todas las ocasiones en las que el segundo par�metro
		 * aparezca dentro del array y reemplazar� ese valor con el valor del tercer
		 * par�metro.
		 * 
		 * El m�todo main debe crear un array, imprimirlo en consola, llamar al m�todo
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
