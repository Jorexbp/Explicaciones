package fundamentos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fechas {
	public static void main(String[] args) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha = new Date();
		
		String fechaFormateada = formato.format(fecha);
		System.out.println("Fecha formateada: " + fechaFormateada);

		String cadenaFecha = "23/06/2021";
		try {
			Date fechaAnalizada = formato.parse(cadenaFecha);
			System.out.println("Fecha analizada: " + fechaAnalizada);
			System.out.println("Fecha parseada: " + formato.format(fechaAnalizada));
		} catch (ParseException e) {
			System.out.println("Error al analizar la fecha: " + e.getMessage());
		}
	}
}
