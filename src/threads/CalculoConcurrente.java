package threads;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CalculoConcurrente {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        List<Future<Long>> resultados = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Future<Long> resultado = executor.submit(new CalculoFactorial(i));
            resultados.add(resultado);
        }

         for (Future<Long> resultado : resultados) {
            try {
                System.out.println("Factorial: " + resultado.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

          executor.shutdown();
    }

    static class CalculoFactorial implements Callable<Long> {
        private int numero;

        public CalculoFactorial(int numero) {
            this.numero = numero;
        }

        public Long call() {
            long factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
