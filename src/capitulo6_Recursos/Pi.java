package capitulo6_Recursos;

public class Pi {

	public static void main(String[] args) {
		// Aproximar, con una precisi�n de 0.00001 d�cimas, el n�mero PI. Para esto
		// debes utilizar el m�todo "Calcular el valor de PI utilizando series
		// infinitas" (M�todo 2) del enlace https://es.wikihow.com/calcular-Pi
		
		
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
	 
