package anotaciones;

public class EjemploClase {

    @Anotacion4(descripcion = "Este es un campo anotado con Anotacion4")
    private String campoAnotado;

    public String getCampoAnotado() {
        return campoAnotado;
    }

    public void setCampoAnotado(String campoAnotado) {
        this.campoAnotado = campoAnotado;
    }

    public static void main(String[] args) {
        EjemploClase ejemplo = new EjemploClase();

        // Accediendo al campo anotado
        String descripcion = ejemplo.getClass().
        		getDeclaredFields()[0].getAnnotation(Anotacion4.class)
        		.descripcion();
        
        System.out.println("Descripción del campo anotado: " + descripcion);
    }
}
