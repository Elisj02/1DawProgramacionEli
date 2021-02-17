package capitulo5.bloque2;

import javax.swing.JOptionPane;

import capitulo5.bloque1.Utils;

public class Metodos {

	public static void main(String[] args) {
		System.out.println("-Act1. Media-");
		System.out.println(media(5, 10, 15, 18.9f));
		System.out.println("\n-Act2. Validar n�mero del usuario entre l�mites-");
		System.out.println(obtenerNumeroDeUsuarioEntreMinimoYMaximo(0, 28));
		System.out.println("\n-Act3. M�ximo-");
		System.out.println(maximo(84, 21));
		System.out.println("\n-Act4. Obtener un n�mero impar entre l�mites-");
		System.out.println(numeroImparEntreLimites(1, 80));
		System.out.println("\n-Act5. Devolver n�mero en letra-");
		System.out.println(getStringFromEntero(8));
		System.out.println("\n-Act6. Imprimir el m�nimo, medio y m�ximo-");

		int num1;
		String srt;
		srt = JOptionPane.showInputDialog("Introduce un n�mero: ");
		num1 = Integer.parseInt(srt);

		int num2;
		srt = JOptionPane.showInputDialog("Introduce un n�mero: ");
		num2 = Integer.parseInt(srt);

		int num3;
		srt = JOptionPane.showInputDialog("Introduce un n�mero: ");
		num3 = Integer.parseInt(srt);

		imprimeMinimoAMaximo(num1, num2, num3);
		System.out.println("\n-Act7. Fibonacci-");
		int longitud = Integer.parseInt(JOptionPane.showInputDialog("Introduce una longitud para el array: "));
		fibonacci(longitud);
		System.out.println("\n-Act8. Imprimir un array-");
		int array[] = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar();
		}
		imprimeArray(array);
		System.out.println("\n-Act9. Recorte-");
		System.out.println(recorte(array, 5, 15));
		System.out.println("\n-Act10. Recursividad-");
		recursividad(100);

	}

	public static float media(int num1, int num2, int num3, float num4) {

		/*
		 * M�todo que reciba como par�metros de entrada tres valores enteros y uno
		 * flotante. El m�todo se llamar� "media" y debe devolver la media aritm�tica de
		 * los cuatro valores. El valor devuelto debe ser flotante. El m�todo "main"
		 * debe llamar a este otro m�todo, con valores inventados por ti, e imprimir el
		 * valor de la media en la consola de salida.
		 */
		float media = ((num1 + num2 + num3 + num4) / 4);

		return media;

	}

	public static int obtenerNumeroDeUsuarioEntreMinimoYMaximo(int min, int max) {

		/*
		 * M�todo llamado "obtenerNumeroDeUsuarioEntreMinimoYMaximo" que reciba dos
		 * valores enteros: un valor m�nimo y un valor m�ximo. El m�todo debe pedir un
		 * numero al usuario. El m�todo examinar� el n�mero introducido por el usuario
		 * y, si dicho n�mero no est� entre el valor m�nimo y el m�ximo que se ha
		 * indicado, seguir� pidiendo n�meros al usuario hasta que se obtenga uno
		 * v�lido. Finalmente se debe devolver dicho valor del usuario al m�todo main,
		 * que lo imprimir� en la consola.
		 */
		int valor;
		String srt;

		srt = JOptionPane
				.showInputDialog("Introduce un valor para verificar si est� entre los " + "l�mites establecidos: ");
		valor = Integer.parseInt(srt);

		// para que pida el valor hasta que el n�mero est� dentro del l�mite
		while (valor < min || valor > max) {
			srt = JOptionPane.showInputDialog("Introduce un n�mero entre " + min + " y " + max + ": ");
			valor = Integer.parseInt(srt);
		}

		return valor;
	}

	public static int maximo(int num1, int num2) {

		/*
		 * M�todo llamado "maximo" que devuelva el valor m�ximo de dos n�meros enteros
		 * recibidos como argumentos de entrada. El m�todo main pedir� dos n�meros al
		 * usuario y los enviar� a este nuevo m�todo. Finalmente imprimir� en consola el
		 * valor devuelto por el m�todo.
		 */

		// Math.max(num1, num2); Es lo mismo
		int maximo = 0;

		if (num1 > num2) {
			maximo = num1;
		} else {
			maximo = num2;
		}
		return maximo;
	}

	public static int numeroImparEntreLimites(int liminf, int limsup) {

		/*
		 * M�todo llamado "numeroImparEntreLimites" que devuelva un n�mero entero
		 * aleatorio, impar y comprendido entre dos l�mites recibidos como par�metros de
		 * entrada. "main" debe llamar a este m�todo e imprimir el valor devuelto.
		 */
		int num;
		num = Utils.obtenerNumeroAzar(liminf, limsup);

		while (num % 2 == 0) {
			num = Utils.obtenerNumeroAzar(liminf, limsup);
		}
		return num;

	}

	public static String getStringFromEntero(int num) {

		/*
		 * Realiza un m�todo que reciba un valor entero, del 1 al 10, como argumento de
		 * entrada y devuelva un String, con dicho n�mero escrito en palabras. Llama a
		 * este m�todo "getStringFromEntero".
		 */

		/*
		 * switch (num) { case 1: return "uno"; case 2: return "dos"; case 3: return
		 * "tres"; case 4: return "cuatro"; case 5: return "cinco"; case 6: return
		 * "seis"; case 7: return "siete"; case 8: return "ocho"; case 9: return
		 * "nueve"; case 10: return "diez"; } return "";
		 */

		String enletra[] = new String[] { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve",
				"diez" };
		if (num >= enletra.length) {
			return "no hay traducci�n";
		}
		return enletra[num];

	}

	public static void imprimeMinimoAMaximo(int num1, int num2, int num3) {

		/*
		 * M�todo, llamado "imprimeMinimoAMaximo", que reciba tres valores enteros como
		 * argumentos de entrada. Debe imprimir dichos valores en orden de menor a
		 * mayor.
		 */

		int min = 0, med = 0, max = 0;

		if (num1 > num2 && num1 > num3) {
			max = num1;
		}
		if (num2 > num1 && num2 > num3) {
			max = num2;
		}
		if (num3 > num1 && num3 > num2) {
			max = num3;
		}
		if (num1 < num2 && num1 < num3) {
			min = num1;
		}
		if (num2 < num1 && num2 < num3) {
			min = num2;
		}
		if (num3 < num2 && num3 < num1) {
			min = num3;
		}
		if (num1 != max && num1 != min) {
			med = num1;
		}
		if (num3 != max && num3 != min) {
			med = num3;
		}
		if (num2 != max && num2 != min) {
			med = num2;
		}
		System.out.println("El mayor: " + max + "\nEl mediano es: " + med + "\nEl menor es: " + min);

		// int array[] = new int[] { num1, num2, num3 };
		// UtilsArrays.ordenarArray(array);
		// UtilsArrays.mostrarArray(array);
	}

	public static void fibonacci(int longitud) {

		/*
		 * La serie de Fibonacci es una serie num�rica que comienza en los n�meros 1, 1
		 * y continua de forma infinita, calculando cada miembro de la serie como la
		 * suma de los dos anteriores. De esta manera, la serie de Fibonacci comienza 1,
		 * 1, 2, 3, 5, 8, 13, 21, 34... Debes realizar un m�todo llamado "fibonacci".
		 * Recibir� un argumento de entrada, de tipo entero. El m�todo debe devolver un
		 * array con la serie de Fibonacci. El par�metro de entrada del m�todo
		 * determinar� la longitud del array a devolver. El m�todo main recibir� el
		 * array y lo imprimir� en la consola.
		 */

		int numeros[] = new int[longitud]; // Declaro el array

		// Los dos primeros n�meros de Fibonacci se indican

		numeros[0] = 1;
		numeros[1] = 1;

		// Recorro el array desde la posici�n "2", calculando cada n�mero como la suma
		// de los dos anteriores

		for (int i = 2; i < numeros.length; i++) {
			numeros[i] = numeros[i - 1] + numeros[i - 2];
		}

		// Imprimo el array

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

	}

	public static void imprimeArray(int array[]) {

		/*
		 * M�todo que imprima en pantalla un array, recibir� un array como par�metro de
		 * entrada y lo mostrar� en consola. Main debe enviar el array al m�todo,
		 * llamado "imprimeArray".
		 */

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

	public static int[] recorte(int array[], int primerIndice, int ultimoIndice) {

		/*
		 * M�todo que "recorte" un array. El m�todo recibir� un array, un "primerIndice"
		 * y un "ultimoIndice" y debe devolver un array, formado con los elementos del
		 * array recibido, cuyos �ndices est�n dentro del intervalo cerrado formado por
		 * los dos �ndices recibidos
		 */

		// para que la longitud del array est� formada por los �ndices recibidos
		int array2[] = new int[(ultimoIndice - primerIndice) + 1];

		for (int i = 0; i < array2.length; i++) {
			// para que el valor 0 del array2 sea el mismo que el primer indice introducido
			// del array1 y as� con todos los n�meros del array2.
			array2[i] = array[i + primerIndice];
		}

		return array2;

	}

	public static void recursividad(int num) {

		/*
		 * M�todo que muestre en pantalla los n�meros del 1 al 100. El �nico requisito
		 * para esto es que debe hacerse utilizando la recursividad.
		 */

		// muestra n�meros del 1 al 100
		if (num >= 1) {
			recursividad(num - 1);
			System.out.print(num + "  ");
		}

	}

}
