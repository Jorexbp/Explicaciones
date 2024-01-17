package clase_abstract;

public class Cerdito extends AnimalAbstracto {
	
	@Override
	public void hacerSonido() {
		System.out.println("Oink Oink 🐖");
	}

	public static void main(String[] args) {
		Cerdito cerdoEjemplo = new Cerdito();
		
		cerdoEjemplo.hacerSonido();
		cerdoEjemplo.caminar();
	}

	

}
