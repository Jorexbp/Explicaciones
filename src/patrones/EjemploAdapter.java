package patrones;

// Interfaz objetivo
interface Objetivo {
    void metodoObjetivo();
}

// Clase que implementa la interfaz objetivo
class ClaseObjetivo implements Objetivo {
    public void metodoObjetivo() {
        System.out.println("Método de la clase objetivo");
    }
}

// Interfaz que necesitamos adaptar
interface Adaptable {
    // Define el método adaptable que las clases deben implementar
	void metodoAdaptable();
}

// Clase que implementa la interfaz adaptable
// pero no es compatible con la interfaz objetivo
class ClaseAdaptable implements Adaptable {
	@Override
	public void metodoAdaptable() {
        System.out.println("Método de la clase adaptable");
    }
}

// Adaptador que convierte la interfaz adaptable en la interfaz objetivo
class Adaptador implements Objetivo {
    private ClaseAdaptable adaptable; 

   public Adaptador(ClaseAdaptable adaptable) {
        this.adaptable = adaptable;
    }

    @Override
    public void metodoObjetivo() {
        adaptable.metodoAdaptable(); // Llama al método de la clase adaptable
    }
}

public class EjemploAdapter {
    public static void main(String[] args) {
        // Usando el adaptador para llamar al método de la clase adaptable
        // a través de la interfaz objetivo
    	
    	// Creamos una instancia de la clase adaptable
        ClaseAdaptable adaptable = new ClaseAdaptable();
        
        // Creamos una instancia del adaptador, pasándole la instancia de la clase adaptable
        Objetivo adaptador = new Adaptador(adaptable);
        
        // Llamamos al método objetivo a través del adaptador,
        // que en realidad llama al método de la clase adaptable
        adaptador.metodoObjetivo(); 
      }
}
