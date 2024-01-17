package clase_enum;

public enum ClaseEnumerada {
	BAJO(0), MEDIO(1), ALTO(2);

	private int valor;

	ClaseEnumerada(int i) {
		this.valor = i;
	}

	public int getValor() {
		return this.valor;
	}

}
