package bucles;

public class Break {

	public static void main(String[] args) {
		// ¿Qué es break?

		/*
		 * Break es una palabra reservada con la que se fuerza la salida
		 * en un bucle y continúa con el código que hubiera después.
		 * 
		 */

		int contador = 10;
		for (int i = 0; i < contador; i++) {
			if (i == 5) {
				System.out.println("Valor de i: " + i);
				break;
			}
			System.out.println("Valor de i: " + i);
			
		}
		System.out.println("He salido del bucle");

	}

}
