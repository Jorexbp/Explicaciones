package threads;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class EjemploReentrantLock {
    private Lock lock = new ReentrantLock();
    private int count = 0;

    public void incrementar() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final EjemploReentrantLock ejemplo = new EjemploReentrantLock();

        Thread hilo1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    ejemplo.incrementar();
                }
            }
        });

        Thread hilo2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    ejemplo.incrementar();
                }
            }
        });

        hilo1.start();
        hilo2.start();
        hilo1.join();
        hilo2.join();

        System.out.println("Contador: " + ejemplo.count);
    }
}
