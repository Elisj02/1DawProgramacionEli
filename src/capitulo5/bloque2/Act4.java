package capitulo5.bloque2;

import capitulo5.bloque1.Utils;

public class Act4 {

	public static void main(String[] args) {
		/* Realiza un ejercicio en que inicialice un array de 5 elementos enteros al azar entre 0 y 100. 
		 * Debes conseguir que se desplacen los n�meros un lugar a su derecha, de manera que el 
		 * desplazamiento sea circular, si un n�mero sale por la derecha volver� a entrar por la
		 * izquierda. Ejemplo: 1 2 3 4 5 pasa a ser 5 1 2 3 4 que pasa a ser 4 5 1 2 3.
		 */

			int num[] = new int [5];
			int i, aux;
		
		for (i = 0; i < num.length; i++) {
			num[i] = Utils.obtenerNumeroAzar(0, 100);
			System.out.println("Array sin intercambiar: " + num[i]);
		}
			
			//El �ltimo lo guardo en aux
			aux = num[num.length-1];
			
			//desplazo todos los elementos a la derecha dejando la posici�n 0 vac�a
			for (i = num.length-1; i > 0; i--) {
				num[i] = num[i-1];
			}
			//El �ltimo pasa a la posici�n 0
			num[0] = aux;
			
			for (i = 0; i < num.length; i++) {
			System.out.println("Array intercambiado: " + num[i]);

			}
		

	}
}


