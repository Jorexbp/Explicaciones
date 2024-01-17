package clase_enum;

public class Ejemplo {
	public static void main(String[] args) {
		
//		for (ClaseEnumerada variableEnum : ClaseEnumerada.values()) {
//			System.out.println(variableEnum);
//		}
		
		ClaseEnumerada nivel = ClaseEnumerada.ALTO;
		
		
		switch (nivel) {
		case ALTO: {
			System.out.println("El nivel es alto");
			break;
		}
		case MEDIO: {
			System.out.println("El nivel es medio");
			break;
		}
		case BAJO: {
			System.out.println("El nivel es bajo");
			break;
		}
		default:
			throw new
				IllegalArgumentException("Unexpected value: " + nivel);
		}
		
		

	}
}
