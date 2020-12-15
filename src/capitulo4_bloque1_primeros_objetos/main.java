package capitulo4_bloque1_primeros_objetos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {

	public static void main(String[] args) {
		/*  - Crea una clase nueva, en la que pongas un método
		 * main() que lleve a cabo las siguientes acciones: 
		 * - Crea 5 objetos de tipo CromoBaloncesto, con valores creados por ti. 
		 * - Crea una lista cuyos elementos sean de tipo CromoBaloncesto y agrega los cinco objetos creados 
		 * a esa lista.
		 * - Recorre la lista, llamando al método toString() de los objetos que contiene
		 * y sacando en pantalla el resultado. 
		 * - Crea un método, en la clase que contiene el método main(), que reciba la lista de cromos y la 
		 * ordene, con el algoritmo de la burbuja, en función de los puntosMediosPorPartido de cada
		 * jugador, en orden ascendente. En el método main comprueba el funcionamiento
		 * de ese método, al que puedes llamar "ordenaJugadores(Lista<CromoBaloncesto> lista)"
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
		
		BurbujaConObj(lista);
		
		System.out.println(" ");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).toString());
		}
		
		}
		

		
		/**
		 * Implementa el algoritmo de la buburja para ordenar un array
		 * @param array Array desordenado que se ordenarÃ¡
		 * @return 
		 */
		public static void BurbujaConObj(List<CromoBaloncesto> lista) {
	        CromoBaloncesto aux;
	        for(int i = 0;i < lista.size()-1;i++){
	            for(int j = 0;j < lista.size()-i-1;j++){
	                // El if de abajo va a determinar si el primero es menor que el segundo
	                // y si es true, se va a realizar el swap con una variable aux para
	                // mover los objetos del array
	                if(lista.get(j+1).getPuntosMediosPorpartido() <  lista.get(j).getPuntosMediosPorpartido()){
	                    aux = lista.get(j+1);
	                    lista.set(j+1,lista.get(j));
	                    lista.set(j,aux);
	                }
	            }
	        }
	    }
		
		
	}
	


