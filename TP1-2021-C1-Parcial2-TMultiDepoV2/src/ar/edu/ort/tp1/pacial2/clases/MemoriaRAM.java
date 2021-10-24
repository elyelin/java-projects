package ar.edu.ort.tp1.pacial2.clases;

public class MemoriaRAM extends Producto {

	private static final String MSG_CAPACIDAD_MEMORIA = "Capacidad inválida.";

	// TODO Completar
	private static final int TAMANIO_MINIMO = 4;
	private int capacidad;

	// TODO Completar
	public MemoriaRAM(int id, String marca, String modelo, int capacidad) {
		super(id, marca, modelo);
		this.setCapacidad(capacidad);
	}

	// TODO Completar
	private void setCapacidad(int capacidad) {
		if (capacidad < TAMANIO_MINIMO || capacidad % TAMANIO_MINIMO != 0) {
			throw new IllegalArgumentException(MSG_CAPACIDAD_MEMORIA);
		}
		this.capacidad = capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

}
