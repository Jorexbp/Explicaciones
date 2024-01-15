package fundamentos;

public class Estaticidad {

	public static void main(String[] args) {
		
		// ¿Qué es static?
		
		/*
		 * La palabra static indica que esa variable
		 * o método pertenece a la propia clase en 
		 * vez de al objeto.
		 * 
		 */
		
		ClaseConStatic claseEst1 = new ClaseConStatic(1);
		claseEst1.saludarEstatico();
	
		ClaseConStatic claseEst2 = new ClaseConStatic(2);
		ClaseConStatic claseEst3 = new ClaseConStatic(3);
		
		
		System.out.println(claseEst2.getNumeroCreaciones());
		
		
	}

}
