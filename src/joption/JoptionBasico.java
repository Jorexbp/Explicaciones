package joption;

import javax.swing.JOptionPane;

public class JoptionBasico {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "¡Hooola mundo!");
	   // JOptionPane.showMessageDialog(null, "Esto es un mensaje de error.",
		// 										"Error", JOptionPane.ERROR_MESSAGE);

		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");

		int edad = Integer.parseInt(JOptionPane.showInputDialog
												  ("Introduce tu edad"));

		JOptionPane.showMessageDialog(null, "Te llamas " + nombre +
											" y tienes " + edad + " años");
		
		  int respuesta = JOptionPane.showConfirmDialog(null,
				  "¿Estás seguro de continuar?", "Confirmar",
				  JOptionPane.YES_NO_OPTION);
		  
		  
	        if (respuesta == JOptionPane.YES_OPTION) {
	            System.out.println(nombre+" ha confirmado");
	        } else {
	        	 System.out.println(nombre+" ha denegado");
	        }
		
		
		
		 String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};

	        int seleccion = JOptionPane.showOptionDialog(
	                null,
	                "Elige una opción:",
	                "Selecciona",
	                JOptionPane.DEFAULT_OPTION,
	                JOptionPane.QUESTION_MESSAGE,
	                null,
	                opciones,
	                opciones[0]);

	        if (seleccion == 0) {
	            System.out.println("Seleccionaste la Opción 1");
	        } else if (seleccion == 1) {
	            System.out.println("Seleccionaste la Opción 2");
	        } else if (seleccion == 2) {
	            System.out.println("Seleccionaste la Opción 3");
	        } else {
	            System.out.println("No se seleccionó ninguna opción");
	        }
		
		
	}
}
