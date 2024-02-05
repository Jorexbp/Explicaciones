package exceptions;

public class MiExcepcion extends Exception {

	public MiExcepcion(String mensaje) {
		super(mensaje);
	}

	public MiExcepcion(int edad) throws MiExcepcion {
		if (edad < 18) {
			throw new MiExcepcion("Debe ser mayor de edad");
		}
	}
}