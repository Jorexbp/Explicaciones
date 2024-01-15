package fundamentos;

public class ClaseConStatic {
	static int numeroDeCreaciones;
	int id;
	
	public static void saludarEstatico() {
		System.out.println("¡Hola, soy estático!");
	
	}
	
	public ClaseConStatic(int id) {
		this.id = id;
		numeroDeCreaciones++;
	}
	
	public int getId() {
		return id;
	}

	public int getNumeroCreaciones() {
		return numeroDeCreaciones;
	}
	

}
