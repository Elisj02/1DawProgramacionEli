package capitulo5.bloque6_matrices;

public class Act05_comprobarSiLaMatrizTriangularEsSuperior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = new int [] [] {
									   {1, 1, 1},
									   {0, 1, 1},
									   {0, 0, 0}};
		for (int i = 0; i < matriz[i].length; i++) {
			for (int j = 0; j < matriz[j].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("La triangular de la matriz es superior = " + triangularSuperior(matriz));
		
	}

	public static boolean triangularSuperior(int matriz[][]) {
	
	/*
	 * Crea un método que compruebe si la matriz es triangular superior. (Todos los
	 * elementos que están por debajo de la diagonal principal son nulos).
	*/
	
		boolean superior = true;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < i; j++) {
				if (matriz[i][j] != 0) {
					superior = false;
					break;
				}
				else {
					superior = true;
				}
				
			}
		}
		return superior;
	
	}
}
