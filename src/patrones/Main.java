package patrones;

interface Visitor {
    void visit(CirculoEjemplo circulo);
    void visit(Rectangulo rectangulo);
}

interface FormaEjemplo {
    void accept(Visitor visitor);
}

class CirculoEjemplo implements FormaEjemplo {
    private double radio;

    public CirculoEjemplo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Rectangulo implements FormaEjemplo {
    private double longitud;
    private double anchura;

    public Rectangulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }

    public double getLongitud() {
        return longitud;
    }

    public double getAnchura() {
        return anchura;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
}
class CalculadorAreaVisitor implements Visitor {
    @Override
    public void visit(CirculoEjemplo circulo) {
        double area = Math.PI * Math.pow(circulo.getRadio(), 2);
        System.out.println("Área del círculo: " + area);
    }

    @Override
    public void visit(Rectangulo rectangulo) {
        double area = rectangulo.getLongitud() * rectangulo.getAnchura();
        System.out.println("Área del rectángulo: " + area);
    }
    

}
public class Main {
    public static void main(String[] args) {
        FormaEjemplo circulo = new CirculoEjemplo(5);
        FormaEjemplo rectangulo = new Rectangulo(4, 6);

        // Creamos un visitor para calcular el área
        Visitor calculadorArea = new CalculadorAreaVisitor();

        // Aplicamos el visitor a cada forma geométrica
        circulo.accept(calculadorArea);
        rectangulo.accept(calculadorArea);
    }
}

