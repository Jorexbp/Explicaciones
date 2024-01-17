package clase_abstract;

public abstract class AnimalAbstracto {
	// ¿Qué es una clase abstracta?

	/*
	 * Es una clase de la que se pueden
	 * heredar sus métodos si se implementan
	 * en clases que la hereden.
	 */
	public abstract void hacerSonido();
	
	public void caminar() {
		System.out.println("Caminando...");
		System.out.println("Caminando...");
		System.out.println("Ya me cansé");
	}
}
