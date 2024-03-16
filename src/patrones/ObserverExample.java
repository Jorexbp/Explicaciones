package patrones;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

class Observable {
	
	// El estado que queremos observar
	private int valor; 

	// Este objeto será el que maneje los observadores
	private PropertyChangeSupport support;

	public Observable() {
		support = new PropertyChangeSupport(this); 
	}

	public void añadirObservador(PropertyChangeListener listener) {
		support.addPropertyChangeListener(listener);
	}

	public void eliminarObservador(PropertyChangeListener listener) {
		support.removePropertyChangeListener(listener);
	}

	public int getValue() {
		return valor;
	}

	
	public void setValue(int valor) {
		int oldValue = this.valor;
		this.valor = valor;
		// Notifica a los observadores que ha cambiado el valor,
		// pasando el nombre de la propiedad,
		// el valor antiguo y el valor nuevo
		support.firePropertyChange("valor", oldValue, valor);
	}
}

// Clase observadora que implementa PropertyChangeListener
class Observer implements PropertyChangeListener {
	@Override
	// Método llamado cuando cambia el estado observado
	public void propertyChange(java.beans.PropertyChangeEvent evt) {
		System.out.println("Valor cambiado a: " + evt.getNewValue());
	}
}

public class ObserverExample {
	public static void main(String[] args) {
		Observable observable = new Observable(); 
		Observer observer = new Observer(); 
		observable.añadirObservador(observer); 


		observable.setValue(10);
		observable.setValue(20);
	}
}
