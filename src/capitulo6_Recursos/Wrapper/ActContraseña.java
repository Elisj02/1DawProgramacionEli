package capitulo6_Recursos.Wrapper;

import javax.swing.JOptionPane;

public class ActContrase�a {

	public static void main(String[] args) {
		/*
		 * 2�.- Crear un programa que pida al usuario una contrase�a con los siguientes
		 * requisitos: - Al menos una may�scula. - Al menos una min�scula. - Al menos un
		 * d�gito - Al menos un car�cter no alfanum�rico. El programa no terminar� hasta
		 * que el usuario no introduzca la contrase�a con estos requisitos.
		 */

		boolean noAlfanumerico = false;
		boolean digito = false;
		boolean minuscula = false;
		boolean mayuscula = false;
		int i;

		do {

			String contr = JOptionPane.showInputDialog(
					"Introduce una contrase�a que tenga:\n" + "Al menos una may�scula\n" + "Al menos una min�scula\n"
							+ "Al menos un d�gito\n" + "Al menos un car�cter no alfanum�rico");

			char cad[];
			cad = contr.toCharArray();
			
			System.out.println("\nAnaliza el array de caracteres: " + cad.toString());
			for (i = 0; i < cad.length; i++) {

					if (digito == false) {
						digito = Character.isDigit(cad[i]);
					}
					if (mayuscula== false) {
						mayuscula = Character.isUpperCase(cad[i]);
					}
					if (minuscula==false) {
						minuscula = Character.isLowerCase(cad[i]);
					}
					if (noAlfanumerico== false) {
						noAlfanumerico = Character.isLetterOrDigit(cad[i]);
					}
				}
			System.out.println("Contrase�a incorrecta.");

		} while (digito == false || minuscula == false || mayuscula == false || noAlfanumerico == false);
		System.out.println("Contrase�a v�lida.");

	}

}

/*
 * do { String contrase�a = JOptionPane.showInputDialog("Escriba a contrase�a");
 * char[] caracteres = contrase�a.toCharArray(); for (int i = 0; i <
 * caracteres.length; i++) {
 * 
 * if (digito == false) { digito = Character.isDigit(caracteres[i]); } if
 * (mayuscula== false) { mayuscula = Character.isUpperCase(caracteres[i]); } if
 * (minuscula==false) { minuscula = Character.isLowerCase(caracteres[i]); } if
 * (noAlfanumerico== false) { noAlfanumerico =
 * Character.isLetterOrDigit(caracteres[i]); }
 * 
 * } System.out.println("Contrase�a incorrecta"); } while (digito == false ||
 * noAlfanumerico == false || minuscula == false || mayuscula == false);
 * 
 * System.out.println("Contrase�a correcta");
 */