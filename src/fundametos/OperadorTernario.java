package fundametos;

public class OperadorTernario {

	public static void main(String[] args) {

		/*
		 * ¿Qué son los operadores ternarios?
		 * 
		 * Son una manera distinta de escribir condicionales if/else.
		 * 
		 * Su sintaxis es muy simple, primero escribimos una condicion seguido de ?,
		 * luego ponemos el resultado en el caso de que se cumpla seguido de : y ponemos
		 * el resultado cuando la condición NO se cumple.
		 * 
		 * (condición) ? (se cumple) : (no se cumple);
		 */

		boolean condicion = true;

		if (condicion) {
			System.out.println("La condicion se cumple");
		} else {
			System.out.println("La condicion no se cumple");
		}

		// ¿Cómo crees que se podrían añadir más condiciones para cumplir?
		String textoDeSalida = condicion ? "La condición se cumple" : "La condición no se cumple";
		
		System.out.println(textoDeSalida);

	}

}
