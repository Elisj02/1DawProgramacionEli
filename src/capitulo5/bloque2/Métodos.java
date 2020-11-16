package capitulo5.bloque2;

import javax.swing.JOptionPane;

import capitulo5.bloque1.Utils;

public class Métodos {

	public static void main(String[] args) {
		System.out.println("-Act1. Media-");
		System.out.println(media(5, 10, 15, 18.9f));
		System.out.println("\n-Act2. Validar número del usuario entre límites-");
		System.out.println(obtenerNumeroDeUsuarioEntreMinimoYMaximo(0, 28));
		System.out.println("\n-Act3. Máximo-");
		System.out.println(maximo(84, 21));
		System.out.println("\n-Act4. Obtener un número impar entre límites-");
		System.out.println(numeroImparEntreLimites(1, 80));
		System.out.println("\n-Act5. Devolver número en letra-");
		System.out.println(getStringFromEntero(8));
		System.out.println("\n-Act6. Imprimir el mínimo, medio y máximo-");

		int num1;
		String srt;
		srt = JOptionPane.showInputDialog("Introduce un número: ");
		num1 = Integer.parseInt(srt);

		int num2;
		srt = JOptionPane.showInputDialog("Introduce un número: ");
		num2 = Integer.parseInt(srt);

		int num3;
		srt = JOptionPane.showInputDialog("Introduce un número: ");
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
		 * Método que reciba como parámetros de entrada tres valores enteros y uno
		 * flotante. El método se llamará "media" y debe devolver la media aritmética de
		 * los cuatro valores. El valor devuelto debe ser flotante. El método "main"
		 * debe llamar a este otro método, con valores inventados por ti, e imprimir el
		 * valor de la media en la consola de salida.
		 */
		float media = ((num1 + num2 + num3 + num4) / 4);

		return media;

	}

	public static int obtenerNumeroDeUsuarioEntreMinimoYMaximo(int min, int max) {

		/*
		 * Método llamado "obtenerNumeroDeUsuarioEntreMinimoYMaximo" que reciba dos
		 * valores enteros: un valor mínimo y un valor máximo. El método debe pedir un
		 * numero al usuario. El método examinará el número introducido por el usuario
		 * y, si dicho número no está entre el valor mínimo y el máximo que se ha
		 * indicado, seguirá pidiendo números al usuario hasta que se obtenga uno
		 * válido. Finalmente se debe devolver dicho valor del usuario al método main,
		 * que lo imprimirá en la consola.
		 */
		int valor;
		String srt;

		srt = JOptionPane
				.showInputDialog("Introduce un valor para verificar si está entre los " + "límites establecidos: ");
		valor = Integer.parseInt(srt);

		// para que pida el valor hasta que el número esté dentro del límite
		while (valor < min || valor > max) {
			srt = JOptionPane.showInputDialog("Introduce un número entre " + min + " y " + max + ": ");
			valor = Integer.parseInt(srt);
		}

		return valor;
	}

	public static int maximo(int num1, int num2) {

		/*
		 * Método llamado "maximo" que devuelva el valor máximo de dos números enteros
		 * recibidos como argumentos de entrada. El método main pedirá dos números al
		 * usuario y los enviará a este nuevo método. Finalmente imprimirá en consola el
		 * valor devuelto por el método.
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
		 * Método llamado "numeroImparEntreLimites" que devuelva un número entero
		 * aleatorio, impar y comprendido entre dos límites recibidos como parámetros de
		 * entrada. "main" debe llamar a este método e imprimir el valor devuelto.
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
		 * Realiza un método que reciba un valor entero, del 1 al 10, como argumento de
		 * entrada y devuelva un String, con dicho número escrito en palabras. Llama a
		 * este método "getStringFromEntero".
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
			return "no hay traducción";
		}
		return enletra[num];

	}

	public static void imprimeMinimoAMaximo(int num1, int num2, int num3) {

		/*
		 * Método, llamado "imprimeMinimoAMaximo", que reciba tres valores enteros como
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
		 * La serie de Fibonacci es una serie numérica que comienza en los números 1, 1
		 * y continua de forma infinita, calculando cada miembro de la serie como la
		 * suma de los dos anteriores. De esta manera, la serie de Fibonacci comienza 1,
		 * 1, 2, 3, 5, 8, 13, 21, 34... Debes realizar un método llamado "fibonacci".
		 * Recibirá un argumento de entrada, de tipo entero. El método debe devolver un
		 * array con la serie de Fibonacci. El parámetro de entrada del método
		 * determinará la longitud del array a devolver. El método main recibirá el
		 * array y lo imprimirá en la consola.
		 */

		int numeros[] = new int[longitud]; // Declaro el array

		// Los dos primeros números de Fibonacci se indican

		numeros[0] = 1;
		numeros[1] = 1;

		// Recorro el array desde la posición "2", calculando cada número como la suma
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
		 * Método que imprima en pantalla un array, recibirá un array como parámetro de
		 * entrada y lo mostrará en consola. Main debe enviar el array al método,
		 * llamado "imprimeArray".
		 */

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

	public static int[] recorte(int array[], int primerIndice, int ultimoIndice) {

		/*
		 * Método que "recorte" un array. El método recibirá un array, un "primerIndice"
		 * y un "ultimoIndice" y debe devolver un array, formado con los elementos del
		 * array recibido, cuyos índices estén dentro del intervalo cerrado formado por
		 * los dos índices recibidos
		 */

		// para que la longitud del array esté formada por los índices recibidos
		int array2[] = new int[(ultimoIndice - primerIndice) + 1];

		for (int i = 0; i < array2.length; i++) {
			// para que el valor 0 del array2 sea el mismo que el primer indice introducido
			// del array1 y así con todos los números del array2.
			array2[i] = array[i + primerIndice];
		}

		return array2;

	}

	public static void recursividad(int num) {

		/*
		 * Método que muestre en pantalla los números del 1 al 100. El único requisito
		 * para esto es que debe hacerse utilizando la recursividad.
		 */

		// muestra números del 1 al 100
		if (num >= 1) {
			recursividad(num - 1);
			System.out.print(num + "  ");
		}

	}

}
