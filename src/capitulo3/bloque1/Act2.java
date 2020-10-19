package capitulo3.bloque1;

import javax.swing.JOptionPane;

public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String srt;
	int num, i, suma = 0, veces;
	
	srt = JOptionPane.showInputDialog("Vamos a realizar la suma de los números mayores de  10. \nIntroduzca la cantidad de números que quiere introducir: ");
	veces = Integer.parseInt(srt);
	
	for (i = 0; i < veces; i++) {
		
		srt = JOptionPane.showInputDialog("Introduce un número: ");
		num = Integer.parseInt(srt);

		if (num > 10) {
			suma += num; //suma += num es los mismo que suma = suma + num
		}
	}
	System.out.println("La suma de los mayores de 10 es: " + suma);
}
}
