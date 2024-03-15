package patrones;

interface Sujeto {
    void operacion();
}


class RealSujeto implements Sujeto {
    public void operacion() {
        System.out.println("Operación en RealSujeto");
    }
}


class Proxy implements Sujeto {
    private RealSujeto realSujeto;

    public void operacion() {
        if (realSujeto == null) {
            realSujeto = new RealSujeto();
        }
      
        System.out.println("Algo en el proxy"
        		+ " antes del comando");
        
        realSujeto.operacion();
    }
}

public class EjemploProxy {
    public static void main(String[] args) {
      
        Sujeto proxy = new Proxy();
        proxy.operacion();
    }
}
