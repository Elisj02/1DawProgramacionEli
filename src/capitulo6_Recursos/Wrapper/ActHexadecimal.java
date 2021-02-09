package capitulo6_Recursos.Wrapper;

public class ActHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 0; i <= 100; i++) {
			
			String hex = Integer.toHexString(i);
			
			System.out.println("El hexadecimal de " + i + " es: " + hex);


		}
	}

}
