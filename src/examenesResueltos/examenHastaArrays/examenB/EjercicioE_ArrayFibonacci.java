package examenesResueltos.examenHastaArrays.examenB;


/**
 * Crea una clase con un método “main�? que cree un array con 20 elementos de longitud.
Los elementos deben ser valores enteros que coincidan con la serie de Fibonacci. Recuerda que la
serie comienza con los valores “1, 1, 2, 3, 5, 8, 13….�?. Cada valor es la suma de los dos anteriores.
Para que te sea más sencillo puedes inicializar los dos primeros elementos al valor “1�? y comenzar el
algoritmo de relleno de los valores a partir del tercer elemento. Muestra el array.
 *
 */
public class EjercicioE_ArrayFibonacci {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int numeros[] = new int[20]; // Declaro el array
		
		// Los dos primeros números de Fibonacci se indican explicitamente
		numeros[0] = 1;
		numeros[1] = 1;
		// Recorro el array desde la posición "2", calculando cada número como la suma de los dos
		// anteriores
		for (int i = 2; i < numeros.length; i++) {
			numeros[i] = numeros[i-1] + numeros[i-2];
		}
		
		// Imprimo el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

}
