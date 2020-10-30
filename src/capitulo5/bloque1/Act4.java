package capitulo5.bloque1;

public class Act4 {

	public static void main(String[] args) {
		/*
		 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar
		 * entre 0 y 100. Debes obtener la suma de los números pares y los impares en
		 * variables separadas.
		 */
		int num[] = new int[150];
		int sumapares = 0, sumaimpares = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = Utils.obtenerNumeroAzar(0, 100);
			System.out.println(num[i] + " ");
			if (num[i] % 2 == 0) {
				sumapares = sumapares + num[i];
			} else {
				sumaimpares = sumaimpares + num[i];
			}
		}
		System.out.println("La suma de los números pares del array es de: " + sumapares
				+ " \nLa suma de los números impares es de: " + sumaimpares);
	}
}