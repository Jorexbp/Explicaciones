package threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EjemploExecutorService {
    public static void main(String[] args) {
        ExecutorService ejecutor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            ejecutor.submit(new Trabajador(i));
        }

        ejecutor.shutdown();
    }

    static class Trabajador implements Runnable {
        private int id;

        public Trabajador(int id) {
            this.id = id;
        }

        public void run() {
            System.out.println("El hilo " + id + " está trabajando.");
            try {
                Thread.sleep(1000); // Simular alguna tarea
                System.out.println("El hilo " + id + " acabó.");
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
