package tresEnRaya;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class CuadroDeJuego {
	private int x, y; 
	private int esquinaSupX, esquinaSupY;
	private int ancho;
	private int alto;
	private int jugadorTurno = 0;
	
	public CuadroDeJuego(int x, int y) {
		super();
		
		this.x = x;
		this.y = y;

	}
	
	public void paint(Graphics g) {
		// TODO Auto-generated method stub

		ancho = TresEnRaya.getInstance().getWidth() / 3;
        alto = TresEnRaya.getInstance().getHeight() / 3;
		
		esquinaSupX = this.x * ancho;
		esquinaSupY = this.y * alto;
		
		g.setColor(Color.black);
		g.drawRect(esquinaSupX, esquinaSupY, ancho, alto);
		
		//pintaImagenVectoriales(g);
		pintaImagenesJuego(g);
		
	}
	
	private void pintaImagenVectoriales(Graphics g) {
		
		if (this.jugadorTurno == TresEnRaya.JUGADOR_1) {
			g.drawOval(this.esquinaSupX, this.esquinaSupY, this.ancho, this.alto);
		}
		
		if(this.jugadorTurno == TresEnRaya.JUGADOR_2) {
			g.drawLine(this.esquinaSupX, this.esquinaSupY, this.esquinaSupX + this.ancho, this.esquinaSupY + this.alto);
			g.drawLine(this.esquinaSupX, this.esquinaSupY + this.alto, this.esquinaSupX + this.ancho, this.esquinaSupY);
		}
	}
	
	
	private void pintaImagenesJuego(Graphics g) {
        BufferedImage imagenAPintar = null;
        if (this.jugadorTurno == TresEnRaya.JUGADOR_1) {
            imagenAPintar = ResourcesCache.getInstance().getImagen("sol.png");
        }
        if (this.jugadorTurno == TresEnRaya.JUGADOR_2) {
            imagenAPintar = ResourcesCache.getInstance().getImagen("luna.png");
        }
        if(imagenAPintar != null) {
            int x = this.esquinaSupX + this.ancho / 2 - imagenAPintar.getWidth() / 2;
            int y = this.esquinaSupY + this.alto / 2 - imagenAPintar.getHeight() / 2;
            g.drawImage(imagenAPintar, x, y, null);
        }
    }

	public boolean clickSobreCuadro(int xClick, int yClick) {
		if (xClick > this.esquinaSupX && xClick < (esquinaSupX + ancho) 
				&& yClick > this.esquinaSupY && yClick < (esquinaSupY + alto) ) {
		
		return true;
	}
	return false;
}
	
	public void click (int jugador) {
		if (this.jugadorTurno ==0) {
			this.jugadorTurno = jugador;
			
			TresEnRaya.getInstance().getMatrizJugadas()[this.y][this.x] = jugador;
		}
		TresEnRaya.getInstance().repaint();
		TresEnRaya.getInstance().revalidate();
		
		System.out.println("\nEstado del juego:\n");
        for ( int i = 0; i < TresEnRaya.getInstance().getMatrizJugadas().length;i++) {
            for (int j = 0; j < TresEnRaya.getInstance().getMatrizJugadas().length;j++) {
                System.out.print(TresEnRaya.getInstance().getMatrizJugadas()[i][j] + "\t");
            }
            System.out.println();
        }
	}

	public int getEsquinaSupX() {
		return esquinaSupX;
	}


	public void setEsquinaSup(int esquinaSupX) {
		this.esquinaSupX = esquinaSupX;
	}


	public int getEsquinaSupY() {
		return esquinaSupY;
	}


	public void setEsquinaSupY(int esquinaSupY) {
		this.esquinaSupY = esquinaSupY;
	}
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getAncho() {
		return ancho;
	}


	public void setAncho(int ancho) {
		this.ancho = ancho;
	}


	public int getAlto() {
		return alto;
	}


	public void setAlto(int alto) {
		this.alto = alto;
	}

	@Override
	public String toString() {
		return "CuadroDeJuego [x=" + x + ", y=" + y + "]";
	}
	

}
