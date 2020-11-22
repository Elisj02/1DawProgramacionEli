package capitulo5.bloque6_matrices;

import capitulo5.bloque1.Utils;

public class Act02_mostrarMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = new int[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar();
			}
		}
		mostrarMatriz(matriz);
	}

	public static void mostrarMatriz(int matriz[][]) {

		/*
		 * Crea un método que imprima la matriz en consola. El método recibirá la matriz
		 * y devolverá "void".
		 */

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t ");
			}
			System.out.println();
		}
	}

}
