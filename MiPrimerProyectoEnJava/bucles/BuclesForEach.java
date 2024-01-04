package bucles;

public class BuclesForEach {

	public static void main(String[] args) {
		// Bucles for-each

		/*
		 * Estos bucles recorren una variable que contiene varios valores del mismo tipo
		 * de dato
		 */

		// Esta variable contiene varios nombres
		String listaDeNombres[] = { "Pepe", "Alberto", "Fernando", "Juan" };

		
		// Uso un bucle for-each para recorrerlos todos
		// Como la variable contenedora es de tipo String,
		// debo usar ese mismo tipo de dato para recorrerlo
		for (String string : listaDeNombres) {
			System.out.println(string);
		}

	}

}
