package ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir_Leer {
	public static void main(String[] args) throws IOException {
		String rutaFichero = System.getProperty("user.home")+"/Desktop/DocumentoTXT.txt";
		
		File archivo = new File(rutaFichero);
		if(archivo.createNewFile()) {
			System.out.println("Fichero creado");
		}else {
			System.out.println("Fichero no creado");
		}
		
		String escritura = "¡Hola mundo!";
	    BufferedWriter writer = new BufferedWriter(new FileWriter(rutaFichero));
	    writer.write(escritura);
	    
	    writer.close();
	}

}
