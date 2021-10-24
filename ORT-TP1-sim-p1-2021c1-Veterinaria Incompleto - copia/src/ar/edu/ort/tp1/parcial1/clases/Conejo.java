package ar.edu.ort.tp1.parcial1.clases;

public class Conejo extends Mascota {
	private static final double MULT_ALIMENTACION = 0.022;
	private static final double PORC_DESC_PESO = -2;

	public Conejo(String nombre, int peso, boolean vacuna, Estado estado) {
		super(nombre, peso, vacuna, estado);
	}

	@Override
	public void comer(double comida) {
		super.comer(comida, MULT_ALIMENTACION);
	}

	@Override
	public void defecar() {
		super.actualizarPeso(PORC_DESC_PESO);
	}

	public String getNombre() {
		return super.getNombre();
	}

	public void actualizarPeso(double porcentaje) {
		super.actualizarPeso(porcentaje);
	}

}
