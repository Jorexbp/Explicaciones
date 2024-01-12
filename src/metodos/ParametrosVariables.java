package metodos;

public class ParametrosVariables {
	
	public static int sumarNumeros(int ...n) {
		int suma = 0;
		for (int i : n) {
			suma +=i;
		}
		return suma;
	}
	
	public static void main(String[] args) {
		// ¿Qué son los parámetros variables?
		
		/*
		 * Es la manera de permitir que un método
		 * pueda recibir la cantidad de parámetros
		 * siempre que sean del mismo tipo de dato
		 */
		
		int suma = sumarNumeros(1,2,3,4,5);
		System.out.println("Primera suma: "+suma);
		
		int sumaDos = sumarNumeros(5,6);
		System.out.println("Segunda suma: "+sumaDos);
		
	}

}
