package capitulo5.bloque6_matrices;

import capitulo5.bloque1.Utils;

public class Act08_MatrizSimétrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int[5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar();
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("La matriz simétrica es = " + matrizSimetrica(matriz));
	}

	public static boolean matrizSimetrica(int matriz[][]) {

		/*
		 * Crea un método que compruebe si la matriz es simétrica. (Los elementos de la
		 * matriz (i, j) y (j, i), si existen, son iguales). El método recibirá una
		 * matriz y devolverá un boolean.
		 */

		boolean esSimetrica = true;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] != matriz[j][i]) {
					esSimetrica = false;
					break;

				}
			}
		}

		return esSimetrica;

	}
}
