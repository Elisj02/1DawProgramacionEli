package capitulo5.bloque5_Metodos_Y_Arrays;

import capitulo5.bloque1.Utils;

public class Metodo1_StringFromArray {

	public static void main(String[] args) {

		int array[] = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar();
		}
		System.out.println(StringFromArray(array));

	}

	public static String StringFromArray(int array[]) {

		/*
		 * Un m�todo llamado "stringFromArray", que reciba un array de n�meros enteros y
		 * devuelva una cadena de caracteres. El m�todo debe recorrer el array, de la
		 * misma forma en la que har�as para mostrarlo en consola, pero en lugar de
		 * imprimir en consola debes construir un objeto String. Finalmente debes
		 * devolver el String e imprimirlo en el m�todo "main".
		 */

		String str = " ";

		for (int i = 0; i < array.length; i++) {
			str += array[i] + " ";
		}

		return str;
	}

}
