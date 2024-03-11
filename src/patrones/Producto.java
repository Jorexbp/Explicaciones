package patrones;
// Producto
interface Producto {
    void operacion();
}

// Implementación de un producto específico
class ProductoConcreto implements Producto {
    @Override
    public void operacion() {
        System.out.println("Operación en ProductoConcreto");
    }
}

// Fábrica de productos
class Fabrica {
    public Producto crearProducto() {
        return new ProductoConcreto();
    }
}
