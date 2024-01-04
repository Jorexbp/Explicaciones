package bucles;

public class BuclesFor {
	public static void main(String[] args) {
		// Bucles for

		/*
		 * Estos bucles tienen una condición de salida en su sintaxis para saber cuando
		 * dejar de iterar, se suele usar una variable contadora para ello.
		 * 
		 * Se emplean usualmente cuando se sabe cuantas veces se tiene que
		 * iterar.
		 */

		int contador = 5;

		// Se suele crear una variable contadora
		// para comprobar la condición e irla
		// incrementando, esto es opcional
		for (int i = 0; i < contador; i++) {

			System.out.println("Valor de i: " + i);

		}

		System.out.println("He salido del bucle for");

//		for (;;) {
//			System.out.println("Esto es un bucle infinito :(");
//		}

		/*
		 * Esto ocurre porque no le he especificado una condición de salida
		 */
	}
}
