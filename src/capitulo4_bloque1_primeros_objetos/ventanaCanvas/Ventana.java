package capitulo4_bloque1_primeros_objetos.ventanaCanvas;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Ventana{
	
	public static void main(String[]args) {
		
		//ventana principal
		JFrame ventana = new JFrame ("Canvas");
		
		//canvas creado
		Dibujo dibujo = new Dibujo();
		
		//plantilla a la ventana
		ventana.getContentPane().setLayout(new BorderLayout());
		
		//añadir el canvas a la ventana
		ventana.getContentPane().add(dibujo, BorderLayout.CENTER);
		
		//posición y tamaño de la ventana
		ventana.setBounds(0, 0, 800, 600);
		
		//ventana visible
		ventana.setVisible(true);
		
	}
	
	


	
	}

