package capitulo4_bloque1_primeros_objetos_Cuestionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Preguntas> preguntas = new ArrayList<Preguntas>();

	public static void main(String[] args) {

		PreguntaVF capitalEspania = new PreguntaVF("Madrid es la capital de Espa�a", "V");

		PreguntaVF puntoDeEbullicion = new PreguntaVF("El agua hierve a 70 grados", "F");

		PreguntaVF sol = new PreguntaVF("El sol sale por el este", "V");

		PreguntaOpcion anioJava = new PreguntaOpcion("�En qu� a�o se cre� el lenguaje java?", 2,
				new String[] { "2010", "1995", "1983", "1990", "2000" });

		PreguntaOpcion nombreOrdenador = new PreguntaOpcion("�Cu�l fue el nombre del primer ordenador? ", 3,
				new String[] { "EDVAC", "UNIVAC I", "IMB 701", "ENIAC", "ZUSE Z22" });

		preguntas.add(capitalEspania);
		preguntas.add(puntoDeEbullicion);
		preguntas.add(sol);
		preguntas.add(anioJava);
		preguntas.add(nombreOrdenador);

		int aciertos = 0;
		for (Preguntas p : preguntas) {
			p.muestraEnPantalla();
			Scanner sc = new Scanner(System.in);
			String respuestaUsuario = sc.nextLine();
			boolean correcta = p.esCorecta(respuestaUsuario);
			if (correcta) {
				aciertos++;
			}

		}
		float porcentaje = aciertos / (float) preguntas.size() * 100;

		System.out.println(porcentaje);

	}

}
