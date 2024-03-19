package patrones;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

// Interfaz Flyweight
interface Figura {
	void dibujar(int x, int y);
}

// Clase concreta Flyweight
class Circulo implements Figura {
	private Color color;

	public Circulo(Color color) {
		this.color = color;
	}

	@Override
	public void dibujar(int x, int y) {
		System.out.println("Dibujando un círculo en las coordenadas (" + x + ", " + y + ") de color " + color);
	}
}

// Factory para crear y gestionar objetos Flyweight
class FiguraFactory {
	private static final Map<Color, Figura> circulos = new HashMap<>();

	public static Figura obtenerCirculo(Color color) {
		Figura circulo = circulos.get(color);

		if (circulo == null) {
			circulo = new Circulo(color);
			circulos.put(color, circulo);
		}

		return circulo;
	}
}

public class EjemploFlyweight {

	private static final Color[] COLORES = { Color.RED, Color.GREEN, Color.BLUE };

	private static Color obtenerColorAleatorio() {
		return COLORES[(int) (Math.random() * COLORES.length)];
	}

	private static int obtenerXAleatorio() {
		return (int) (Math.random() * 100);
	}

	private static int obtenerYAleatorio() {
		return (int) (Math.random() * 100);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 3; ++i) {
			Figura circulo = FiguraFactory.obtenerCirculo(obtenerColorAleatorio());
			circulo.dibujar(obtenerXAleatorio(), obtenerYAleatorio());
		}
	}

}
