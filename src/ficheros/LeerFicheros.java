package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheros {
	public static void main(String[] args) {
		String rutaArchivo = System.getProperty("user.home")+"/Desktop/DocumentoTXT.txt";

		try {
			FileReader fileReader = new FileReader(rutaArchivo);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String linea;
			while ((linea = bufferedReader.readLine()) != null) {
				System.out.println(linea);
			}

			bufferedReader.close();
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
