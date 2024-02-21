package windowbuilder;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class InicioWindow {
	  public static void main(String[] args) {
	        JFrame ventana = new JFrame("Frame ejemplo");

	        ventana.setSize(400, 300);
	        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JLabel etiqueta = new JLabel("¡Hola, Mundo!");
	        
	        ventana.add(etiqueta);
	        ventana.setVisible(true);
	    }
}
