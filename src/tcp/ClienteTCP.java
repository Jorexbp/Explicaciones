package tcp;

import java.io.*;
import java.net.*;

public class ClienteTCP {
	public static void main(String[] args) {
		try {

			Socket socket = new Socket("localhost", 12345);

			BufferedReader in = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
			
			PrintWriter out = new PrintWriter(
						socket.getOutputStream(), true);

			out.println("¡Hola desde el cliente!");

			String respuestaServidor = in.readLine();
			System.out.println("Respuesta del servidor: " +
						respuestaServidor);

			in.close();
			out.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
