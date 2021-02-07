package capitulo5.HashMap;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ActividadAlmacen {
	
	/*
	 * 1º.- Crear una aplicación que gestione los artículos guardados en un almacén.
	 * Cada artículo tiene un código de barras, y un número de estante. La
	 * aplicación permitirá que el usuario añada artículos nuevos, los borre,
	 * actualice el estante de un artículo, e imprima la lista de artículos. Además
	 * el usuario podrá consultar la localización de un determinado artículo por su
	 * código de barras. Sólo existirá como mucho una unidad de cada tipo de
	 * artículo.
	 * 
	 * 2º.- Ampliar el ejercicio anterior para añadir un nombre a cada artículo, y
	 * un número de unidades en stock, haciendo posible almacenar más de un artículo
	 * de cada clase. La aplicación deberá limitar a un máximo de 10 el número de
	 * artículos almacenados de cada tipo
	 */
	
	
	static HashMap <Integer, Articulo> hm = new HashMap <Integer, Articulo> ();
	
	static String nombre;
	static int codigo, NumEstante, stock;
	
	private static void HashMap() {
	
		
		hm.put(3754, new Articulo("Pipas", 2, 18));
		hm.put(3874, new Articulo("Peras", 1, 22));
		hm.put(38944, new Articulo("Cucharas", 3, 50));
				
	}
		
	public static void main(String[] args) {
		HashMap();
		
		int opcion;
		do {
			opcion = menu();
			
			switch (opcion) {
			case 0: // Ha elegido abandonar la aplicaciÃ³n
				System.out.println("HAS ABANDONADO LA APLICACIÓN.");
				break;
			case 1: //Añadir artículos
				agregarHashMap();
				
				break;
			case 2: // Borrar artículos
				eliminarHashMap();
				
				break;
			case 3: //Actualizar el estante
				actualizarEstante();

				break;
			case 4: // Elimino una lÃ­nea del fichero, pido la posiciÃ³n y elimino
				actualizarNombre();
				
				break;
			case 5: // Cortar un conjunto de lÃ­neas
				actualizarStock();
				
				break;

			case 6: // Cortar un conjunto de lÃ­neas
				encontrarArticulo();
				
				break;
				
			case 7: // Cortar un conjunto de lÃ­neas
				actualizarStock();
				
				break;
			case 8: // Ver HashMap

				visualizaHashMap();
				break;
			default:
				System.out.println("Opción no válida");
			}
			
			// El bucle se repetirÃ¡ mientras no se pulse la opciÃ³n de salir.
		} while (opcion != 0);
	}
	
	public static int menu () {
		String strMenu = "\n\nMenú"
				+ "\n0.- Salir"
				+ "\n1.- Agregar un artículo"
				+ "\n2.- Eliminar un artículo"
				+ "\n3.- Actualizar el estante de un artículo"
				+ "\n4.- Añadir nombre a un artículo"
				+ "\n5.- Añadir stock a un artículo"
				+ "\n6.- Encontrar un artículo"
				+ "\n7.- Limitar stock"
				+ "\n8.- Ver lista de artículos"
				+ "\n\nIntroduzca su opción: ";
		// Muestro el menÃº y pido una opciÃ³n al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opciÃ³n seleccionada
		return opcionUsuario;
	}
	
	public static void visualizaHashMap () {
		System.out.println("\nTodos los productos dentro del HashMap:");
		Object claves[] = hm.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println(" Código de barras del artículo: " + claves[i].toString() + " - Objeto obtenido: "  + hm.get(claves[i]));
		}
		}
	
	public static void agregarHashMap() {
	
		nombre = JOptionPane.showInputDialog("Inserte el nombre del artículo: ");
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Inserte el código del artículo: "));
		NumEstante = Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de estante del artículo: "));
		stock = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad de stock del artículo: "));

		hm.put(codigo, new Articulo(nombre, NumEstante, stock));
		
	}
	
	public static void eliminarHashMap() {
		int eliminar;
		eliminar = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número de artículo para eliminarlo: "));
		hm.remove(eliminar);
	}
	
	public static void actualizarEstante() {
		
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el código de barras del artículo que desea cambiar: "));
		System.out.println(hm.get(codigo));
				
		int numEs = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número de estantería nuevo: "));
		
		hm.get(codigo).setNumEstante(numEs);
	}
	
	public static void actualizarNombre() {		
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el código de barras del artículo que desea cambiar: "));
		
		System.out.println(hm.get(codigo));
				
		String nomNuevo = JOptionPane.showInputDialog("Introduce un nombre nuevo: ");
		
		hm.get(codigo).setNombre(nomNuevo);
	}
	
	public static void actualizarStock() {
		String str;
		
		str = JOptionPane.showInputDialog("Introduce el código de barras del artículo que quiere cambiar: ");
		int codigo = Integer.parseInt(str);
		System.out.println(hm.get(codigo));
				
		str = JOptionPane.showInputDialog("Introduce una cantidad de stock nueva: ");
		int stockNuevo = Integer.parseInt(str);
		
		hm.get(codigo).setStock(stockNuevo);
	}
	
	public static void encontrarArticulo() {
		String str;
		
		str = JOptionPane.showInputDialog("Introduce el código de barras del artículo que quieres encontrar: ");
		int codigo = Integer.parseInt(str);
		System.out.println(hm.get(codigo));
	}
	}


