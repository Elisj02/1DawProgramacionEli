package capitulo5.bloque6_matrices;

import capitulo5.bloque1.Utils;

public class Act03_comprobarMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = new int[3][3];
		for (int i = 0; i < matriz[i].length; i++) {
			for (int j = 0; j < matriz[j].length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar(-10, 10);
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("La matriz es positiva = " + comprobarMatriz(matriz));
	}

	public static boolean comprobarMatriz(int matriz[][]) {

		/*
		 * Crea un método que compruebe si la matriz es positiva. (Todos sus elementos
		 * mayores o iguales a cero). El método recibirá una matriz y devolver un valor
		 * "boolean", indicando si la matriz es o no es positiva.
		 */
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					return false;
				}
			}
		}
		return true;
	}

}
