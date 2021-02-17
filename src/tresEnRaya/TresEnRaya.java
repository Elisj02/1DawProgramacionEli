package tresEnRaya;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TresEnRaya extends Canvas {

	List<CuadroDeJuego> tablero = new ArrayList<CuadroDeJuego>();
	JFrame ventana = new JFrame("3 EN RAYA");
	private static final int JFrame_WIDTH = 700;
	private static final int JFrame_HEIGHT = 700;
	private static TresEnRaya instance = null;
	public static int JUGADOR_1 = 1;
	public static int JUGADOR_2 = 2;
	private int turnoActual = JUGADOR_1;

	private int matrizJugadas[][] = new int[][] { { 0, 0, 0 }, 
												{ 0, 0, 0 }, 
												{ 0, 0, 0 } };

	public static TresEnRaya getInstance() {
		if (instance == null) {
			instance = new TresEnRaya();
		}
		return instance;
	}

	/**
	 * Main
	 * 
	 * @param args
	 */
	public TresEnRaya() {
		JPanel panel = (JPanel) ventana.getContentPane();
		panel.setLayout(new BorderLayout());
		panel.add(this, BorderLayout.CENTER);

		ventana.setBounds(0, 0, JFrame_WIDTH, JFrame_HEIGHT);

		creaTablero(tablero);

		this.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {

				super.mouseClicked(e);

				if (e.getButton() == MouseEvent.BUTTON1) {
					for (CuadroDeJuego tablero : tablero) {
						if (tablero.clickSobreCuadro(e.getX(), e.getY())) {
							tablero.click(turnoActual);
							
							compruebaResultado();

							if (turnoActual == JUGADOR_1) {
								turnoActual = JUGADOR_2;
							} else {
								turnoActual = JUGADOR_1;
							}
						}

					}
				}

			}
		});

		ventana.setVisible(true);

		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		ventana.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}

		});

		ventana.setResizable(false);
		this.requestFocus();
	}

	public void paint(Graphics g) {

		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());

		for (CuadroDeJuego cuadrado : tablero) {
			cuadrado.paint(g);
		}

	}

	private void cerrarAplicacion() {
		String[] opciones = { "Aceptar", "Cancelar" };
		int eleccion = JOptionPane.showOptionDialog(ventana, "¿Desea cerrar el juego?", "Salir de la aplicación",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		TresEnRaya.getInstance();

	}
	
	public int[][] getMatrizJugadas() {
		return matrizJugadas;
		
	}

	public static void creaTablero(List<CuadroDeJuego> tablero) {
		int cuadrados[][] = new int[3][3];
		for (int i = 0; i < cuadrados.length; i++) {
			for (int j = 0; j < cuadrados.length; j++) {
				tablero.add(new CuadroDeJuego(i, j));
			}
		}

	}
	
	private static int getGanadorDelTablero(int tablero[][]) {
		// Busco si existe un ganador mirando las filas
		for (int i = 0; i < tablero.length; i++) {
			if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
				return tablero[i][0]; // Si todos los valores de una fila son iguales, devuelvo cualquiera de los
										// elementos de esa fila
			}
		}
		// Busco si existe un ganador en las columnas
		for (int i = 0; i < tablero[0].length; i++) {
			if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) {
				return tablero[0][i]; // Si todos los valores de una columna son iguales, devuelvo cualquiera de los
										// elementos de esa columna
			}
		}
		// Busco un ganador en la diagonal principal
		if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
			return tablero[0][0]; // Devuelvo cualquier elemento de la diagonal principal
		}
		// Busco un ganador en la diagonal secundaria
		if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
			return tablero[0][2]; // Devuelvo cualquier elemento de la diagonal secundaria
		}

		// Si llegÃ³ hasta aquÃ­ no hay ganador, pero aÃºn quedan dos posibilidades:
		// puede que queden casillas vacÃ­as o puede que no
		// Voy a suponer que no hay casillas vacÃ­as y voy a recorrer el tablero
		// buscando alguna casilla vacÃ­a
		boolean hayCasillasVacias = false;
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				if (tablero[i][j] == 0) {
					hayCasillasVacias = true;
				}
			}
		}

		// Devuelvo valores diferentes dependiendo de si existen casillas vacÃ­as o no
		if (hayCasillasVacias == true) {
			return 0; // Indica que el juego continÃºa.
		} else {
			return -1; // Indica que no quedan casillas vacÃ­as, hay empate
		}
	}

	public void compruebaResultado() {
		int resultado = getGanadorDelTablero(matrizJugadas);

		if (resultado == -1) {
			JOptionPane.showMessageDialog(instance, "No quedan mas cuadros libres");
		}
		if (resultado == 1) {
			JOptionPane.showMessageDialog(instance, "Ha ganado el JUGADOR 1");
		}
		if (resultado == 2) {
			JOptionPane.showMessageDialog(instance, "Ha ganado el JUGADOR 2");
		}
	}

}
