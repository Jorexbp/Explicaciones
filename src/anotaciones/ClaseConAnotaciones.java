package anotaciones;

import java.lang.reflect.Method;

public class ClaseConAnotaciones {


    @Anotacion1(mensaje = "Este es un mensaje de Anotacion1")
    public void metodoAnotadoCon1() {
        System.out.println("Este método está anotado con Anotacion1.");
    }


    @Anotacion2(valor = 100)
    public void metodoAnotadoCon2() {
        System.out.println("Este método está anotado con Anotacion2.");
    }


    @Anotacion3(activo = false)
    public void metodoAnotadoCon3() {
        System.out.println("Este método está anotado con Anotacion3.");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        ClaseConAnotaciones objeto = new ClaseConAnotaciones();
        objeto.metodoAnotadoCon1();
        objeto.metodoAnotadoCon2();
        objeto.metodoAnotadoCon3();
        
        Method[] methods = objeto.getClass().getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Anotacion1.class)) {
                String descripcion1 = method.getAnnotation(Anotacion1.class)
                		.mensaje();
                
                System.out.println("Descripción del método anotado"
                		+ " con Anotacion1: " + descripcion1);
            }
            if (method.isAnnotationPresent(Anotacion2.class)) {
                int descripcion2 = method.getAnnotation(Anotacion2.class)
                		.valor();
                
                System.out.println("Descripción del método anotado"
                		+ " con Anotacion2: " + descripcion2);
            }
            if (method.isAnnotationPresent(Anotacion3.class)) {
                boolean descripcion3 = method.getAnnotation(Anotacion3.class)
                		.activo();
                
                System.out.println("Descripción del método anotado"
                		+ " con Anotacion3: " + descripcion3);
            }
        }
    }
}
