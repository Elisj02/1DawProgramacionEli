package capitulo1;

import javax.swing.JOptionPane;

public class Act6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Realiza un ejercicio en Java para el cálculo de la
//cuota mensual de una hipoteca.Se deben pedir al usuario
//los datos de Euribor (float), Diferencial (float), Capital (float)
//y Número de plazos mensuales para pagar la hipoteca (int). 
//A partir de esos datos se debe calcular y mostrar al usuario
//el importe de la cuota mensual.

		String srt;
		int numPlazMen;
		float euribor, diferencial, capital, ImpCuotMen, Im, pot;

		srt = JOptionPane.showInputDialog("Para calcular el importe de la cuota mensual. \nIntroduzca el euribor: ");

		euribor = Float.parseFloat(srt);

		srt = JOptionPane.showInputDialog("Introduzca el diferencial: ");

		diferencial = Float.parseFloat(srt);

		srt = JOptionPane.showInputDialog("Introduzca el capital: ");

		capital = Float.parseFloat(srt);

		srt = JOptionPane.showInputDialog("Introduzca el número de plazos mensuales para pagar la hipoteca: ");

		numPlazMen = Integer.parseInt(srt);

		Im = (((euribor + diferencial) / 12) / 100);

		pot= (float) (Math.pow(1+Im, numPlazMen));

		ImpCuotMen = capital * ((Im * pot ) / (pot - 1));

		System.out.println("El importe de la cuota mensual es: " + ImpCuotMen);

	}

}
