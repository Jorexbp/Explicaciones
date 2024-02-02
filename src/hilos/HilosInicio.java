package hilos;

public class HilosInicio {

    public static void main(String[] args) {

    	MiHilo hiloNormal = new MiHilo();
    	
    	MiHiloRun runable = new MiHiloRun();
    	Thread hiloRunnable = new Thread(runable);
    	

    	hiloNormal.start();
    	hiloRunnable.start();
    }

 
}
