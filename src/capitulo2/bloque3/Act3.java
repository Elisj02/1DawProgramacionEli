package capitulo2.bloque3;

import javax.swing.JOptionPane;

public class Act3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * Realiza un programa que resuelva lo siguientes puntos: a.- Que muestre un
		 * men� en pantalla con opciones para: 1. C�lculo de la hipotenusa de un
		 * tri�ngulo. 2. C�lculo de la superficie de una circunferencia. 3. C�lculo del
		 * per�metro de una circunferencia. 4. C�lculo del �rea de un rect�ngulo. 5.
		 * C�lculo del �rea de un tri�ngulo. 0. Salir de la aplicaci�n.
		 * 
		 * b.- En la opci�n "1" debe pedir dos datos, correspondientes a las longitudes
		 * de los dos catetos de un tri�ngulo. Se debe imprimir la longitud de la
		 * hipotenusa. Recuerda que Hipotenusa al cuadrado = cateto1 al cuadrado +
		 * cateto2 al cuadrado.
		 * 
		 * c.- En la opci�n "2" debe pedir la longitud del radio de una circunferencia e
		 * imprimir la superficie de la misma. Recuerda que el �rea es igual a PI por el
		 * radio al cuadrado. Recuerda tambi�n que PI es igual a 3,1416.
		 * 
		 * d.- En la opci�n "3" debe pedir la longitud del radio de una circunferencia e
		 * imprimir la longitud del per�metro de la misma. Recuerda que la longitud de
		 * la circunferencia = 2 por PI por el radio.
		 * 
		 * e.- En la opci�n "4" debe pedir las longitudes de la base y la altura de un
		 * rect�ngulo, e imprimir el �rea de dicho rect�ngulo. Recuerda que el �rea del
		 * rect�ngulo es igual a la base por la altura.
		 * 
		 * f.- En la opci�n "5" debe pedir la base y la altura de un tr�angulo e
		 * imprimir el �rea del mismo. Recuerda que el �rea del tri�ngulo es la mitad
		 * del �rea del rect�ngulo de igual base y altura.
		 * 
		 * g.- Tras mostrar el resultado de cada opci�n, el programa debe hacer una
		 * pausa (para poder observar el resultado), y volver a pintar el men�. Esto se
		 * repetir� siempre que la opci�n no sea "0", en cuyo caso el programa acabar�.
		 * 
		 * h.- Si la opci�n no fuese "0", "1", "2", "3", "4" o "5", el programa deber�
		 * dar el mensaje de "opci�n incorrecta" y volver� a mostrar el men�.
		 */
		String str;
		int opcion;
		double hipotenusa, percircun, arearect, areatr, cateto1, cateto2,
		longrad, areacircun, baser, alturar, baset, alturat;
		do {
			
			do {
				System.out.println("1. C�lculo de la hipotenusa de un tri�ngulo. "
						+ "\n2. C�lculo de la superficie de una circunferencia."
						+ "\n3. C�lculo del per�metro de una circunferencia. "
						+ "\n4. C�lculo del �rea de un rect�ngulo." + "\n5. C�lculo del �rea de un tri�ngulo. "
						+ "\n0. Salir de la aplicaci�n.");

				str = JOptionPane.showInputDialog("Introduzca una opci�n: ");
				opcion = Integer.parseInt(str);
			} while (opcion < 0 || opcion > 5); {
				System.out.println("Opci�n incorrecta.");
			}
			switch (opcion) {

			case 1:
				System.out.println("C�lculo de la hipotenusa de un tri�ngulo.");
				str = JOptionPane.showInputDialog("Introduce la longitud del cateto1: ");
				cateto1 = Double.parseDouble(str);

				str = JOptionPane.showInputDialog("Introduce la longitud del cateto2: ");
				cateto2 = Double.parseDouble(str);

				hipotenusa = Math.hypot(cateto1, cateto2);
				System.out.println("La hipotenusa es: " + hipotenusa);
				
				//Para hacer una pausa de 3.5 segundos
				Thread.sleep(3500);

				break;
			case 2:
				System.out.println("C�lculo de la superficie de una circunferencia.");
				str = JOptionPane.showInputDialog("Introduce la longitud del radio de la circunferencia: ");
				longrad = Double.parseDouble(str);

				areacircun = Math.pow(longrad, 2) * 3.1416;
				System.out.println("La superficie de la circunferencia es: " + areacircun);
				Thread.sleep(3500);
				break;

			case 3:
				System.out.println("C�lculo del per�metro de una circunferencia.");
				str = JOptionPane.showInputDialog("Introduce la longitud del radio de la circunferencia: ");
				longrad = Double.parseDouble(str);

				percircun = (2 * 3.1416) * longrad;

				System.out.println("El per�metro de la circunferencia es: " + percircun);
				Thread.sleep(3500);
				break;

			case 4:
				System.out.println("�rea del rect�ngulo.");
				str = JOptionPane.showInputDialog("Introduce la longitud de la base: ");
				baser = Double.parseDouble(str);

				str = JOptionPane.showInputDialog("Introduce la altura: ");
				alturar = Double.parseDouble(str);

				arearect = baser * alturar;

				System.out.println("El �rea del rect�ngulo es: " + arearect);
				Thread.sleep(3500);
				break;

			case 5:
				System.out.println("�rea del tri�ngulo.");
				str = JOptionPane.showInputDialog("Introduce la base del tri�ngulo: ");
				baset = Double.parseDouble(str);

				str = JOptionPane.showInputDialog("Introduce la altura del tri�ngulo: ");
				alturat = Double.parseDouble(str);

				areatr = (baset * alturat) / 2;
				System.out.println("El �rea es: " + areatr);
				Thread.sleep(3500);
				break;

			case 0:
				System.out.println("Fin del programa.");
				break;

			}
		} while (opcion != 0);
	

	}

}
