package capitulo5.bloque1;

public class Act2 {

	public static void main(String[] args) {
		/* Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
		 * Después de su inicialización debéis imprimir el array en orden inverso.
		 */
		
		
		int num[] = new int[150];

		for (int i = 0; i < num.length; i++) {
			num[i] = Utils.obtenerNumeroAzar(0, 100);
			System.out.println("Orden normal: " + num[i]);

		}
		//para mostrar el array en orden inverso
		for (int i = num.length-1 ; i >= 0; i-- ) {
			System.out.println("Orden inverso: " + num[i]);
		}
	}

}