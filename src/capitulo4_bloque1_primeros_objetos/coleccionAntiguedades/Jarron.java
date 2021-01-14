package capitulo4_bloque1_primeros_objetos.coleccionAntiguedades;

public class Jarron extends Antiguedad {

	String tipo;
	String fabricante;

	public String getNombre() {
		return tipo;
	}

	public void setNombre(String tipo) {
		this.tipo = tipo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Jarron() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jarron(int anio, String origen, float precioVenta, String tipo, String fabricante) {
		super(anio, origen, precioVenta);
		this.tipo = tipo;
		this.fabricante = fabricante;

	}

	@Override
	public String toString() {
		return "Jarron [tipo=" + tipo + ", fabricante=" + fabricante + ", año=" + anio + ", origen=" + origen
				+ ", precioVenta=" + precioVenta + "]";
	}

}
