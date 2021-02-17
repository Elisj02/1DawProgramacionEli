package capitulo5.bloque5_Metodos_Y_Arrays;

public class Metodo5_RemoveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[] { 1, 2, 3, 4, 7, 5, 6, 7, 7 };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		int array3[] = removeInteger(array, 7);
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}

	}

	public static int[] removeInteger(int array[], int valor) {

		/*
		 * Realiza un m�todo llamado "removeInteger", que reciba: - Un array de n�meros
		 * enteros. - Un valor entero. Si el valor entero recibido como segundo
		 * par�metro existe dentro del array recibido como primer par�metro, debes
		 * conseguir que ese valor desaparezca del array. Puedes seguir la siguiente
		 * gu�a: - Utiliza el m�todo del ejercicio 4 para saber cu�ntas veces aparece el
		 * valor entero (segundo par�metro) dentro del array (primer par�metro). - Crea
		 * un nuevo array, que tenga la dimensi�n del array recibido como primer
		 * par�metro menos la cantidad de veces que el valor entero del segundo
		 * par�metro aparezca en dicho array. - Copia todos los elementos del array
		 * recibido como primer par�metro, dentro del nuevo array creado por ti en el
		 * m�todo. L�gicamente no debes copiar en el array los valores del primer array
		 * que coincidan con el valor introducido como segundo par�metro. - Devuelve el
		 * nuevo array. El m�todo debe devolver "int[]". El m�todo main debe recoger el
		 * nuevo array creado e imprimir en consola.
		 */

		int aux = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == valor) {
				aux++;
			}
		}

		System.out.println(" ");

		int array2[] = new int[array.length - aux];
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != valor) {
				array2[j] = array[i];
				j++;
			}

		}
		return array2;
	}
}
