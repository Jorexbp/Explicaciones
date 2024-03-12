package patrones;
public class EjemploFactory {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

     
        Producto producto = fabrica.crearProducto();

       
        producto.operacion(); 
    }
}
