package capitulo6_Recursos;

public class Pi {

	public static void main(String[] args) {
		// Aproximar, con una precisión de 0.00001 décimas, el número PI. Para esto
		// debes utilizar el método "Calcular el valor de PI utilizando series
		// infinitas" (Método 2) del enlace https://es.wikihow.com/calcular-Pi
		
		
		int denominador = 1;
		double resultado;
		resultado = (4/ denominador);

		for (denominador = 1; (Math.abs(resultado - Math.PI)) <= 0.00001 ; denominador += 2) {
			resultado = (4/ denominador) *-1;
			System.out.println(denominador);
		}
		
		System.out.println(resultado);
	}

}
