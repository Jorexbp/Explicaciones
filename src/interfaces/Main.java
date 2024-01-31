package interfaces;

public class Main {
	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado(15);

		System.out.println(cuadrado.calcularArea());
		System.out.println(cuadrado.calcularPerimetro());
	}
}
