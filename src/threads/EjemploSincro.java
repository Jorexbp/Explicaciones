package threads;
public class EjemploSincro {
    private int count = 0;

    public synchronized void incrementar() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        final EjemploSincro example = new EjemploSincro();

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    example.incrementar();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    example.incrementar();
                }
            }
        });

        thread1.start();
        thread2.start();
        
       

        System.out.println("Contador: " + example.count);
    }
}
