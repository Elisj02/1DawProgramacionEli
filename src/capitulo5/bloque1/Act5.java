package capitulo5.bloque1;

public class Act5 {

	public static void main(String[] args) {
		/* Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
		 * Debes mostrar al usuario la suma de los elementos cuyo índice sea par.
		 */

		int num[] = new int[150];
		int sumaindice = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = Utils.obtenerNumeroAzar(0, 100);
			System.out.println(num[i] + " ");
			if (i % 2 == 0) {
				sumaindice = sumaindice + num[i];
			} 
		}
		System.out.println("La suma de los números con índice par del array es de: " + sumaindice);
	}
}