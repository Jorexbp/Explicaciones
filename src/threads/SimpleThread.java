package threads;
public class SimpleThread extends Thread {
    public void run() {
        System.out.println("Hola, soy un thread simple.");
    }

    public static void main(String[] args) {
        SimpleThread thread = new SimpleThread();
        thread.start();
    }
}
