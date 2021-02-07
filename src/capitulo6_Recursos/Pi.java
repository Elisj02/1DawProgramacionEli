package capitulo6_Recursos;

public class Pi {

	public static void main(String[] args) {
		// Aproximar, con una precisión de 0.00001 décimas, el número PI. Para esto
		// debes utilizar el método "Calcular el valor de PI utilizando series
		// infinitas" (Método 2) del enlace https://es.wikihow.com/calcular-Pi
		
		
		double x = 3;  //denom
		float piCalculado = 4;
		int signo = -1;
		do {
		piCalculado += signo * 4.0 / x;
		signo *= -1;
		x += 2;

		} while (Math.abs(Math.PI - piCalculado) >= 0.00001);
		System.out.println(piCalculado);

		}
}
	 
