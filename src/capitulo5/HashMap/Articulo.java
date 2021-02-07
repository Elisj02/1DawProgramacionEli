package capitulo5.HashMap;

public class Articulo {

	private int NumEstante;
	private String Nombre;
	private int Stock;

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public Articulo(String nombre, int numEstante,  int stock) {
		super();
		this.NumEstante = numEstante;
		this.Nombre = nombre;
		this.Stock = stock;
	}

	public int getNumEstante() {
		return NumEstante;
	}

	public void setNumEstante(int numEstante) {
		NumEstante = numEstante;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	@Override
	public String toString() {
		return "Articulo [NumEstante=" + NumEstante + ", Nombre=" + Nombre + ", Stock=" + Stock
				+ "]";
	}



}
