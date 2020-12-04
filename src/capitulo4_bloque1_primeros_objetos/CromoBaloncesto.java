package capitulo4_bloque1_primeros_objetos;

public class CromoBaloncesto {

	
		/*
		 * - Dentro de la clase, crea las siguientes propiedades: String nombreJugador,
		 * int alturaCm, int pesoKg y float puntosMediosPorpartido. 
		 * - Crea un constructor por defecto (sin argumentos de entrada) y un constructor en el
		 * que recibas, por argumentos de entrada, todas las propiedades de los objetos
		 * de esta clase 
		 * - Crea un método "toString()" que devuelva una cadena de caracteres que contenga todos 
		 * los valores de las propiedades de los objetos
		 * de esta clase. 
		 * - Crea métodos getter y setter de todas las propiedades de los
		 * objetos de esta clase. 
		 * - Crea una clase nueva, en la que pongas un método
		 * main() que lleve a cabo las siguientes acciones: 
		 * - Crea 5 objetos de tipo CromoBaloncesto, con valores creados por ti. 
		 * - Crea una lista cuyos elementos sean de tipo CromoBaloncesto y agrega los cinco objetos creados 
		 * a esa lista.
		 * - Recorre la lista, llamando al método toString() de los objetos que contiene
		 * y sacando en pantalla el resultado. 
		 * - Crea un método, en la clase que contiene el método main(), que reciba la lista de cromos y la 
		 * ordene, con el algoritmo de la burbuja, en función de los puntosMediosPorPartido de cada
		 * jugador, en orden ascendente. En el método main comprueba el funcionamiento
		 * de ese método, al que puedes llamar "ordenaJugadores(Lista<CromoBaloncesto> lista)"
		 */
	
	String nombreJugador;
	int alturaCm;
	int pesoKg;
	float puntosMediosPorpartido;
	
	public CromoBaloncesto(){
		
	}
	public CromoBaloncesto(String nombre, int altura, int peso, float puntos){
		this.nombreJugador = nombre;
		this.alturaCm = altura;
		this.pesoKg = peso;
		this.puntosMediosPorpartido = puntos;
		
	}
	
	
	public String getNombreJugador() {
		return nombreJugador;
	}
	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}
	public int getAlturaCm() {
		return alturaCm;
	}
	public void setAlturaCm(int alturaCm) {
		this.alturaCm = alturaCm;
	}
	public int getPesoKg() {
		return pesoKg;
	}
	public void setPesoKg(int pesoKg) {
		this.pesoKg = pesoKg;
	}
	public float getPuntosMediosPorpartido() {
		return puntosMediosPorpartido;
	}
	public void setPuntosMediosPorpartido(float puntosMediosPorpartido) {
		this.puntosMediosPorpartido = puntosMediosPorpartido;
	}
	
	@Override
	public String toString() {
		return "CromoBaloncesto [nombreJugador=" + nombreJugador + ", alturaCm=" + alturaCm + ", pesoKg=" + pesoKg
				+ ", puntosMediosPorpartido=" + puntosMediosPorpartido + "]";
	
	
	}
	}
	


