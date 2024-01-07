package bucles;

public class ProgramaBucles {

	public static void main(String[] args) {
		String nombresPersonas[] = { "jorge", "Juan", "Judith", "Luis" };

		System.out.println("Ahora con continue:");
		for (int i = 0; i < nombresPersonas.length; i++) {
			if (i == 2)
				continue; // Ya entendí 
			System.out.println(nombresPersonas[i]);
		}

		System.out.println("\nAhora con break:");
		for (int i = 0; i < nombresPersonas.length; i++) {
			if (i == 2)
				break;// Pues si que es fácil
			System.out.println(nombresPersonas[i]);
		}
	}

}
