package clases_java_defecto;

import java.text.DecimalFormat;

public class DecimalFormatJava {
	
	public static void main(String[] args) {
		double numero = 8723.4124;
		
		DecimalFormat dfCeros = new DecimalFormat("000000.00000000");
		DecimalFormat dfAlm = new DecimalFormat("######.#########");
		DecimalFormat dfAlgunos = new DecimalFormat("####.##");
		DecimalFormat dfNoDecimal = new DecimalFormat("#####");
		
		System.out.println("Todo 0: "+dfCeros.format(numero));
		System.out.println("Todo #: "+dfAlm.format(numero));
		System.out.println("Algunos decimales: "+dfAlgunos.format(numero));
		System.out.println("Ningún decimal: "+dfNoDecimal.format(numero));
	}
}
