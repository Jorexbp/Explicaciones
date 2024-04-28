package anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Este conjunto de anotaciones proporciona metadatos adicionales
//para los elementos de un programa Java.
//Las anotaciones están diseñadas para ser retenidas en tiempo
//de ejecución (RUNTIME), lo que permite su acceso mediante reflexión.
//Cada anotación tiene un objetivo (TARGET) específico, que determina
//en qué elementos del programa se pueden aplicar.

// Definición de las anotaciones
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Anotacion1 {
	String mensaje() default "";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Anotacion2 {
	int valor() default 0;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Anotacion3 {
	boolean activo() default true;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Anotacion4 {
	String descripcion() default "";
}
