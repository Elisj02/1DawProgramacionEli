package capitulo2.bloque3;

import javax.swing.JOptionPane;

public class Act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realiza un ejercicio que califique la nota obtenida por un alumno/a en un
		 * examen. El ejercicio pedirá al usuario la nota numérica, y se imprimirá en
		 * pantalla su traducción a nota de texto: muy deficiente, insuficiente,
		 * suficiente, bien, notable y sobresaliente. Debes realizar el ejercicio a
		 * través de una sentencia switch, no de if anidados.
		 */

		String str;
		int nota;

		str = JOptionPane.showInputDialog("Introduzca una nota para calificarla textualmente: ");
		nota = Integer.parseInt(str);

		switch (nota) {
		case 0:
		case 1:
		case 2:
			System.out.println("La nota es muy deficiente.");
			break;

		case 3:
		case 4:
			System.out.println("La nota es insuficiente.");
			break;

		case 5:
			System.out.println("La nota es suficiente.");
			break;

		case 6:
			System.out.println("La nota es bien.");
			break;

		case 7:
		case 8:
			System.out.println("La nota es notable.");
			break;

		case 9:
		case 10:
			System.out.println("La nota es sobresaliente.");
			break;
		}
	}

}
