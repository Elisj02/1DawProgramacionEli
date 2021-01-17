package capitulo4_bloque1_primeros_objetos.circuitoElectronico;

public class Componente {

	String nombre;
	String componenteAnterior;
	String componenteSiguiente;

	public Componente() {
		super();
	}

	public Componente(String nombre, String componenteAnterior, String componenteSiguiente) {
		super();
		this.nombre = nombre;
		this.componenteAnterior = componenteAnterior;
		this.componenteSiguiente = componenteSiguiente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getComponenteAnterior() {
		return componenteAnterior;
	}

	public void setComponenteAnterior(String componenteAnterior) {
		this.componenteAnterior = componenteAnterior;
	}

	public String getComponenteSiguiente() {
		return componenteSiguiente;
	}

	public void setComponenteSiguiente(String componenteSiguiente) {
		this.componenteSiguiente = componenteSiguiente;
	}

	@Override
	public String toString() {
		return "Componente [nombre=" + nombre + ", componenteAnterior=" + componenteAnterior + ", componenteSiguiente="
				+ componenteSiguiente + "]";
	}

}
