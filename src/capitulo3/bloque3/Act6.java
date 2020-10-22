package capitulo3.bloque3;

import javax.swing.JOptionPane;

public class Act6 {

	public static void main(String[] args) {
		/* Realiza un ejercicio que pida números al usuario, hasta que uno
		 * de ellos sea 0 (cero). Para cada número introducido se debe mostrar 
		 * en pantalla su tabla de multiplicar, desde el 0 (cero) hasta el 10.
		 */
	
	String srt;
	int num = 0, i = 0, multi = 0;
	
	do {
		srt = JOptionPane.showInputDialog("Introduce un número para mostrar la tabla de multiplicar hasta el 10. 0 para salir: ");
		num = Integer.parseInt(srt);
		
		for (i = 0; i < 11; i++) {
			if (num == 0) {
				break;
			}
			multi = num * i;
			System.out.println(multi);
		}
			

	} while (num != 0);
	
	}

}
