package capitulo4_bloque1_primeros_objetos.ventanaCanvas;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class Ventana extends JFrame{

	public Ventana() throws HeadlessException {
		super();
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Dibujo());
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	public Ventana(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public Ventana(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public Ventana(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}
	
	
	}

