package estructurasDatos;

import java.util.Queue;
import java.util.LinkedList;

public class QueueEjemplo {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.offer("Elemento 1");
        cola.offer("Elemento 2");
        cola.offer("Elemento 3");

        String primerElemento = cola.poll();
        System.out.println("Primer elemento de la cola: " + primerElemento);

        String primerElementoSinEliminar = cola.peek();
        System.out.println("Primer elemento de la cola sin eliminar: " + primerElementoSinEliminar);

        System.out.println("Elementos de la cola:");
        for (String elemento : cola) {
            System.out.println(elemento);
        }
    }
}
