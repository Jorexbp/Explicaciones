package objetos_clases;

public class CreacionObjetos {
	public static void main(String[] args) {
		PersonaEjemplo unaPersona = new PersonaEjemplo("Jorge", 35, 85.3);
		
		System.out.println("Soy "+unaPersona.getNombre());
		System.out.println("Tengo "+unaPersona.getEdad());
		System.out.println("Peso "+unaPersona.getPeso());
		
		unaPersona.saludar();
		
		PersonaEjemplo otraPersona = new PersonaEjemplo("Luis", 19, 72.3);
		
		System.out.println("Soy "+otraPersona.getNombre());
		System.out.println("Tengo "+otraPersona.getEdad());
		System.out.println("Peso "+otraPersona.getPeso());
		
		unaPersona.saludar();
		
		
		
	}
}
