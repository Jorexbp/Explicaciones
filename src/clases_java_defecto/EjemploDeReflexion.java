package clases_java_defecto;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EjemploDeReflexion {
	public static void main(String[] args) {

		Class<?> clasePersona = Persona.class;

		System.out.println("Campos de la clase Persona:");
		Field[] campos = clasePersona.getDeclaredFields();
		for (Field campo : campos) {
			System.out.println("Nombre del campo: " +
						campo.getName());

			System.out.println("Tipo del campo: " +
						campo.getType().getSimpleName());
		}

		System.out.println("\nMétodos de la clase Persona:");

		Method[] metodos = clasePersona.getDeclaredMethods();

		for (Method metodo : metodos) {

			System.out.println("Nombre del método: " + metodo.getName());

			System.out.println("Tipo de retorno del método: " +
					metodo.getReturnType().getSimpleName());

			System.out.println("Parámetros del método:");

			Class<?>[] parametros = metodo.getParameterTypes();
			for (Class<?> parametro : parametros) {
				System.out.println(" - " + parametro.getSimpleName());
			}
		}
	}
}
