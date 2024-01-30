package herencia;

public class HerenciaEjemplo {
	public static void main(String[] args) {
		Persona juan = new Persona("Juan", 20, 78.5, "Hombre", "Española");
		
		System.out.println(juan.getNombre());
		System.out.println(juan.getEdad());
		System.out.println(juan.getGenero());
		System.out.println(juan.getPeso());
		System.out.println(juan.getNacionalidad());
	}
}
