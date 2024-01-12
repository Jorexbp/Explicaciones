package metodos;

public class Metodos_Sobrecarga {

	public static void felizCumpleaños(String nombre, int edad) {
		System.out.println("¡Felicidades " + nombre + "!");
		for (int i = 1; i < edad; i++) {
			System.out.println("Que no cumple " + i);
		}
		System.out.println("¡Que si cumple " + edad + "!");
	}

	public static void felizCumpleaños(String nombre,String apellido, int edad) {
		System.out.println("¡Felicidades "+nombre+" "+apellido+"!");
		System.out.println("¡Cumpliste "+edad+" años!");
	}
	public static void main(String[] args) {
		// ¿Qué es la sobrecarga de métodos?

		/*
		 * Sobrecargar un método es cuando creamos el mismo
		 * método con distinos parámetros para así diferenciarlo del otro método.
		 * 
		 */
		//felizCumpleaños("jorge",9);
		felizCumpleaños("Jorge","Barba",8);
		
	}
}
