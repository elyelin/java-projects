package ar.edu.ort.tp1.pacial2.clases;

public class MicroProcesador extends Producto {
	private static final String MSG_FRECUENCIA = "Frecuencia base inválida";
	// TODO Completar
	private float frecuenciaBase;

	// TODO Completar
	public MicroProcesador(int id, String marca, String modelo, float frecuenciaBase) {
		super(id, marca, modelo);
		this.setFrecuenciaBase(frecuenciaBase);
	}

	// TODO Completar
	private void setFrecuenciaBase(float frecuenciaBase) {
		if (frecuenciaBase <= 0) {
			throw new IllegalArgumentException(MSG_FRECUENCIA);
		}
		this.frecuenciaBase = frecuenciaBase;
	}

	public float getFrecuenciaBase() {
		return frecuenciaBase;
	}

}
