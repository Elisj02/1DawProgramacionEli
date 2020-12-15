package capitulo4_bloque1_primeros_objetos.examen_Cartas;

import capitulo5.bloque1.Utils;

public class Baraja {

	Carta cartas[] = new Carta[52];
		
		
		public Baraja() {
			int j = 0;
			for (int i = 0; i < 13; i++) {
				cartas[j] = new Carta(i + 1, "Picas", j); 
				j++;
			}
			for (int i = 0; i < 13; i++) {
				cartas[j] = new Carta(i + 1, "Diamantes", j); 
				j++;
			}
			for (int i = 0; i < 13; i++) {
				cartas[j] = new Carta(i + 1, "Tréboles", j); 
				j++;
			}
			for (int i = 0; i < 13; i++) {
				cartas[j] = new Carta(i + 1, "Corazones", j); 
				j++;
			}
		}
		
		public void mostrarCartas() {
			for (int i = 0; i < cartas.length; i++) {
				System.out.println(cartas[i]);
			}
		}
		
		public void barajarAbajoArriba() {
		
			//El último lo guardo en aux
			Carta aux = cartas[cartas.length-1];
			
			//desplazo todos los elementos a la derecha dejando la posición 0 vacía
			for (int i = cartas.length-1; i > 0; i--) {
				cartas[i] = cartas[i-1];
			}
			//El último pasa a la posición 0
			cartas[0] = aux;
	
	}
		
		public void barajarArribaAbajo() {
				// Salvaguardo la primera posición del array
				Carta aux = cartas[0];
				// Recorro las posiciones del array de primera a penúltima
				for (int i = 1; i < cartas.length; i++) {
					cartas[i-1] = cartas[i];
				}
				// La primera posición, guardada en aux, pasa a ser la última
				cartas[cartas.length - 1] = aux;
			}
		
		
		public void mezclarBaraja() {
			for (int j = 0; j < 100; j++) {
				int num1 = Utils.obtenerNumeroAzar(0, 51);
				int num2 = Utils.obtenerNumeroAzar(0, 51);

				Carta aux = cartas[num1];
				cartas[num1] = cartas[num2];
				
				cartas[num2] = aux;
				
			
			}
		}
			
			public void ordenarBaraja() {
				
					// Empieza el algoritmo
					for (int i = cartas.length - 1; i > 0; i--) {
						for (int j = 0; j < i; j++) {
							if (cartas[j].getId() > cartas[j+1].getId()) {
								// Entonces hago un intercambio
								Carta aux = cartas[j];
								cartas[j] = cartas[j+1];
								cartas[j+1] = aux;
							}
						}
						
					}
				
			}
			
			//reparte 5 cartas
			public void darMano(Jugador jugadores) {
				Carta mano[] = new Carta[5];
				for (int i = 0; i < mano.length; i++) {
					int azar;
					do {
						azar = Utils.obtenerNumeroAzar(0, 51);
								mano[i] = cartas[azar] ;
					} while (cartas[azar] == null);
					
					mano[i] = cartas[azar];
					cartas[azar] = null;
				}
				jugadores.setMano(mano);
			}
			
		
			
			
		}

		
		
	


