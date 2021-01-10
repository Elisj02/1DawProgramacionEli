package spaceInvaders;

import capitulo5.bloque1.Utils;

public class CampoBatalla {

	Humano humanos[] = new Humano[20];
	Malvado malvados[] = new Malvado[20];

	public CampoBatalla() {
		for (int i = 0; i < 20; i++) {
			humanos[i] = new Humano("Humano_" + i);
		}

		for (int i = 0; i < 20; i++) {
			malvados[i] = new Malvado("Malvado_" + i);
		}

		humanos[humanos.length - 1].setPuntosDeVida(humanos[humanos.length - 1].getPuntosDeVida() * 2);
		malvados[malvados.length - 1].setPuntosDeVida(malvados[malvados.length - 1].getPuntosDeVida() * 2);
	}

	public void mostrarCampo() {
		for (int i = 0; i < humanos.length; i++) {
			System.out.println(humanos[i]);
		}
		for (int i = 0; i < malvados.length; i++) {
			System.out.println(malvados[i]);

		}
	}

	public void mezclarCampo() {
		for (int j = 0; j < 200; j++) {
			int num1 = Utils.obtenerNumeroAzar(0, humanos.length - 1);
			int num2 = Utils.obtenerNumeroAzar(0, humanos.length - 1);

			Humano aux = humanos[num1];
			humanos[num1] = humanos[num2];

			humanos[num2] = aux;

			int num1M = Utils.obtenerNumeroAzar(0, malvados.length - 1);
			int num2M = Utils.obtenerNumeroAzar(0, malvados.length - 1);

			Malvado auxM = malvados[num1M];
			malvados[num1M] = malvados[num2M];

			malvados[num2M] = auxM;
		}

	}

	public void disparoMalvados() {
		for (int i = 0; i < malvados.length; i++) {
			if (malvados[i].isVivo() == true) {
				for (int j = 0; j < humanos.length; j++) {
					if (humanos[j].isVivo() == true) {

						int disparo = Utils.obtenerNumeroAzar(5, 25);
						// System.out.println("disparo valor de : "+ disparo);
						humanos[j].setPuntosDeVida(humanos[j].getPuntosDeVida() - disparo);
						humanos[j].setDisparoRecibido(humanos[j].getDisparoRecibido() + 1);

						vivoAMuerto();

					}
					break;
				}
			}
			break;
		}
	}

	/**
	* 
	*/
	public void vivoAMuerto() {
		for (int i = 0; i < humanos.length; i++) {
			if (humanos[i].getPuntosDeVida() <= 0) {
				humanos[i].setVivo(false);
			}
		}
		for (int i = 0; i < malvados.length; i++) {
			if (malvados[i].getPuntosDeVida() <= 0) {
				malvados[i].setVivo(false);
			}
		}
	}

	/**
	 * 
	 * @return
	 */
	public boolean seguimosJugando() {
		boolean vivoHumano = false;
		boolean vivoMalvado = false;
		boolean sigue = false;

		for (int i = 0; i < humanos.length; i++) {
			if (humanos[i].isVivo()) {
				vivoHumano = true;
			}
		}
		for (int i = 0; i < malvados.length; i++) {
			if (malvados[i].isVivo()) {
				vivoMalvado = true;
			}
		}

		if (vivoHumano == true && vivoMalvado == true) {
			sigue = true;
		}
		return sigue;
	}
}
