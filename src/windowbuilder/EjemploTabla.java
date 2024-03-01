package windowbuilder;

import javax.swing.*;
import java.awt.*;

public class EjemploTabla {
	public static void main(String[] args) {
		Object[][] datos =
			{ 
				{ "Juan", 30, "Ingeniero" },
				{ "María", 25, "Diseñador" },
				{ "Pedro", 35, "Programador" }
												};

		String[] columnas = { "Nombre", "Edad", "Profesión" };

		JTable tabla = new JTable(datos, columnas);

		JScrollPane panelScroll = new JScrollPane(tabla);

		JFrame frame = new JFrame("Ejemplo de JTable");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(panelScroll, BorderLayout.CENTER);
		frame.setSize(500, 150);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}