package capitulo6_Recursos.Wrapper;

import javax.swing.JOptionPane;

public class ActContraseña {

	public static void main(String[] args) {
		/*
		 * 2º.- Crear un programa que pida al usuario una contraseña con los siguientes
		 * requisitos: - Al menos una mayúscula. - Al menos una minúscula. - Al menos un
		 * dígito - Al menos un carácter no alfanumérico. El programa no terminará hasta
		 * que el usuario no introduzca la contraseña con estos requisitos.
		 */

		boolean noAlfanumerico = false;
		boolean digito = false;
		boolean minuscula = false;
		boolean mayuscula = false;
		int i;

		do {

			String contr = JOptionPane.showInputDialog(
					"Introduce una contraseña que tenga:\n" + "Al menos una mayúscula\n" + "Al menos una minúscula\n"
							+ "Al menos un dígito\n" + "Al menos un carácter no alfanumérico");

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
			System.out.println("Contraseña incorrecta.");

		} while (digito == false || minuscula == false || mayuscula == false || noAlfanumerico == false);
		System.out.println("Contraseña válida.");

	}

}

/*
 * do { String contraseña = JOptionPane.showInputDialog("Escriba a contraseña");
 * char[] caracteres = contraseña.toCharArray(); for (int i = 0; i <
 * caracteres.length; i++) {
 * 
 * if (digito == false) { digito = Character.isDigit(caracteres[i]); } if
 * (mayuscula== false) { mayuscula = Character.isUpperCase(caracteres[i]); } if
 * (minuscula==false) { minuscula = Character.isLowerCase(caracteres[i]); } if
 * (noAlfanumerico== false) { noAlfanumerico =
 * Character.isLetterOrDigit(caracteres[i]); }
 * 
 * } System.out.println("Contraseña incorrecta"); } while (digito == false ||
 * noAlfanumerico == false || minuscula == false || mayuscula == false);
 * 
 * System.out.println("Contraseña correcta");
 */