package capitulo5.bloque6_matrices;

public class Act04_comprobarSiHayMatrizDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = new int[][] {
									 {1, 0, 0},
									 {0, 1, 0},
									 {0, 0, 1}};
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("La matriz diagonal es = " + matrizDiagonal(matriz));
	}

	public static boolean matrizDiagonal(int matriz[][]) {

		/*
		 * Crea un método que compruebe si la matriz es diagonal (Todos los elementos
		 * que no están en la diagonal principal son nulos).
		 */
		boolean diagonal = true;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				if (i != j) {
					if (matriz[i][j] == 0) {
						diagonal = true;
					} 
					else {
						diagonal = false;
						break;
					}
				}

				if (i == j) {
					if (matriz[i][j] != 0) {
						diagonal = true;
					}
					else {
						diagonal = false;
						break;
					}
				}
			}
		}
		return diagonal;
	}

}
