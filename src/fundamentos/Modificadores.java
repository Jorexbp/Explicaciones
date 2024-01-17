package fundamentos;

public class Modificadores {
	
	// Modificadores de acceso para métodos y atributos
	public String nombre; 
	boolean estaVivo;
	protected double peso;
	private int edad;
	
	// Modificador de mutabilidad solo para atributos
	final String DNI = "76289823K";
	transient char inicial; // Serialización
	volatile int variableVolatil; // Sincronización
	
	// Modificadores solo para métodos
	
	// Solo permite una ejecucíon por hilo simultáneamente	
	 synchronized void metodoSincronizado(int n)
	    {
	        for (int i = 1; i <= 3; i++) {
	            System.out.println(n + i);
	        }
	    }
}
