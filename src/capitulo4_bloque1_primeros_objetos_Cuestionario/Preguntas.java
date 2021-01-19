package capitulo4_bloque1_primeros_objetos_Cuestionario;

public abstract class Preguntas {

	public String enunciado;

	public abstract boolean esCorecta(String respuestaUsuario);

	public Preguntas() {
		super();
	}

	public Preguntas(String enunciado) {
		super();
		this.enunciado = enunciado;
	}

	public abstract void muestraEnPantalla();

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	@Override
	public String toString() {
		return "Preguntas [enunciado=" + enunciado + "]";
	}
}
