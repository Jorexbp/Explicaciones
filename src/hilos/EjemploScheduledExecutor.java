package hilos;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploScheduledExecutor {

    public static void main(String[] args) {
        ScheduledExecutorService executor =
        		Executors.newScheduledThreadPool(1);

        executor.schedule(
        		new TareaSimple("Tarea de un uso"),
        		2, TimeUnit.SECONDS);
        

        executor.scheduleAtFixedRate(
        		new TareaSimple("Tarea cada 3s"), 0,
        		3, TimeUnit.SECONDS);

        
        executor.scheduleWithFixedDelay(
        		new TareaSimple("Tarea cada 1s"), 0,
        		1, TimeUnit.SECONDS);
    }
}

class TareaSimple implements Runnable {
    private String mensaje;

    public TareaSimple(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        System.out.println(mensaje);
    }
}
