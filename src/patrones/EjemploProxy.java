package patrones;
// Interfaz Sujeto
interface Sujeto {
    void operacion();
}

// Clase RealSujeto
class RealSujeto implements Sujeto {
    public void operacion() {
        System.out.println("Operación en RealSujeto");
    }
}

// Proxy que controla el acceso al objeto RealSujeto
class Proxy implements Sujeto {
    private RealSujeto realSujeto;

    public void operacion() {
        if (realSujeto == null) {
            realSujeto = new RealSujeto();
        }
        // Lógica adicional del proxy antes de llamar al objeto real
        System.out.println("Lógica adicional en el Proxy");
        realSujeto.operacion();
    }
}

public class EjemploProxy {
    public static void main(String[] args) {
        // Usando el proxy para controlar el acceso al objeto real
        Sujeto proxy = new Proxy();
        proxy.operacion();
    }
}
