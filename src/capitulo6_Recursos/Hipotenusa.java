package capitulo6_Recursos;

public class Hipotenusa {

	public static void main(String[] args) {
		// 4�.- Dado un tri�ngulo rect�ngulo cuyos catetos miden 4 cm y 5 cm
		// respectivamente, hallar cuanto mide la hipotenusa.

		double hipotenusa = Math.hypot(4, 5); 
		System.out.println("La hipotenusa es: " + hipotenusa);
	}

}
