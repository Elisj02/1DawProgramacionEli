package examenesResueltos.examenHastaArrays.examenB;

/**
 * Crea una clase con un método “main�? que cree un array de 100 elementos. Todos los
elementos deben tener valor “0�?. Al azar debes introducir 10 números “1�? en cualquier parte del array.
Muestra el array.
 */
public class EjercicioD_100_elementos_0_con_10_elementos_1_al_azar {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int numeros[] = new int[100]; // Declaro el array
		
		// Recorro el array, iniciando todos sus valores a "cero".
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = 0;
		}
		
		// Voy a insertar 10 veces el valor 1, así que repito algo 10 veces, bucle for
		for (int i = 0; i < 10; i++) {
			int indiceAzar; // declaro aquí la variable para que esté disponible después del bucle
			// El objetivo del bucle es encontrar un índice del array cuyo elemento no contenga el 
			// valor "1".
			do {
				indiceAzar = (int) Math.round(Math.random() * (numeros.length - 1));
			} while (numeros[indiceAzar] == 1);
			
			// Al terminar el bucle, sé que el "indiceAzar" apunta a un elemento con valor "0".
			numeros[indiceAzar] = 1;
		}
		
		// Recorro e imprimo el array.
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

}
