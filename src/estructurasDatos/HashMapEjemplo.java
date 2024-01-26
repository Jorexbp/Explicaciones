package estructurasDatos;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapEjemplo {
	public static void main(String[] args) {

		HashMap<Integer, String> alumnos = new HashMap<>();

		alumnos.put(1, "Jorge");
		alumnos.put(42, "Luis");
		alumnos.put(69, "Alberto");

		for (Entry<Integer, String> entry : alumnos.entrySet()) {
			System.out.println(
					"Llave: " + entry.getKey() +
					" Valor: " + entry.getValue());
		}

	}

}
