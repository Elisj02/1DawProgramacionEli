package examenesResueltos.examenHastaArrays.examenB;


/**
 * Crea una clase con un método “main�? que cree un array de 20 posiciones de valores
 * enteros. Los valores enteros deben generarse al azar entre los valores 0 y 40 y no pueden repetirse.
 * Muestra el array.
 *
 */
public class EjercicioF_20_elementos_con_valores_sin_repeticion {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int numeros[] = new int[20]; // Declaración del array
		
		// Recorremos una a una las posiciones del array, seleccionando qué número introduzco
		for (int i = 0; i < numeros.length; i++) {
			int azar; // Este número se declara fuera del do... while para que esté disponible 
						// cuando este acabe.
			boolean numeroYaUtilizado; // Bandera que indica que el número al azar seleccionado
										// ya está ocupado en valores inferiores de "i".
			// El do...while tiene como objetivo encontrar un valor, al azar, que no esté ocupado
			// en valores anteriores a la "i".
			do {
				numeroYaUtilizado = false; // Pienso que el número no está ocupado e intento rebatirlo
				azar = (int) Math.round(Math.random() * 40); // Obtengo un número al azar.
				// Intento encontrar el número al azar en los valores, del array, con índice inferior a "i"
				for (int j = 0; j < i; j++) {
					if (azar == numeros[j]) {
						numeroYaUtilizado = true; // Si encuentro el número, levanto la bandera
					}
				}
			} while (numeroYaUtilizado == true); // Si el número ya se utiliza, se debe repetir el bucle
			
			// Al salir del bucle do...while, sé que el número "azar" se puede utilizar, no está utilizado
			numeros[i] = azar;
		}
		
		// Muestro el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

}
