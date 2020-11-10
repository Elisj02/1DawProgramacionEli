package examenesResueltos.examenHastaArrays.examenA;

import capitulo5.bloque1.Utils;

/**
 * Crea una clase con un método “main�? que cree un array de 100 elementos enteros creados
al azar. Debes mostrar el array. A continuación debes detectar, y sacar en pantalla, todos los números
que acaben en un valor de una sola cifra que debes pedir al usuario.
 */
public class EjercicioE_100_num_azar_terminan_en_un_cifra {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int numeros[] = new int[100]; // Declaro el elemento
		
		// Recorro el elemento y asigno elementos al azar entre 0 y 100
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100);
		}

		// Pido un número de una única cifra.
		System.out.println("Introduzca un número de una sola cifra: ");
		int cifra = Utils.obtenerEnteroPorScanner();
		
		System.out.println("Números del array que terminan en la cifra " + cifra);
		// Si el valor del número, dividido entre 10, arroja un resto igual a la cifra introducida
		// por el usuario, el número acaba en dicha cifra.
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 10 == cifra) {
				System.out.println("El número " + numeros[i] + " termina en la cifra " + cifra);
			}
		}
	}

}
