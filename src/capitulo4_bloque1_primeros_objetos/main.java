package capitulo4_bloque1_primeros_objetos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {

	public static void main(String[] args) {
		/*  - Crea una clase nueva, en la que pongas un m�todo
		 * main() que lleve a cabo las siguientes acciones: 
		 * - Crea 5 objetos de tipo CromoBaloncesto, con valores creados por ti. 
		 * - Crea una lista cuyos elementos sean de tipo CromoBaloncesto y agrega los cinco objetos creados 
		 * a esa lista.
		 * - Recorre la lista, llamando al m�todo toString() de los objetos que contiene
		 * y sacando en pantalla el resultado. 
		 * - Crea un m�todo, en la clase que contiene el m�todo main(), que reciba la lista de cromos y la 
		 * ordene, con el algoritmo de la burbuja, en funci�n de los puntosMediosPorPartido de cada
		 * jugador, en orden ascendente. En el m�todo main comprueba el funcionamiento
		 * de ese m�todo, al que puedes llamar "ordenaJugadores(Lista<CromoBaloncesto> lista)"
		 */
		CromoBaloncesto cb1 = new CromoBaloncesto(" Jhony", 210, 150, 900);
		CromoBaloncesto cb2 = new CromoBaloncesto(" Pepe", 200, 120, 800);
		CromoBaloncesto cb3 = new CromoBaloncesto(" Manuel", 190, 90, 1900);
		CromoBaloncesto cb4 = new CromoBaloncesto(" Juan", 195, 110, 1500);
		CromoBaloncesto cb5 = new CromoBaloncesto(" Bernardo", 205, 140, 1700);

		
		List<CromoBaloncesto>lista = new ArrayList <CromoBaloncesto>();
		lista.add(cb1); lista.add(cb2); lista.add(cb3); lista.add(cb4); lista.add(cb5);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).toString());
		}
		}
		
		public static void ordenacionBurbuja() {		
			
			int vector[] = UtilsArrays.creaArrayNumerosAzar(5, 0, 10);
			
			UtilsArrays.mostrarArray(vector);
			
			// Mido el tiempo de inicio
			long millisAntesDeLaOrdenacion = new Date().getTime();
			
			ordenaArrayPorBurbuja(vector);

			// Mido el tiempo después
			long millisDespuesDeLaOrdenacion = new Date().getTime();
			
			// Muestro el tiempo en millis
			System.out.println("\nEjecución en " + (millisDespuesDeLaOrdenacion - millisAntesDeLaOrdenacion) + " millis\n");
			
			// Mostramos el resultado
			UtilsArrays.mostrarArray(vector);
		}

		
		/**
		 * Implementa el algoritmo de la buburja para ordenar un array
		 * @param array Array desordenado que se ordenará
		 */
		public static void ordenaArrayPorBurbuja (int array[]) {
			boolean hayIntercambios;
			do {
				hayIntercambios = false;
				// Empieza el algoritmo
				for (int i = 0; i < array.length - 1; i++) {
					if (array[i+1] < array[i]) {
						// Entonces hago un intercambio
						int aux = array[i+1];
						array[i+1] = array[i];
						array[i] = aux;
						hayIntercambios = true;
					}
				}
			} while (hayIntercambios == true);
		}
	

		
		
	}
	


