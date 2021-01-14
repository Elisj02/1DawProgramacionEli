package capitulo4_bloque1_primeros_objetos.coleccionAntiguedades;

public class Joya extends Antiguedad {

	String materialDeFabricacion;

	public Joya() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Joya(int anio, String origen, float precioVenta, String materialDeFabricacion) {
		super(anio, origen, precioVenta);
		this.materialDeFabricacion = materialDeFabricacion;
	}

	public String getMaterialDeFabricacion() {
		return materialDeFabricacion;
	}

	public void setMaterialDeFabricacion(String materialDeFabricacion) {
		this.materialDeFabricacion = materialDeFabricacion;
	}

	@Override
	public String toString() {
		return "Joya [materialDeFabricacion=" + materialDeFabricacion + ", año=" + anio + ", origen=" + origen
				+ ", precioVenta=" + precioVenta + "]";
	}

}
