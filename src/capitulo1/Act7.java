package capitulo1;

import javax.swing.JOptionPane;

public class Act7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Realiza el "complemento a dos" de un número dado por el usuario.
//El complemento a dos consiste en dos pasos: en primer lugar se
//deben cambiar todos los bits del valor al que el complemento
//se está aplicando, en segundo lugar se le debe sumar 1 (uno).
//Este ejercicio pedirá al usuario un valor y mostrará el 
//complemento a dos del mismo. La impresión debe hacerse sin signo.

		String srt;
		int num;

		srt = JOptionPane.showInputDialog("Introduce un número para realizarle el complemento a dos: ");
		num = Integer.parseInt(srt);

		num = ~num + 1;

		System.out.println("El complemento a dos es: " + num);

	}

}
