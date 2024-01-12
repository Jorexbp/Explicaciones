package metodos;

public class ReturnYVoid {
	
	public static void saludarAJorge() {
		System.out.println("¡Hola Jorge!");
	}
	public static int sumarDosNumeros(int num1,int num2) {
		int suma = num1 + num2;
		return suma;
	}
	public static void main(String[] args) {
		// ¿Qué pueden devolver los métodos?
		
		/*
		 * Todos lo métodos pueden devolver un valor especificado
		 * por la cabecera del método o no devolver nada usando
		 * la palabra 'void'.
		 */
		saludarAJorge();
		int suma = sumarDosNumeros(2, 1);
		System.out.println(suma);
	}

}
