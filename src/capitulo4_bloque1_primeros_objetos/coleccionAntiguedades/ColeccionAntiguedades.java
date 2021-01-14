package capitulo4_bloque1_primeros_objetos.coleccionAntiguedades;

public class ColeccionAntiguedades {

	public static void main(String[] args) {

		Joya j = new Joya(1890, "África", 10000, "Diamante");
		Libro l = new Libro(1880, "Alemania", 15.90f, "Johanna Spiri", "Heidi");
		Jarron ja = new Jarron(1990, "Dinamarca", 250.50f, "Barroco", "Bloomingville");
		Mueble m = new Mueble(2010, "Español", 500.99f, "Abeto", "Blanco");
		
		System.out.println(j.toString());
		System.out.println(l.toString());
		System.out.println(ja.toString());
		System.out.println(m.toString());
		}
	}

