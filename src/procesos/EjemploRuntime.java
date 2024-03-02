package procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploRuntime {
	public static void main(String[] args) {
		try {
			String comandos[] = { "calc" };
			Process proceso = Runtime.getRuntime().exec(comandos);

			BufferedReader reader = new BufferedReader(
						new InputStreamReader(proceso.getInputStream()));
			
			String linea;
			while ((linea = reader.readLine()) != null) {
				System.out.println(linea);
			}

			int exitCode = proceso.waitFor();
			System.out.println("Código de salida: " + exitCode);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
