package capitulo4_bloque1_primeros_objetos.examen_Cartas;

class MainCartas {

	public static void main(String[] args) {

		Baraja baraja = new Baraja();
		
		baraja.barajarArribaAbajo();
		baraja.barajarAbajoArriba();
		
		baraja.mostrarCartas();

		baraja.mezclarBaraja();
		
		baraja.mostrarCartas();
		
		baraja.ordenarBaraja();
		
		baraja.mostrarCartas();
	
		Poker poker = new Poker(baraja);
		
		
	}

}
