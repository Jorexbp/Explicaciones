package exceptions;

public class EjemploException {
	public void metodoConExcepcion() throws MiExcepcion {
		// Código que puede dar error
		throw new MiExcepcion("¡Excepción personalizada!");
		// ...
	}

	public void comprobarEdad(int edad) throws MiExcepcion {
		new MiExcepcion(edad);
		System.out.println("¡Edad válida!");
	}

	public static void main(String[] args) {
		EjemploException ejemplo = new EjemploException();
		try {
			ejemplo.metodoConExcepcion();
		} catch (MiExcepcion e) {
			System.out.println(e.getMessage());
		}

		try {
			ejemplo.comprobarEdad(18);
		} catch (MiExcepcion e) {
			System.out.println(e.getMessage());
		}
	}
}
