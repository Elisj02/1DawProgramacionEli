package capitulo4_bloque1_primeros_objetos.circuitoElectronico;

public class Circuito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pila pila = new Pila("Pila", "Resistencia", "Interruptor", 20);
		Resistencia resistencia = new Resistencia("Resistencia", "Bombilla", "Pila", 18);
		Interruptor interruptor = new Interruptor("Interruptor", "Pila", "Bombilla", "Plástico");

		pila.setComponenteAnterior("Resistencia");
		pila.setComponenteSiguiente("Interruptor");
		resistencia.setComponenteAnterior("Bombilla");
		resistencia.setComponenteSiguiente("Pila");
		interruptor.setComponenteAnterior("Pila");
		interruptor.setComponenteSiguiente("Bombilla");

		System.out.println(pila);
		System.out.println(resistencia);
		System.out.println(interruptor);

	}

}
