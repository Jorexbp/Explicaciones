package estructurasDatos;

import java.util.Queue;
import java.util.LinkedList;

public class QueueEjemplo {
    public static void main(String[] args) {
    	// FIFO
        Queue<String> cajero = new LinkedList<>();

        cajero.offer("Jorge");
        cajero.offer("Luisa");
        cajero.offer("Fernanda");

        String primerCliente = cajero.poll();
        System.out.println("Primer elemento de la cola: " + primerCliente);

        primerCliente = cajero.peek();
        System.out.println("Primer elemento de la cola : " + primerCliente);

        System.out.println("Elementos de la cola:");
        for (String elemento : cajero) {
            System.out.println(elemento);
        }
    }
}
