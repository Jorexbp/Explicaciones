package userIO;

import java.util.Scanner;

public class UsuarioIO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos a hacer una suma");
		
		System.out.println("Introduzca el primer número: ");
		int num1 = sc.nextInt(); // Mucho cuidado -> try/catch, controlar
		
		System.out.println("Introduzca el segundo número: ");
		int num2 = sc.nextInt();// Mucho cuidado -> try/catch, controlar
		
		int suma = num1 + num2;
		
		System.out.println("La suma es: "+suma);
		sc.close(); // Cerramos flujo de entrada
	}
}
