package hilos;
import java.util.concurrent.Semaphore;

public class EjemploSemaphore {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(new Trabajador(semaphore, "Trabajador " + i));
            t.start();
        }
    }
}

class Trabajador implements Runnable {
    private Semaphore semaphore;
    private String nombre;

    public Trabajador(Semaphore semaphore, String nombre) {
        this.semaphore = semaphore;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
            System.out.println(nombre + " está esperando para adquirir un permiso...");
            // El hilo intenta adquirir un permiso del semáforo
            semaphore.acquire();
            System.out.println(nombre + " ha adquirido un permiso.");

            Thread.sleep(2000);

            System.out.println(nombre + " está liberando el permiso...");
            // El hilo libera el permiso después de completar la tarea
            semaphore.release();
            System.out.println(nombre + " ha liberado el permiso.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
