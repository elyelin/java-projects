package ar.edu.ort.tp1.pacial1.clases;

public class Silla extends Mueble {

	private static final int COEFICIENTE_SILLA = 3;
	//TODO A completar
	private long alto;
	
	//TODO A completar
	public Silla(String modelo, float costoBase, float porcentajeGanancia, long alto) {
		super(modelo, costoBase, porcentajeGanancia);
		this.alto = alto;
	}

	//TODO A completar
	@Override
	public float calcularPrecioCosto() {
		return super.getCostoBase() + COEFICIENTE_SILLA * alto;
	}

}
