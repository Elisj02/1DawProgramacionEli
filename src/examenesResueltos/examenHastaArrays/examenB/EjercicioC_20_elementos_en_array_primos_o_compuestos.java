package examenesResueltos.examenHastaArrays.examenB;

/**
 * Crea una clase con un método “main�? que cree rellene un array de 20 elementos de tipo
entero. Para cada elemento del array debes comprobar, y mostrar en pantalla, si se trata de un número
primo o compuesto.
 */
public class EjercicioC_20_elementos_en_array_primos_o_compuestos {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int numeros[] = new int[20]; // Declaro el array
		
		// Recorro el array, asignando valores al azar entreo 0 y 100
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
		}
		
		// Recorro el array, comprobando si cada elemento es un número primo
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Comprobando si es primo " + numeros[i]);
			boolean esPrimo = true; // Utilizo una bandera, asumiendo que el número es primo
			// En el bucle siguiente intento demostrar que hay algún divisor del número.
			for (int j = 2; j < numeros[i] - 1; j++) {
				if (numeros[i] % j == 0) { // j es divisor de numeros[i]
					esPrimo = false; // Bajo la bandera, no hay primo
				}
			}
			// Si salimos del bucle con la bandera arriba, el número es primo
			if (esPrimo == true) {
				System.out.println("    Es primo");
			}
		}
	}

}
