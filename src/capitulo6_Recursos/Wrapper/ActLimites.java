package capitulo6_Recursos.Wrapper;

public class ActLimites {

	public static void main(String[] args) {

		/*
		 * 1º.- Realizar un programa que imprima una tabla con los límites máximo y
		 * mínimo representables para los diferentes tipos primitivos en Java (byte,
		 * int, short, long, float, double). En la tabla también deberá aparecer el
		 * número de bytes que cada tipo usa para su representación.
		 */

		Integer integer = new Integer(15);
		integer = Integer.valueOf(15); // Igual al anterior pero no estÃ¡ deprecado

		// Wrapper para el tipo de datos "byte"
			System.out.println("\nValor máximo para un Byte: " + Byte.MAX_VALUE);
			System.out.println("Valor mínimo para un Byte: " + Byte.MIN_VALUE);
			System.out.println("Tamaño en bits complemento a 2 para Byte: " + Byte.SIZE);
		
		// Wrapper para el tipo de datos "Int"
			System.out.println("\nValor máximo para un Int: " + Integer.MAX_VALUE);
			System.out.println("Valor mínimo para un Int: " + Integer.MIN_VALUE);
			System.out.println("Tamaño en bits complemento a 2 para Int: " + Integer.SIZE);
		
		
		// Wrapper para el tipo de datos "long"
			System.out.println("\nValor máximo para un Long: " + Long.MAX_VALUE);
			System.out.println("Valor mínimo para un Long: " + Long.MIN_VALUE);
			System.out.println("Tamaño en bits complemento a 2 para Long: " + Long.SIZE);

		// Wrapper para el tipo de datos "short"
			System.out.println("\nValor máximo para un Short: " + Short.MAX_VALUE);
			System.out.println("Valor mínimo para un Short: " + Short.MIN_VALUE);
			System.out.println("Tamaño en bits complemento a 2 para Short: " + Short.SIZE);

		// Wrapper para el tipo de datos "float"
		System.out.println("\nValor máximo para un Float: " + Float.MAX_VALUE);
		System.out.println("Valor mínimo para un Float: " + Float.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Float: " + Float.SIZE);

		// Wrapper para el tipo de datos "double"
		System.out.println("\nValor máximo para un Double: " + Double.MAX_VALUE);
		System.out.println("Valor mínimo para un Double: " + Double.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Double: " + Double.SIZE);
	}

}
