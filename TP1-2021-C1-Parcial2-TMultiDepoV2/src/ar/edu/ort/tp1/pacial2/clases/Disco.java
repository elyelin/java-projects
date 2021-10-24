package ar.edu.ort.tp1.pacial2.clases;

public class Disco extends Producto {

	private static final int CAPACIDAD_MINIMA = 120;
	private static final String MSG_CAPACIDAD = "La capacidad no puede ser menor a " + CAPACIDAD_MINIMA;
	private static final String MSG_CONECTOR = "El conector no puede ser nulo";

	// TODO Completar
	private TipoConectorDiscoEnum tipoConector;
	private int capacidad;

	// TODO Completar
	public Disco(int id, String marca, String modelo,
			TipoConectorDiscoEnum tipoConector, int capacidad) {
		super(id, marca, modelo);
		this.setTipoConector(tipoConector);
		this.setCapacidad(capacidad);
	}

	// TODO Completar
	private void setTipoConector(TipoConectorDiscoEnum tipoConector) {
		if (tipoConector == null) {
			throw new IllegalArgumentException(MSG_CONECTOR);
		}
		this.tipoConector = tipoConector;
	}

	private void setCapacidad(int capacidad) {
		if (capacidad < CAPACIDAD_MINIMA) {
			throw new IllegalArgumentException(MSG_CAPACIDAD);
		}
		this.capacidad = capacidad;
	}

	public TipoConectorDiscoEnum getSuperficie() {
		return tipoConector;
	}

	public int getCapacidad() {
		return capacidad;
	}

}
