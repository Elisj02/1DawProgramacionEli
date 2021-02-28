package capitulo6_Recursos.Excepciones;

import javax.swing.JOptionPane;

public class Act2_Frase {

	public static void main(String[] args) {
		/*
		 * Realiza un programa Java parecido al anterior en el que pidas al usuario una
		 * frase que contenga la palabra "bombilla". Las excepciones, creadas por ti,
		 * deben realizarse en los siguientes casos: - La frase introducida no tiene
		 * caracteres distintos al espacio en blanco. - La cantidad de palabras de la
		 * frase introducida es inferior a 3. - En la frase no aparece la palabra
		 * "bombilla". - En la frase aparece una palabra ofensiva de la siguiente
		 * relación: "tonto", "tonta", "idiota". Cada uno de los supuestos anteriores
		 * provocará un tipo diferente de excepción. Tú debes controlar todos los tipos
		 * y responder al usuario con un mensaje adecuado.
		 */
		try {
			System.out.println(pideFrase());
		} catch (TresPalabras e) {
			e.printStackTrace();
		} catch (PalabraBombilla e) {
			e.printStackTrace();
		} catch (EspacioBlanco e) {
			e.printStackTrace();
		} catch (PalabraOfensiva e) {
			e.printStackTrace();
		}

	}

	private static String pideFrase() throws TresPalabras, PalabraBombilla, EspacioBlanco, PalabraOfensiva {
		String str = JOptionPane.showInputDialog(
				"Introduce una frase con la palabra bombilla, con 3 palabras y con una palabra ofensiva");

		String[] palabras = str.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			//System.out.println("Palabra " + (i + 1) + ": " + palabras[i]);
		}
		if (palabras.length < 3) {
			throw new TresPalabras("Hay menos de 3 palabras");
		}

		if (str.indexOf("bombilla") == -1) {
			throw new PalabraBombilla("No está la palabra bombilla");
		}

		if (str.trim().equals("")) {
			throw new EspacioBlanco("No hay espacios en blanco");
		}
		if (str.indexOf("tonto") == 0 || str.indexOf("tonta") == 0 || str.indexOf("idiota") == 0) {
			throw new PalabraOfensiva("Hay palabras ofensivas");
		}

		return str;

	}

}
