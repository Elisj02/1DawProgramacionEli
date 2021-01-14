package capitulo4_bloque1_primeros_objetos.circuitoElectronico;

public class Resistencia extends Componente {

	int valorResistencia;

	public Resistencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Resistencia(String nombre, String componenteAnterior, String componenteSiguiente, int valorResistencia) {
		super(nombre, componenteAnterior, componenteSiguiente);
		this.valorResistencia = valorResistencia;
	}

	public int getValorResistencia() {
		return valorResistencia;
	}

	public void setValorResistencia(int valorResistencia) {
		this.valorResistencia = valorResistencia;
	}

	@Override
	public String toString() {
		return "Resistencia [valorResistencia=" + valorResistencia + ", nombre=" + nombre + ", componenteAnterior="
				+ componenteAnterior + ", componenteSiguiente=" + componenteSiguiente + "]";
	}

}
