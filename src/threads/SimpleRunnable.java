package threads;
public class SimpleRunnable implements Runnable {
    public void run() {
        System.out.println("Hola, soy un runnable simple.");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new SimpleRunnable());
        thread.start();
    }
}
