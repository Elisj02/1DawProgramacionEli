package capitulo1;

import javax.swing.JOptionPane;

public class Act7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Realiza el "complemento a dos" de un n�mero dado por el usuario.
//El complemento a dos consiste en dos pasos: en primer lugar se
//deben cambiar todos los bits del valor al que el complemento
//se est� aplicando, en segundo lugar se le debe sumar 1 (uno).
//Este ejercicio pedir� al usuario un valor y mostrar� el 
//complemento a dos del mismo. La impresi�n debe hacerse sin signo.

		String srt;
		int num;

		srt = JOptionPane.showInputDialog("Introduce un n�mero para realizarle el complemento a dos: ");
		num = Integer.parseInt(srt);

		num = ~num + 1;

		System.out.println("El complemento a dos es: " + num);

	}

}
