package hilos;

public class MiHiloRun implements Runnable{
	private void contar() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Hilo '" +
						Thread.currentThread().getName() +
							"' ejecutando, contador: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		System.out.println("Hilo '" +
				Thread.currentThread().getName() +
						"' finalizado.");
	}

	@Override
	public void run() {
		contar();
	}

}
