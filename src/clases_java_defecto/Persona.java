package clases_java_defecto;
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar(boolean hombre) {
        System.out.println("Hola, soy " +
        		nombre + " y tengo " + edad + " años."
        				+ " y soy "+(hombre?"hombre":"mujer"));
    }
}
