package hilos;

import java.util.concurrent.locks.ReentrantLock;

public class Sincronizacion {

    // Un contador común para todos
    private static int contador = 0;

    // Todo el método sincronizado
    public synchronized static void metodoSincronizado() {
        contador++;
        System.out.println("Método sincronizado: Contador = "
        											+ contador);
    }

  
    public static void bloqueSincronizado() {
    	// Solo una parte sincronizada
        synchronized (Sincronizacion.class) {
            contador++;
            System.out.println("Bloque sincronizado: Contador = "
            											+ contador);
        }
    }

   public static void usoDeLock() {
	   // Aquí uso ReentrantLock
	    ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            contador++;
            System.out.println("Uso de ReentrantLock:"
            					+ " Contador = " + contador);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                metodoSincronizado();
                bloqueSincronizado();
                usoDeLock();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                metodoSincronizado();
                bloqueSincronizado();
                usoDeLock();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Valor final del contador: " + contador);
    }
}

