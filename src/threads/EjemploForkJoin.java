package threads;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class EjemploForkJoin {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(
        		Runtime.getRuntime().availableProcessors());
        
        Fibonacci fibonacci = new Fibonacci(10);
        
        int resultado = forkJoinPool.invoke(fibonacci);
        System.out.println("Resultado: " + resultado);
    }

    static class Fibonacci extends RecursiveTask<Integer> {
        final int n;

        Fibonacci(int n) {
            this.n = n;
        }

        protected Integer compute() {
            if (n <= 1)
                return n;
            Fibonacci f1 = new Fibonacci(n - 1);
            f1.fork();
            Fibonacci f2 = new Fibonacci(n - 2);
            return f2.compute() + f1.join();
        }
    }
}
