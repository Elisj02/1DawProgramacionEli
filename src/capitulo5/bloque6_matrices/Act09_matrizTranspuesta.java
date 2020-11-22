package capitulo5.bloque6_matrices;

import capitulo5.bloque1.Utils;

public class Act09_matrizTranspuesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = new int[5][5];
		System.out.println("La matriz original es:");
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar();
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		matrizTranspuesta(matriz);

	}

	public static void matrizTranspuesta(int matriz[][]) {

		int matriz2[][] = new int[matriz.length][matriz.length];

		System.out.println("\nLa matriz transpuesta es:");
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz.length; j++) {
				matriz2[i][j] = matriz[j][i];
				System.out.print(matriz2[i][j] + "\t");
				
			}
			System.out.println();


		}
	}
}
