package capitulo4_bloque1_primeros_objetos.ventanaCanvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Dibujo extends Canvas{

	public Dibujo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(30, 30, 60, 80);

		g.setColor(Color.black);
		g.drawRect(30, 30, 60, 80);
		
		g.setColor(Color.green);
		g.fillOval(120, 120, 60, 80);
		
		g.setColor(Color.black);
		g.drawOval(120, 120, 60, 80);
		
		g.setColor(Color.blue);
		int [] vx2 = {400, 450, 350};
        int [] vy2 = {170, 220, 220};
        g.fillPolygon (vx2, vy2, 3);
        
        g.setColor(Color.black);
        g.drawPolygon(vx2, vy2, 3);
	}


}
