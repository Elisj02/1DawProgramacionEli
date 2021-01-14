package capitulo4_bloque1_primeros_objetos.circuitoElectronico;

public class Bombilla extends Componente {

	String tipo;
	int potencia;

	public Bombilla() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bombilla(String nombre, String componenteAnterior, String componenteSiguiente, String tipo, int potencia) {
		super(nombre, componenteAnterior, componenteSiguiente);
		this.tipo = tipo;
		this.potencia = potencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Bombilla [tipo=" + tipo + ", potencia=" + potencia + ", nombre=" + nombre + ", componenteAnterior="
				+ componenteAnterior + ", componenteSiguiente=" + componenteSiguiente + "]";
	}

}
