package fundamentos;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Patrones {
	public static void main(String[] args) {

		String numeroTelefono = "12345-67-89";

		Pattern pattern =
				Pattern.compile("(\\d{3})-(\\d{2})-(\\d{2})-(\\d{2})");

		Matcher matcher = pattern.matcher(numeroTelefono);

		if (matcher.matches()) {
			System.out.println("El número de teléfono es válido.");
		} else {
			System.out.println("El número de teléfono no es válido.");
		}
	}

}
