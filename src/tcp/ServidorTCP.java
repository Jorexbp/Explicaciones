package tcp;

import java.io.*;
import java.net.*;

public class ServidorTCP {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Servidor TCP iniciado."
            				+ " Esperando conexión...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Cliente conectado desde: " +
            				clientSocket.getInetAddress());

            BufferedReader in = new BufferedReader(
            			new InputStreamReader(clientSocket.getInputStream()));
            
            PrintWriter out = new PrintWriter(
            			clientSocket.getOutputStream(), true);

            String mensajeCliente = in.readLine();
            System.out.println("Mensaje recibido del cliente: " +
            							mensajeCliente);

            out.println("¡Hola desde el servidor!");

            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

