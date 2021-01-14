package capitulo4_bloque1_primeros_objetos.articulosComestibles;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

	public static void main(String[] args) {


		Perecedero prod1 = new Perecedero("Pera", 128372, 0.5f, "21 de Enero 2021");
		NoPerecedero prod2 = new NoPerecedero("Destornillador", 3324, 1.2f);
		Perecedero prod3 = new Perecedero("Melocotón", 23834, 0.5f, "8 de Febrero 2021");
		NoPerecedero prod4 = new NoPerecedero("Cargador", 34082, 0.5f);

		List<Producto>lista = new ArrayList <Producto>();
		lista.add(prod1); lista.add(prod2); lista.add(prod3); lista.add(prod4);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).toString());
		}


	}

}
