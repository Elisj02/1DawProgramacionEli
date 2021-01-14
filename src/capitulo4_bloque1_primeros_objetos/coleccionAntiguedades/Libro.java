package capitulo4_bloque1_primeros_objetos.coleccionAntiguedades;

public class Libro extends Antiguedad {

	String autor;
	String titulo;

	public Libro() {
		super();
	}

	public Libro(int anio, String origen, float precioVenta, String autor, String titulo) {
		super(anio, origen, precioVenta);
		this.autor = autor;
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", año=" + anio + ", origen=" + origen
				+ ", precioVenta=" + precioVenta + "]";
	}
}
