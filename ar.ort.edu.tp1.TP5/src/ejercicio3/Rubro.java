package ejercicio3;

public class Rubro {
	private int TOTAL_MESES = 12;
	private String nombre;
	private Double[] gastosPorMes;

	public Rubro(String nombre) {
		this.nombre = nombre;
		inicializarGastos();
	}

	private void inicializarGastos() {
		gastosPorMes = new Double[TOTAL_MESES];
	}

}
