package clases_java_defecto;

public class MatesEnJava {
	public static void main(String[] args) {
		// 1,00 EUR = 39,275 BOL VENZ
		double bolivar = 39.275;
		System.out.println("Un euro son " + bolivar + " bolívares venezolanos");

		double redondeado = Math.round(bolivar);// Math.round() -> redondea al más próximo
		double redondeadoBajo = Math.floor(bolivar);// Math.floor() -> redondea al más pequeño
		double redondeadoAlto = Math.ceil(bolivar);// Math.ceil() -> redondea al más grande

		System.out.println("Redondeando son: " + redondeado);
		System.out.println("Redondeando al menor son: " + redondeadoBajo);
		System.out.println("Redondeando al mayor son: " + redondeadoAlto);

		// MAX - MIN

		int unNumero = 5;
		int otroNumero = 2;

		int numeroMayor = Math.max(unNumero, otroNumero);
		int numeroMenor = Math.min(unNumero, otroNumero);

		System.out.println("El número mayor es: " + numeroMayor);
		System.out.println("El número menor es: " + numeroMenor);

		// POW POW POWER

		int numBase = 3;
		int numExponente = 2;

		double numeroExponenciado = Math.pow(numBase, numExponente);
		System.out.println(numeroExponenciado);
	}
}
