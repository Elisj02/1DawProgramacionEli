package capitulo4_bloque1_primeros_objetos.circuitoElectronico;

public class Pila extends Componente {

	int voltaje;

	public Pila() {
		super();
	}

	public Pila(String nombre, String componenteAnterior, String componenteSiguiente, int voltaje) {
		super(nombre, componenteAnterior, componenteSiguiente);
		this.voltaje = voltaje;
	}

	public int getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}

	@Override
	public String toString() {
		return "Pila [voltaje=" + voltaje + ", nombre=" + nombre + ", componenteAnterior=" + componenteAnterior
				+ ", componenteSiguiente=" + componenteSiguiente + "]";
	}

}
