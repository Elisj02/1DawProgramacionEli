package capitulo3.bloque3;

import javax.swing.JOptionPane;

public class Act5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String srt;
		int num = -1, i, menor = 0, mayor = 0;

		for (i = 0; num != 0; i++) {
			srt = JOptionPane.showInputDialog("Introduce un número. 0 para acabar: ");
			num = Integer.parseInt(srt);

			if (i == 0) {
				menor = num;
			} else {
				if (num < menor && num != 0) {
					menor = num;
				}
			}
			if (i == 0) {
				mayor = num;
			} else {
				if (num > mayor && num != 0) {
					mayor = num;
				}
			}
		}
		System.out.println("El menor es: " + menor + " \nEl mayor es: " + mayor);
	}
}
