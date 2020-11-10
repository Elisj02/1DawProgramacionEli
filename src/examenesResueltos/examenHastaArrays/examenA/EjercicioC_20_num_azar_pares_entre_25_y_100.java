package examenesResueltos.examenHastaArrays.examenA;

/**
 * Crea una clase con un método “main�? que cree un array de 20. Debes rellenar el array con
números generados al azar, pares, mayores de 25 y menores de 100.
 */
public class EjercicioC_20_num_azar_pares_entre_25_y_100 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int numeros[] = new int[20]; // Declaro el array
		
		// Recorro el array, buscando números que cumplan las condiciones determinadas
		for (int i = 0; i < numeros.length; i++) {
			// El bucle do...while se repetirá hasta que se encuentre un número par
			do {
				numeros[i] = (int) Math.round(Math.random() * (100 - 25) + 25);
			} while (!(numeros[i] % 2 == 0));
		}
		
		// Recorro e imprimo el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

}
