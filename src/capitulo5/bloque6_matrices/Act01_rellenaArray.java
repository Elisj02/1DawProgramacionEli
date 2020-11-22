package capitulo5.bloque6_matrices;

import capitulo5.bloque1.Utils;

public class Act01_rellenaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = new int[3][3];
		rellenaMAtriz(matriz);
	}

	public static void rellenaMAtriz(int[][] matriz) {

		/*
		 * 1� - Crea un m�todo que rellena la matriz con valores creados al azar. El
		 * m�todo recibir� la matriz y devolver� "void".
		 */

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar();
			}
		}
	}
}
