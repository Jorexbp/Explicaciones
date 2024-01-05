package bucles;

public class BuclesWhile {

	public static void main(String[] args) {
		// Bucles while
		
		/*
		 * Estos bucles se emplean cuando no sabemos cuántas
		 * veces tendremos que iterar sobre un mismo código,
		 * hasta que la condición del while no se cumpla
		 */
		
		int numeroIteraciones = 0;
		
		while(numeroIteraciones < 3) {
			numeroIteraciones++;
			
			// Magia...
			
			System.out.println("Esta es la iteración nº: "+numeroIteraciones);
		}

		System.out.println("Total de iteraciones: "+numeroIteraciones);
	}

}
