package examenesResueltos.examenHastaArrays.examenA;

/**
 * Crea una clase con un método “main�? que cree un array de 5 posiciones con números
generados al azar entre 0 y 100. Muestra el array. Crea un nuevo array de 5 posiciones en el que
copies los números del primer array en posiciones aleatorias del segundo array. 
 */
public class EjercicioF_Array_5_elementos_pasan_desordenados_a_otro_array {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int longitudArrays = 5; // Declaro en un único lugar la longitud de los dos arrays
		int original[] = new int[longitudArrays];
		int transformado[] = new int[longitudArrays];
		
		// Recorro los dos arrays, en el original meto valores al azar entre 0 y 100.
		// En el transformado meto valores -1. Estos valores actúan como banderas.
		for (int i = 0; i < original.length; i++) {
			original[i] = (int) Math.round(Math.random() * 100);
			transformado[i] = -1;
		}

		// Muestro el array original, elemento por elemento.
		for (int i = 0; i < original.length; i++) {
			System.out.print(original[i] + " ");
		}
		System.out.println("");
		
		// Recorro el array original. Para cada elemento buscaré un lugar del array "transformado"
		// en el que haya un valor -1, al azar.  Cuando lo encuentre insertaré el valor de array[i]
		for (int i = 0; i < original.length; i++) {
			int indiceAzar; // Lo declaro aquí para que esté disponible al acabar el bucle
			// Bucle para generar índices al azar, hasta que transformado[indiceAzar] contenga un valor
			// -1, indicando que esa "casilla" se encuentra libre.
			do {
				indiceAzar = (int) Math.round(Math.random() * (longitudArrays-1));
			} while (transformado[indiceAzar] != -1);
			// Al terminar el bucle, sé que "indiceAzar" contiene una posición libre del array transformado
			transformado[indiceAzar] = original[i];
		}

		// Imprimo en consola el array "transformado".
		for (int i = 0; i < transformado.length; i++) {
			System.out.print(transformado[i] + " ");
		}
		System.out.println("");
	
	}

}
