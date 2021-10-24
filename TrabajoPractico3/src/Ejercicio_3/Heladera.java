package Ejercicio_3;

public class Heladera extends Electrodomestico {
	private int capacidad;
	private boolean frost;

	public Heladera(String tipo, String marca, String modelo, int numeroSerie, float voltaje, boolean encendidoApagado, float precio,
			int capacidad, boolean frost) {
		super(tipo, marca, modelo, numeroSerie, voltaje, encendidoApagado, precio);
		this.capacidad = capacidad;
		this.frost = frost;
	}

	public Heladera() {
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isFrost() {
		return frost;
	}

	public void setFrost(boolean frost) {
		this.frost = frost;
	}

	@Override
	public String toString() {
		return super.toString() + "Heladera [capacidad=" + capacidad + ", frost=" + frost + "]";
	}

	@Override
	public String mostrarProducto() {
		return super.getMarca() + ", modelo " + super.getModelo();
	}

	@Override
	public String getTipo() {
		return "Heladera";
	}

}
