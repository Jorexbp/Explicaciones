package hilos;
import java.util.Timer;
import java.util.TimerTask;

public class EjemploTimer {

    public static void main(String[] args) {
        Timer timer = new Timer();

        tarea tarea1 = new tarea();
        tarea tarea2 = new tarea();

        timer.scheduleAtFixedRate(tarea1, 1000, 3000);
        timer.scheduleAtFixedRate(tarea2, 0, 5000);

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timer.cancel();
        System.out.println("¡Se acabó!");
    }
}

class tarea extends TimerTask {
    private static int contador = 1;

    @Override
    public void run() {
        System.out.println("¡Tarea " + contador + " ejecutada!");
        contador++;
    }
}
