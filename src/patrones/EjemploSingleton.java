package patrones;
public class EjemploSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstancia();
        Singleton singleton2 = Singleton.getInstancia();

        System.out.println(singleton1 == singleton2); 
    }
}
