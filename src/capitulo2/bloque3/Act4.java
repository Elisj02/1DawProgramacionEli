package capitulo2.bloque3;

import javax.swing.JOptionPane;

public class Act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Escribe un programa que lea el importe de una compra y la cantidad recibida y calcule
el cambio a devolver, teniendo en cuenta que el número de monedas que se devuelven
debe ser mínimo. Suponer que el sistema monetario utilizado consta de monedas de 
100, 50, 25, 5, y 1 unidad. El precio viene dado en unidades monetarias enteras.
Ejemplo: Pagamos con 2000 unidades monetarias un articulo que nos cuesta 375 unidades monetarias, la vuelta (1625 u) debería de ser de la siguiente forma:
- 16 monedas de 100 = 1600
- 1 moneda de 25 = 25 */

	
	String srt;
	int importe, entrega, cambio;
	int coci100 = 0, coci50 = 0, coci25 = 0, coci5 = 0, coci1 = 0, suma100, suma50, suma25, suma5, suma1;
	
	srt = JOptionPane.showInputDialog("Introduce el importe de la compra: ");
	importe = Integer.parseInt(srt);
	
	srt = JOptionPane.showInputDialog("Introduce el dinero dado para pagar: ");
	entrega = Integer.parseInt(srt);
	
	cambio = entrega - importe;
	
	if (cambio > 0) {
		if ((cambio / 100) > 0 ) {
			coci100 = cambio / 100; //para saber cuantas monedas de 100 necesito
			suma100 = coci100 * 100; //para saber el total de las monedas de 100
			
			System.out.println(coci100 + " monedas de 100: " + suma100);
			cambio = cambio - suma100;
		}
		if ((cambio / 50) > 0) {
			coci50 = cambio / 50;
			suma50 = coci50 * 50;
			
			System.out.println(coci50 + " monedas de 50: " + suma50);
			cambio = cambio - suma50;
		}
		if ((cambio / 25) > 0) {
			coci25 = cambio / 25;
			suma25 = coci25 * 25;
			
			System.out.println(coci25 + " monedas de 25: " + suma25);
			cambio = cambio - suma25;
		}
		if ((cambio / 5) > 0) {
			coci5 = cambio / 5;
			suma5 = coci5 * 5;
			
			System.out.println(coci5 + " monedas de 5: " + suma5);
			cambio = cambio - suma5;
		}
		if ((cambio / 1) > 0) {
			coci1 = cambio / 1;
			suma1 = coci1 * 1;
			
			System.out.println(coci1 + " monedas de 1: " + suma1);
		}
	}
	else System.out.println("No hay cambio.");
	}

}
