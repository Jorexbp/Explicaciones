package hilos;

public class MiHilo extends Thread {

	public void run() {
		System.out.println("Hilo '" +
					Thread.currentThread().getName() + "' iniciado.");
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("Hilo '" +
							Thread.currentThread().getName() +
								"' ejecutando, contador: " + i);

				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {}
		
		System.out.println("Hilo '" +
					Thread.currentThread().getName() + "' finalizado.");
	}
}