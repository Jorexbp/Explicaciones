package patrones;

interface Componente {
    void operacion();
}


class ComponenteConcreto implements Componente {
    public void operacion() {
        System.out.println("Operación en ComponenteConcreto");
    }
}


abstract class Decorador implements Componente {
    protected Componente componente;

    public Decorador(Componente componente) {
        this.componente = componente;
    }

    public void operacion() {
        componente.operacion();
    }
}


class DecoradorConcreto extends Decorador {
    public DecoradorConcreto(Componente componente) {
        super(componente);
    }

    public void operacion() {
        super.operacion();
        agregarFuncionalidad();
    }

    private void agregarFuncionalidad() {
        System.out.println("Funcionalidad adicional agregada por DecoradorConcreto");
    }
}

public class EjemploDecorator {
    public static void main(String[] args) {

        Componente componente = new ComponenteConcreto();
        Componente decorador = new DecoradorConcreto(componente);
        decorador.operacion();
    }
}
