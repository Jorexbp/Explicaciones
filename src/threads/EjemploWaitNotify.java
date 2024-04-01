package threads;
public class EjemploWaitNotify {
    public static void main(String[] args) {
        final Procesador procesador = new Procesador();

        Thread hilo1 = new Thread(new Runnable() {
            public void run() {
                try {
                    procesador.producir();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread hilo2 = new Thread(new Runnable() {
            public void run() {
                try {
                    procesador.consumir();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Procesador {
        public void producir() throws InterruptedException {
            synchronized (this) {
                System.out.println("Hilo productor ejecutándose...");
                wait();
                System.out.println("Reanudado.");
            }
        }

        public void consumir() throws InterruptedException {
            Thread.sleep(1000); // Simular alguna tarea
            synchronized (this) {
                System.out.println("Hilo consumidor ejecutándose...");
                notify();
                Thread.sleep(3000); // Simular alguna tarea
            }
        }
    }
}
