package userIO;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class AccesoAleatorioFichero {

	private static void leerFichero(RandomAccessFile f) throws IOException {
		f.seek(0); // VOLVER A 0
		String cadena = f.readLine();
		while (cadena != null) {
			System.out.println(cadena);
			cadena = f.readLine();
		}
	}

	public static void main(String[] args) throws IOException {
		String entrada;

		RandomAccessFile fichero = new RandomAccessFile("Ejemplo.txt", "rw");
		long longitud = fichero.length(); // NO CUENTA LOS ESPACIOS EN BLANCO
		System.out.println("La longitud del fichero es de " + longitud + " caracteres");
		leerFichero(fichero);
		Scanner ent = new Scanner(System.in);
		System.out.println("Introduzca la cadena a añadir");
		entrada = ent.nextLine();

		fichero.seek(20); // DONDE ESCRIBIR
		System.out.println("Va a escribir en la posición: " + fichero.getFilePointer());
		fichero.writeBytes(entrada); // ESCRIBIR...

		leerFichero(fichero);

	}
}