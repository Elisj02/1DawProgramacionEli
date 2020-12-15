package capitulo4_bloque1_primeros_objetos.examen_Cartas;

public class Poker {
	
	Jugador jugadores[] = new Jugador[5];
	
	Baraja baraja;


	public Poker(Baraja baraja) {
		this.baraja = baraja;
		jugadores[0] = new Jugador("Zulit<3");
		jugadores[1] = new Jugador("Pablito<3");
		jugadores[2] = new Jugador("Almudena<3");
		jugadores[3] = new Jugador("Pedro Antonio");
		jugadores[4] = new Jugador("Rubén");
		
		for (int i = 0; i < jugadores.length; i++) {
			baraja.darMano(jugadores[i]);
			System.out.println("Jugador/a: " + jugadores[i].getNombreJugador());
			for (int j = 0; j < jugadores[i].getMano().length; j++) {
				System.out.println("\t " + jugadores[i].getMano()[j].toString());
			}
			jugadores[i].combinaciones();
		}
		
		
	}
	
	
	
	
}
