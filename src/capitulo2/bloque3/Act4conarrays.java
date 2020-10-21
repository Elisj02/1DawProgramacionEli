package capitulo2.bloque3;

import javax.swing.JOptionPane;

public class Act4conarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String srt;
		int cambio, importe, entrega;
		int valorMonedas[] = new int[] { 200, 100, 50, 20, 10, 5, 2, 1 };

		srt = JOptionPane.showInputDialog("Introduce el importe de la cuenta: ");
		importe = Integer.parseInt(srt);

		srt = JOptionPane.showInputDialog("Introduce el dinero entregado para mostrar el cambio: ");
		entrega = Integer.parseInt(srt);
		cambio = entrega - importe;

		for (int i = 0; i < valorMonedas.length; i++) {
			int numMonedas = cambio / valorMonedas[i];
			if (numMonedas > 0) {
				System.out.println("Monedas de" + valorMonedas[i] + ": " + numMonedas);
			}
		}

	}

}
