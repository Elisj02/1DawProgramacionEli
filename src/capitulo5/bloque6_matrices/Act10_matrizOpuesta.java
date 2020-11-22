package capitulo5.bloque6_matrices;

import capitulo5.bloque1.Utils;

public class Act10_matrizOpuesta {

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
		matrizOpuesta(matriz);
	}

	public static void matrizOpuesta(int matriz[][]) {

		/*
		 * Crea un método que realice la matriz opuesta de la que recibe. El método
		 * recibe una matriz y devuelve otra matriz, la opuesta.
		 */
		
		int matrizOpuesta[][] = new int [matriz.length][matriz.length];
		System.out.println("La matriz opuesta es:");
		System.out.println();
		for (int i = 0; i < matrizOpuesta.length; i++) {
			for (int j = 0; j < matrizOpuesta.length; j++) {
				matrizOpuesta[i][j] = (matriz[i][j])*-1;
				System.out.print(matrizOpuesta[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
