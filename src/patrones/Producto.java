package patrones;

interface Producto {
    void operacion();
}


class ProductoConcreto implements Producto {
    @Override
    public void operacion() {
        System.out.println("Operación en ProductoConcreto");
    }
}


class Fabrica {
    public Producto crearProducto() {
        return new ProductoConcreto();
    }
}
