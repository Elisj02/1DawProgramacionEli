package capitulo4_bloque1_primeros_objetos.examen_Cartas;

import java.util.Arrays;

public class Jugador {

	String nombreJugador;
	Carta mano[] = new Carta[5];

	public Jugador(String nombre) {
		this.nombreJugador = nombre;

	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public Carta[] getMano() {
		return mano;
	}

	public void setMano(Carta[] mano) {
		this.mano = mano;
	}

	@Override
	public String toString() {
		return "Jugador [nombreJugador=" + nombreJugador + ", mano=" + Arrays.toString(mano) + "]";
	}

	public void combinaciones() {
		for (int i = 0; i < this.mano.length; i++) {

			int combinaciones = 1;
			for (int j = i + 1; j < mano.length; j++) {
				if (mano[i].getValor() == mano[j].getValor()) {
					combinaciones++;
				}
			}

			switch (combinaciones) {

			case 2:
				System.out.println("Hay una pareja.");
				System.out.println(" ");
					break;
			case 3:
				System.out.println("Hay un trío.");
				System.out.println(" ");
					break;
			case 4:
				System.out.println("Hay un póker.");
				System.out.println(" ");
					break;
			}
		}
	}

}
