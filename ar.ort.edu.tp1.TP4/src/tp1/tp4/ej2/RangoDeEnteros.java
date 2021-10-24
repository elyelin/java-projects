package tp1.tp4.ej2;

public class RangoDeEnteros {
	private int min;
	private int max;

	public RangoDeEnteros(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public boolean estaEnRango(int numero) {
		return numero >= min && numero <= max;
	}
}
