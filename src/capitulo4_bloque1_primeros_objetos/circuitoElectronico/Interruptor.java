package capitulo4_bloque1_primeros_objetos.circuitoElectronico;

public class Interruptor extends Componente {

	String material;

	public Interruptor() {
		super();
	}

	public Interruptor(String nombre, String componenteAnterior, String componenteSiguiente, String material) {
		super(nombre, componenteAnterior, componenteSiguiente);
		this.material = material;

	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Interruptor [material=" + material + ", nombre=" + nombre + ", componenteAnterior=" + componenteAnterior
				+ ", componenteSiguiente=" + componenteSiguiente + "]";
	}

}
