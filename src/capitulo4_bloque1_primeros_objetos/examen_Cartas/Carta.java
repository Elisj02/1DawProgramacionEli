package capitulo4_bloque1_primeros_objetos.examen_Cartas;

public class Carta {

	private int valor;
	private String palo;
	private int id;

	public Carta(int valor, String palo, int id) {
		this.valor = valor;
		this.palo = palo;
		this.id = id;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + ", id=" + id + "]";
	}
	
	
}