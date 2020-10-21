package capitulo2.bloque3;

import javax.swing.JOptionPane;

public class Act3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * Realiza un programa que resuelva lo siguientes puntos: a.- Que muestre un
		 * menú en pantalla con opciones para: 1. Cálculo de la hipotenusa de un
		 * triángulo. 2. Cálculo de la superficie de una circunferencia. 3. Cálculo del
		 * perímetro de una circunferencia. 4. Cálculo del área de un rectángulo. 5.
		 * Cálculo del área de un triángulo. 0. Salir de la aplicación.
		 * 
		 * b.- En la opción "1" debe pedir dos datos, correspondientes a las longitudes
		 * de los dos catetos de un triángulo. Se debe imprimir la longitud de la
		 * hipotenusa. Recuerda que Hipotenusa al cuadrado = cateto1 al cuadrado +
		 * cateto2 al cuadrado.
		 * 
		 * c.- En la opción "2" debe pedir la longitud del radio de una circunferencia e
		 * imprimir la superficie de la misma. Recuerda que el área es igual a PI por el
		 * radio al cuadrado. Recuerda también que PI es igual a 3,1416.
		 * 
		 * d.- En la opción "3" debe pedir la longitud del radio de una circunferencia e
		 * imprimir la longitud del perímetro de la misma. Recuerda que la longitud de
		 * la circunferencia = 2 por PI por el radio.
		 * 
		 * e.- En la opción "4" debe pedir las longitudes de la base y la altura de un
		 * rectángulo, e imprimir el área de dicho rectángulo. Recuerda que el área del
		 * rectángulo es igual a la base por la altura.
		 * 
		 * f.- En la opción "5" debe pedir la base y la altura de un tríangulo e
		 * imprimir el área del mismo. Recuerda que el área del triángulo es la mitad
		 * del área del rectángulo de igual base y altura.
		 * 
		 * g.- Tras mostrar el resultado de cada opción, el programa debe hacer una
		 * pausa (para poder observar el resultado), y volver a pintar el menú. Esto se
		 * repetirá siempre que la opción no sea "0", en cuyo caso el programa acabará.
		 * 
		 * h.- Si la opción no fuese "0", "1", "2", "3", "4" o "5", el programa deberá
		 * dar el mensaje de "opción incorrecta" y volverá a mostrar el menú.
		 */
		String str;
		int opcion;
		double hipotenusa, percircun, arearect, areatr, cateto1, cateto2,
		longrad, areacircun, baser, alturar, baset, alturat;
		do {
			
			do {
				System.out.println("1. Cálculo de la hipotenusa de un triángulo. "
						+ "\n2. Cálculo de la superficie de una circunferencia."
						+ "\n3. Cálculo del perímetro de una circunferencia. "
						+ "\n4. Cálculo del área de un rectángulo." + "\n5. Cálculo del área de un triángulo. "
						+ "\n0. Salir de la aplicación.");

				str = JOptionPane.showInputDialog("Introduzca una opción: ");
				opcion = Integer.parseInt(str);
			} while (opcion < 0 || opcion > 5); {
				System.out.println("Opción incorrecta.");
			}
			switch (opcion) {

			case 1:
				System.out.println("Cálculo de la hipotenusa de un triángulo.");
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
				System.out.println("Cálculo de la superficie de una circunferencia.");
				str = JOptionPane.showInputDialog("Introduce la longitud del radio de la circunferencia: ");
				longrad = Double.parseDouble(str);

				areacircun = Math.pow(longrad, 2) * 3.1416;
				System.out.println("La superficie de la circunferencia es: " + areacircun);
				Thread.sleep(3500);
				break;

			case 3:
				System.out.println("Cálculo del perímetro de una circunferencia.");
				str = JOptionPane.showInputDialog("Introduce la longitud del radio de la circunferencia: ");
				longrad = Double.parseDouble(str);

				percircun = (2 * 3.1416) * longrad;

				System.out.println("El perímetro de la circunferencia es: " + percircun);
				Thread.sleep(3500);
				break;

			case 4:
				System.out.println("Área del rectángulo.");
				str = JOptionPane.showInputDialog("Introduce la longitud de la base: ");
				baser = Double.parseDouble(str);

				str = JOptionPane.showInputDialog("Introduce la altura: ");
				alturar = Double.parseDouble(str);

				arearect = baser * alturar;

				System.out.println("El área del rectángulo es: " + arearect);
				Thread.sleep(3500);
				break;

			case 5:
				System.out.println("Área del triángulo.");
				str = JOptionPane.showInputDialog("Introduce la base del triángulo: ");
				baset = Double.parseDouble(str);

				str = JOptionPane.showInputDialog("Introduce la altura del triángulo: ");
				alturat = Double.parseDouble(str);

				areatr = (baset * alturat) / 2;
				System.out.println("El área es: " + areatr);
				Thread.sleep(3500);
				break;

			case 0:
				System.out.println("Fin del programa.");
				break;

			}
		} while (opcion != 0);
	

	}

}
