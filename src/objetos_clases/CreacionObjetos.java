package objetos_clases;

public class CreacionObjetos {
	public static void main(String[] args) {
		ClaseEjemplo objetoEjemplo = new ClaseEjemplo("Jorge", 19);
		
		System.out.println(objetoEjemplo.getNombre());
		System.out.println(objetoEjemplo.getEdad());
		
	}
}
