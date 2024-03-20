package patrones;
import java.util.Stack;


class EditorTextoMemento {
    private final String texto;

    public EditorTextoMemento(String texto) {
        this.texto = texto;
    }

    public String getTextoGuardado() {
        return texto;
    }
}


class EditorTexto {
    private String texto;

    public void escribirTexto(String texto) {
        this.texto = texto;
    }

    public String obtenerTexto() {
        return texto;
    }

    public EditorTextoMemento guardar() {
        return new EditorTextoMemento(texto);
    }

    public void restaurar(EditorTextoMemento memento) {
        texto = memento.getTextoGuardado();
    }
}


class Historial {
    private final Stack<EditorTextoMemento> historial = new Stack<>();

    public void guardar(EditorTextoMemento memento) {
        historial.push(memento);
    }

    public EditorTextoMemento obtenerUltimo() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
}

public class EjemploMemento {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Historial historial = new Historial();

        editor.escribirTexto("Primer texto");
        historial.guardar(editor.guardar());

         editor.escribirTexto("Segundo texto");
        historial.guardar(editor.guardar());

        editor.restaurar(historial.obtenerUltimo());

        System.out.println("Texto actual: " + editor.obtenerTexto());
    }
}
