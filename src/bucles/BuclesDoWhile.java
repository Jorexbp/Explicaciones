package bucles;

public class BuclesDoWhile {

	public static void main(String[] args) {
		
		// Bucles do-while
		
		/*
		 * Estos son los únicos bucles que se ejecutan antes de 
		 * comprobar si se cumple o no la condición, por lo tanto
		 * se usan para primero disparar y luego preguntar (y menús)
		 * 
		 */
			
		int i = 0;
		
		do {
			i++;
			System.out.println("Valor de i: "+i);
		}while(i < 5); // Cuando deje de cumplirse se sale
		// Valor de i aquí = 5
		
		System.out.println("He salido del bucle do-while");
		
	}

}
