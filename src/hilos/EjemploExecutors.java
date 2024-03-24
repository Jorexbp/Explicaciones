package hilos;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EjemploExecutors {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            Runnable tarea = new Tarea(i);
            executor.execute(tarea);
        }

        executor.shutdown();
    }
}

class Tarea implements Runnable {
    private int id;

    public Tarea(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Tarea " + id + " ejecutándose en el hilo: " + Thread.currentThread().getName());
    }
}
