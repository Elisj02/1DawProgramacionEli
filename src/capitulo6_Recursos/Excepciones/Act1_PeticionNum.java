package capitulo6_Recursos.Excepciones;

import javax.swing.JOptionPane;

public class Act1_PeticionNum {

	public static void main(String[] args) {
		/*
		 * Implementa un programa que contenga una clase llamada "PeticionNumeros", con
		 * un método "pideNumeroPar()". Desde un método "main()" llama al método
		 * anterior. Dentro del método "pideNumeroPar()" debes crear todo lo necesario
		 * para disparar una Exception, creada por ti, cuando el número introducido no
		 * sea un número par.
		 */
			pideNumeroPar();
			
		}
		
		public static void pideNumeroPar() {
			int num;
			String str;
			try {
			str = JOptionPane.showInputDialog("Introduzca un número par");
			num = Integer.parseInt(str);	
			
				if (num % 2==0) {
				    System.out.println("El número es par");
				}
				else {
				    System.out.println("El número es impar");
				    throw new PeticionNum ("El número introducido es impar");
				}
				System.out.println("El numero introducido es: " + num);
			}catch (PeticionNum e) {
				System.out.println(e);
				
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	}

