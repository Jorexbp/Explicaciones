package patrones;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class EjemploDelayQueue {

    public static void main(String[] args) {
        DelayQueue<DelayedElement> delayQueue = new DelayQueue<>();

        delayQueue.offer(new DelayedElement("Elemento 1", 1000));
        delayQueue.offer(new DelayedElement("Elemento 2", 5000));
        delayQueue.offer(new DelayedElement("Elemento 3", 3000));

       try {
            while (!delayQueue.isEmpty()) {
                DelayedElement element = delayQueue.take();
                System.out.println("Elemento retirado: " + element);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DelayedElement implements Delayed {
    private String name;
    private long expiryTime;

    public DelayedElement(String name, long delay) {
        this.name = name;
        this.expiryTime = System.currentTimeMillis() + delay;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = expiryTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        long diff = this.expiryTime - ((DelayedElement) o).expiryTime;
        return Long.compare(diff, 0);
    }

    @Override
    public String toString() {
        return name;
    }
}
