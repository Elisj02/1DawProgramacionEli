package capitulo4_bloque1_primeros_objetos.coleccionAntiguedades;

public class Antiguedad {
	
	int anio;
	String origen;
	float precioVenta;
	
	public Antiguedad() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Antiguedad(int anio,String origen, float precioVenta){
		this.anio = anio;
		this.origen = origen;
		this.precioVenta = precioVenta;
		
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	@Override
	public String toString() {
		return "Antiguedad [anio=" + anio + ", origen=" + origen + ", precioVenta=" + precioVenta + "]";
	}
	
	}


