package bucles;

public class Continue {

	public static void main(String[] args) {
		// ¿Qué es continue?

		/*
		 * Continue es una palabra reservada con la que
		 * podemos hacer que un bucle se salte una iteración
		 * y pase a la siguiente.
		 * 
		 */

		int contador = 4;

		for (int i = 0; i < contador; i++) {
			if (i == 2) {
				// Con esto se saltará el resto del código
				// cuando i valga 2
				continue;
			}
			System.out.println("Valor de i: " + i);
		}
		System.out.println("He salido del bucle");
	}

}
