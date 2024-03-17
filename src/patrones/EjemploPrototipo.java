package patrones;
import java.util.HashMap;
import java.util.Map;


interface Prototype {
    Prototype clonar();
}


class ConcretoPrototype implements Prototype {
    private String propiedad;

    public ConcretoPrototype(String propiedad) {
        this.propiedad = propiedad;
    }

    // Con esto puedo clonar la clase
    @Override
    public Prototype clonar() {
        return new ConcretoPrototype(propiedad);
    }

    public String getPropiedad() {
        return propiedad;
    }
}

// Aquí uso el prototipo para crear los objetos
class Cliente {
    private Map<String, Prototype> prototipos = new HashMap<>();

    public void agregarPrototipo(String key, Prototype prototipo) {
        prototipos.put(key, prototipo);
    }

    public Prototype obtenerPrototipo(String key) {
        return prototipos.get(key).clonar();
    }
}

public class EjemploPrototipo {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();

     
        cliente.agregarPrototipo("Primero", new ConcretoPrototype("Propiedad 1"));
        cliente.agregarPrototipo("Segundo", new ConcretoPrototype("Propiedad 2"));

     
        Prototype objeto1 = cliente.obtenerPrototipo("Primero");
        Prototype objeto2 = cliente.obtenerPrototipo("Segundo");

     
        System.out.println(objeto1 != objeto2); 

      
        System.out.println(((ConcretoPrototype) objeto1).getPropiedad());
        System.out.println(((ConcretoPrototype) objeto2).getPropiedad()); 
    }
}
