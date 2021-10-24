package ar.edu.ort.tp1.parcial1.clases;

public class Perro extends Mascota {
	private static final double MULT_ALIMENTACION = 0.05;
	private static final double PORC_DESC_PESO = -3;

	public Perro(String nombre, int peso, boolean vacuna, Estado estado) {
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
