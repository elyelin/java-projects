package Ejercicio_3;

public class Televisor extends Electrodomestico {

	private int dimension;
	private boolean Smart;

	public Televisor(String marca, String modelo, int numeroSerie, int voltaje, boolean estado, int precio,
			int dimension, boolean smart) {
		super(marca, modelo, numeroSerie, voltaje, estado, precio);
		this.dimension = dimension;
		Smart = smart;
	}

	@Override
	public String toString() {
		return "Televisor [dimension=" + dimension + ", Smart=" + Smart + super.toString() + "]";
	}

	@Override
	public String mostrarProducto() {
		return getTipo() + " " + getMarca() + ", modelo " + getModelo();
	}

	@Override
	public String getTipo() {
		return "Televisor";
	}

}
