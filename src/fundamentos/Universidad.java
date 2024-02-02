package fundamentos;

public class Universidad {

	private class Estudiante {
		private String nombre;
		private int edad;

		public Estudiante(String nombre, int edad) {
			this.nombre = nombre;
			this.edad = edad;
		}

		public String getNombre() {
			return nombre;
		}

		public int getEdad() {
			return edad;
		}
	}

	public Estudiante nuevoEstudiante(String nombre, int edad) {
		return new Estudiante(nombre, edad);
	}

	public static void main(String[] args) {
		Universidad universidad = new Universidad();

		Universidad.Estudiante estudiante = universidad.nuevoEstudiante("Juan", 20);

		System.out.println("Nombre: " + estudiante.getNombre());
		System.out.println("Edad: " + estudiante.getEdad());
	}
}
