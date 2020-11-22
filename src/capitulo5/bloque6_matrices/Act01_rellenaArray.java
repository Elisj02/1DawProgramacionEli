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
		 * 1º - Crea un método que rellena la matriz con valores creados al azar. El
		 * método recibirá la matriz y devolverá "void".
		 */

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar();
			}
		}
	}
}
