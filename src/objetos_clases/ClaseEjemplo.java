package objetos_clases;

public class ClaseEjemplo {
	
	String nombre;
	int edad;
	
	
	public ClaseEjemplo(String nombre,int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
