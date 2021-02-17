package capitulo5.bloque5_Metodos_Y_Arrays;

public class Metodo3_AddInteger {

	public static void main(String[] args) {

		int array[] = new int[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println(addInteger(array, 5));
	}

	public static int[] addInteger(int[] array, int valor) {

		/*
		 * Realiza un m�todo llamado "addInteger", que reciba: -Un array de n�meros
		 * enteros. -Un valor entero. Dentro del m�todo debes: -Crear un nuevo array,
		 * cuya longitud sea la del array recibido como primer par�metro + 1. -Copiar el
		 * array del primer par�metro en el array creado dentro del m�todo, elemento
		 * tras elemento. -Agregar el nuevo elemento al final del nuevo array. -Asignar,
		 * al array recibido mediante el primer par�metro, el puntero al nuevo array
		 * creado en el interior del m�todo. -El m�todo debe devolver un array de tipo
		 * entero. Main debe recoger el array devuelto e imprimirlo en consola.
		 */

		int array2[] = new int[array.length + 1];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = array[i];
		}
		array2[array2.length - 1] = valor;

		return array2;
	}
}
