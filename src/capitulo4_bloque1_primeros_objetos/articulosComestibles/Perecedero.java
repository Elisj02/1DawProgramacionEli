package capitulo4_bloque1_primeros_objetos.articulosComestibles;

public class Perecedero extends Producto {

	String fechaCaducidad;

	public Perecedero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perecedero(String nombreProducto, int codigo, float precio, String fechaCaducidad) {
		super(nombreProducto, codigo, precio);
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Perecedero [fechaCaducidad=" + fechaCaducidad + ", nombreProducto=" + nombreProducto + ", codigo="
				+ codigo + ", precio=" + precio + "]";
	}


}
