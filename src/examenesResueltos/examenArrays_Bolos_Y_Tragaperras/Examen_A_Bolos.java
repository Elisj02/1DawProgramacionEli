package examenesResueltos.examenArrays_Bolos_Y_Tragaperras;

import javax.swing.JOptionPane;

import capitulo5.bloque1.Utils;

public class Examen_A_Bolos {

	public static void main(String[] args) {
		/*
		 * a. (1 punto) En el momento de inicializar el juego, todos los bolos tendr�n
		 * un valor de �1�, indicando que el bolo a�n se mantiene en pie. La
		 * inicializaci�n del juego debe hacerse con una funci�n.
		 * 
		 * b. (1,5 puntos) Debes mostrar la posici�n de los bolos en pantalla para que
		 * el jugador los visualice. Esto se puede hacer con el algoritmo que quieras.
		 * Recuerda que la �ltima fila de los bolos tiene 4 elementos, la pen�ltima fila
		 * tiene 3 bolos, la fila anterior tiene 2 bolos y la primera fila tiene un solo
		 * bolo. Los bolos deben visualizarse siempre en la misma posici�n. No puede
		 * pasar que un bolo se muestre en diferentes posiciones cada vez el programa
		 * realice una iteraci�n. La visualizaci�n de los bolos debe hacerse con una
		 * funci�n.
		 * 
		 * c. (2 puntos) El jugador debe lanzar una bola contra los bolos para
		 * derribarlos. Cada vez que el jugador lance la bola, debes calcular la
		 * posibilidad de que un bolo se caiga. Esto es, en realidad, muy sencillo.
		 * Asume que existe un 50% de probabilidad de que un bolo se caiga como efecto
		 * del lanzamiento de la bola. Esta probabilidad se puede implementar de la
		 * siguiente forma: genera un n�mero al azar entre 0 y 100, si el n�mero es
		 * igual o menor a 50% puedes sentenciar que el bolo ser� derribado. Si
		 * quisieras cambiar la probabilidad a un 30% podr�as obtener un n�mero
		 * aleatorio del 0 al 100 y comprobar si este es menor a 30. Esta operaci�n se
		 * debe calcular para cada bolo por separado. Es decir, ser� completamente
		 * normal que, despu�s de lanzar la bola, unos bolos permanezcan en pie y otros
		 * no. Debes hacer una funci�n para simular la tirada de la bola contra los
		 * bolos y otra funci�n para calcular la probabilidad de que un bolo se caiga.
		 * 
		 * d. (1 punto) El juego debe repetirse hasta que no quede ning�n bolo en pie o
		 * hasta que el usuario decida dejar de jugar. Piensa sobre esto, hay dos formas
		 * de salir del juego.
		 * 
		 * e. (1 punto) Los bolos que se caen en la primera tirada del jugador sumar�n
		 * un total de 10 puntos cada uno, los bolos derribados en segunda ronda sumar�n
		 * 5 puntos cada uno. Los bolos que caigan en la tercera ronda sumar�n 2 puntos
		 * cada uno. Los derribados en cuarta ronda sumar�n 1 punto cada uno. A partir
		 * de la cuarta ronda los bolos no sumar�n puntos por ser derribados. Debes
		 * calcular la puntuaci�n del jugador y mostrarla en pantalla en cada jugada,
		 * junto con el los bolos que quedan en pie y el n�mero de bolas que se han
		 * arrojado. F�jate en los puntos que vale un bolo en cada tirada: 10, 5 , 2, 1,
		 * 0, �no ves la relaci�n?.
		 * 
		 * f. (1,25 puntos) Debes prestar especial cuidado con la indentaci�n del c�digo
		 * fuente y con los comentarios que realices, es algo muy importante. Tambi�n
		 * debes asegurarte de usar los m�todos, bajo los principios de reusabilidad y
		 * modularidad.
		 * 
		 * g. (0,75 puntos) Una vez que llegues a este paso, debes conseguir que el
		 * juego se pueda jugar para dos jugadores. Al final del juego debes mostrar qu�
		 * jugador ha ganado.
		 * 
		 * h. (1 punto) Si llegas hasta aqu�, debes conseguir que cada bolo tenga una
		 * determinada probabilidad de ser derribado. Es decir, no todos los bolos
		 * caer�n con una probabilidad de un 50%. Puede que el primer bolo tenga una
		 * probabilidad de ser derribado de un 70%, pero que otro bolo tenga una
		 * probabilidad de un 30%. La probabilidad m�nima de que un bolo sea derribado
		 * es de 30%.
		 * 
		 * i. (0,5 puntos) Por �ltimo, conseguir�s la m�xima puntuaci�n en el examen si,
		 * adem�s de conseguir los apartados anteriores, consigues que la probabilidad
		 * de que un bolo sea derribado se reduzca conforme el jugador arroja la bola
		 * contra �l. De esta manera, si un bolo tiene una probabilidad de ser derribado
		 * de un 60% en la primera jugada, puede que tenga una probabilidad de un 50% en
		 * la segunda jugada. Recuerda que un bolo no puede tener menos de un 30% de
		 * probabilidad de caer.
		 */

				// 1 para indicar que el bolo est� en pie.
				int bolosJ1[] = new int[10];
				int bolosJ2[] = new int[10];
				int valorJ1 = 10;
				int valorJ2 = 10;
				int puntosJ1 = 0;
				int puntosJ2 = 0;
				int rondas = 0;
				darValoresInicales(bolosJ1);
				darValoresInicales(bolosJ2);

				int lanzamiento;
				do {
					lanzamiento = Integer.parseInt(JOptionPane.showInputDialog("MEN� : \n 0: Salir \n 1: Juega"));
					rondas++;
					switch (lanzamiento) {
					case 0:
						System.exit(0);
					case 1: 
						int jugador = Integer.parseInt(
								JOptionPane.showInputDialog("�Qu� jugador va a jugar? : \n 1: Jugador 1 \n 2: Jugador 2"));
						switch (jugador) {
						case 1:
							puntosJ1 += (caeBolo(bolosJ1, valorJ1, rondas));
							System.out.println("Puntos Totales : " + puntosJ1);
							imprimirBolos(bolosJ1);
							valorJ1 = valorJ1 / 2;
							break;

						case 2: 
							puntosJ2 += (caeBolo(bolosJ2, valorJ2, rondas));
							System.out.println("Puntos Totales : " + puntosJ2);
							imprimirBolos(bolosJ2);

							valorJ2 = valorJ2 / 2;

							break;

						}

					}

					System.out.println("Lanzamiento: " + lanzamiento + " - bolosJ1: " + quedanBolos(bolosJ1) + " - bolosJ2: " + quedanBolos(bolosJ2));
				} while (lanzamiento != 0 && (quedanBolos(bolosJ1) == true) && (quedanBolos(bolosJ2) == true));

				if (puntosJ1 < puntosJ2) {
					System.out.println("Ha ganado Jugador 2");
				} else {
					System.out.println("Ha ganado Jugador 1");
				}
			}

			public static void darValoresInicales(int array[]) {
				for (int i = 0; i < array.length; i++) {
					array[i] = 1;
				}
			}

			public static void imprimirBolos(int array[]) {
				System.out.println(array[0] + "\t" + array[1] + "\t" + array[2] + "\t" + array[3] + "\n");
				System.out.println("    " + array[4] + "       " + array[5] + "       " + array[6] + "\n");
				System.out.println("        " + array[7] + "       " + array[8] + "\n");
				System.out.println("            " + array[9]);

				System.out.println();

			}

			public static int caeBolo(int array[], int valor, int rondas) {

				int contador = 0;
				int puntos = 0;
				for (int i = 0; i < array.length; i++) {
					if (array[i] == 1) {
						if (puedoDisparar(array, rondas) == true) {
							array[i] = 0;
							contador++;
						}
					}

				}

				puntos = valor * contador;
				System.out.println("Has tirado  " + contador + " bolos");
				System.out.println("Valor de puntuaci�n " + valor);
				System.out.println("Puntos obtenidos en esta ronda: " + puntos);

				return puntos = valor * contador;

			}

			public static boolean puedoDisparar(int array[],int  numRonda) {
				int numAzar = (int) Math.round(Math.random() * 100); 
				// si el n�mero obtenido al azar es mayor o igual que la probabilidad, dispara

			//	int probabilidad = (int) Utils.numAleatorioLimSupInf(30, 70);
				int probabilidad = calculoProbabilidad(numRonda);
				for (int i = 0; i < array.length; i++) {
					if (array[i] == 1) {
						if (numAzar <= probabilidad) {
							return true;
						}

					}
				}

				return false; //No se cumple la probabilidad

			}

			public static boolean quedanBolos(int array[]) {
				boolean tirados = false;
				for (int i = 0; i < array.length; i++) {
					if (array[i] == 1) {
						tirados = true;
						break;
					}
				}

				return tirados;
			}
			
			public static int calculoProbabilidad(int numRonda) {
				
				int probabilidad =Utils.obtenerNumeroAzar(60, 70)- 15 * numRonda;
				if (probabilidad < 30) {
					probabilidad = 30;
				}
				return probabilidad;
			}

		}
