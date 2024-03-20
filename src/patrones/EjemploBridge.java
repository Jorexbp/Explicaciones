package patrones;
// Implementación: Interfaz para la implementación de las formas
interface ImplementacionForma {
    void dibujarForma();
}

// Implementaciones concretas: Implementación de formas en diferentes dispositivos
class ImplementacionPantalla implements ImplementacionForma {
    @Override
    public void dibujarForma() {
        System.out.println("Dibujando la forma en la pantalla");
    }
}

class ImplementacionImpresora implements ImplementacionForma {
    @Override
    public void dibujarForma() {
        System.out.println("Imprimiendo la forma");
    }
}

// Abstracción: Clase abstracta para las formas
abstract class Forma {
    protected ImplementacionForma implementacion;

    public Forma(ImplementacionForma implementacion) {
        this.implementacion = implementacion;
    }

    public abstract void dibujar();
}

// Abstracciones refinadas: Diferentes formas que extienden la abstracción
class Esfera extends Forma {
    public Esfera(ImplementacionForma implementacion) {
        super(implementacion);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una esfera");
        implementacion.dibujarForma();
    }
}

class Cuadrado extends Forma {
    public Cuadrado(ImplementacionForma implementacion) {
        super(implementacion);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
        implementacion.dibujarForma();
    }
}

// Cliente: Utiliza las abstracciones para dibujar las formas en diferentes dispositivos
public class EjemploBridge {
    public static void main(String[] args) {
        ImplementacionForma implementacionPantalla = new ImplementacionPantalla();
        ImplementacionForma implementacionImpresora = new ImplementacionImpresora();

        Forma circuloPantalla = new Esfera(implementacionPantalla);
        circuloPantalla.dibujar();

        Forma cuadradoImpresora = new Cuadrado(implementacionImpresora);
        cuadradoImpresora.dibujar();
    }
}
