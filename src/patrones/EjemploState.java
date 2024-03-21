package patrones;

interface EstadoConexion {
    void conectar();
    void desconectar();
    void esperar();
}


class EstadoConectado implements EstadoConexion {
    @Override
    public void conectar() {
        System.out.println("Ya estás conectado");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando...");
    }

    @Override
    public void esperar() {
        System.out.println("Esperando...");
    }
}


class EstadoDesconectado implements EstadoConexion {
    @Override
    public void conectar() {
        System.out.println("Conectando...");
    }

    @Override
    public void desconectar() {
        System.out.println("Ya estás desconectado");
    }

    @Override
    public void esperar() {
        System.out.println("Esperando...");
    }
}


class EstadoEnEspera implements EstadoConexion {
    @Override
    public void conectar() {
        System.out.println("Conectando...");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando...");
    }

    @Override
    public void esperar() {
        System.out.println("Ya estás en espera");
    }
}


class Contexto {
    private EstadoConexion estado;

    public Contexto() {
        // Por defecto, comenzamos en estado desconectado
        estado = new EstadoDesconectado();
    }


    public void setEstado(EstadoConexion estado) {
        this.estado = estado;
    }

    public void conectar() {
        estado.conectar();
    }

    public void desconectar() {
        estado.desconectar();
    }

    public void esperar() {
        estado.esperar();
    }
}

public class EjemploState {
    public static void main(String[] args) {
    
        Contexto contexto = new Contexto();

      
        contexto.conectar();
        contexto.desconectar();

  
        contexto.setEstado(new EstadoConectado());
        contexto.conectar();
        contexto.esperar();
    }
}
