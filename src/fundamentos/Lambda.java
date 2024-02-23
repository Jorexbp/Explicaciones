package fundamentos;

public class Lambda {

	interface Operacion {
		int calcular(int a, int b);
	}

	public static void main(String[] args) {
		Operacion suma = (a, b) -> a + b;

		int resultado = suma.calcular(5, 3);
		System.out.println("Suma: " + resultado); 

		Operacion multiplicacion = (a, b) -> a * b;

		resultado = multiplicacion.calcular(5, 3);
		System.out.println("Multiplicación: " + resultado); 

	}

}
