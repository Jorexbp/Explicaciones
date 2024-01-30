package herencia;

public class Persona extends Animal {

	private String genero;
	private String nacionalidad;

	public Persona(String nombre, int edad, double peso, String genero, String nacionalidad) {
		super(nombre, edad, peso);
		this.genero = genero;
		this.nacionalidad = nacionalidad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

}
