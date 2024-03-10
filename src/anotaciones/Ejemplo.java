package anotaciones;
public class Ejemplo {

    @MiAnotacion("Este es un mensaje personalizado")
    public void miMetodo(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    public static void main(String[] args) throws Exception {
        Ejemplo ejemplo = new Ejemplo();
        ejemplo.miMetodo("Hola, mundo!");

    
        Class<?> clase = ejemplo.getClass();
        java.lang.reflect.Method metodo = clase.getMethod("miMetodo", String.class);

        // Verifico si el método está anotado con @MiAnotacion
        if (metodo.isAnnotationPresent(MiAnotacion.class)) {
         
            MiAnotacion anotacion = metodo.getAnnotation(MiAnotacion.class);

          
            System.out.println("Mensaje de la anotación: " + anotacion.value());
        }

      
        ejemplo.miMetodo("Hola, mundo!");
    }
}
