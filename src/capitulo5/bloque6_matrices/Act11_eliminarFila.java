package capitulo5.bloque6_matrices;

import javax.swing.JOptionPane;

import capitulo5.bloque1.Utils;

public class Act11_eliminarFila {

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
		System.out.println(eliminarFila(matriz));
	}

	public static int[][] eliminarFila(int matriz[][]) {

		/*
		 * Crea un método que pida al usuario un número de fila sobre una matriz. Debes
		 * crear una matriz igual a la original pero eliminando el número de fila que el
		 * usuario ha especificado. El método recibirá una matriz y un valor entero, que
		 * representa una fila de la matriz, y devuelve una nueva matriz.
		 */

		int fila;
		String srt;
		srt = JOptionPane.showInputDialog("Introduce el número de fila que quieres eliminar: ");
		fila = Integer.parseInt(srt);
	
		int filaEliminada [][] = new int [matriz.length-1][matriz[0].length];
		
		int k = 0;
		System.out.println("\nLa matriz con la fila eliminada es: ");
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++) {
			if (i != fila) {
			for (int j = 0; k < matriz.length; j++) {
				filaEliminada[k][j] = matriz[i][j];
				k++;
				
			}
			}
		}
		return filaEliminada;
	}
	}