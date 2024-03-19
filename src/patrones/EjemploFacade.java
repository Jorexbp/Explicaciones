package patrones;
// Subsistema: Clase para operaciones matemáticas básicas
class Suma {
    public int sumar(int a, int b) {
        return a + b;
    }
}

class Resta {
    public int restar(int a, int b) {
        return a - b;
    }
}

class Multiplicacion {
    public int multiplicar(int a, int b) {
        return a * b;
    }
}

// Facade: Clase que proporciona una interfaz unificada para el subsistema
class Calculadora {
    private Suma suma;
    private Resta resta;
    private Multiplicacion multiplicacion;

    public Calculadora() {
        suma = new Suma();
        resta = new Resta();
        multiplicacion = new Multiplicacion();
    }

    public int sumar(int a, int b) {
        return suma.sumar(a, b);
    }

    public int restar(int a, int b) {
        return resta.restar(a, b);
    }

    public int multiplicar(int a, int b) {
        return multiplicacion.multiplicar(a, b);
    }
}

// Cliente: Usa la fachada para realizar operaciones matemáticas
public class EjemploFacade {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Usando la fachada para realizar operaciones
        int resultadoSuma = calculadora.sumar(5, 3);
        int resultadoResta = calculadora.restar(10, 4);
        int resultadoMultiplicacion = calculadora.multiplicar(2, 6);

        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);
    }
}
