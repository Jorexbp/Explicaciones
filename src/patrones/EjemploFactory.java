package patrones;
public class EjemploFactory {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        // Se crea un producto utilizando la fábrica
        Producto producto = fabrica.crearProducto();

        // Se realiza alguna operación con el producto
        producto.operacion(); // Imprime "Operación en ProductoConcreto"
    }
}
