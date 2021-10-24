package Ejercicio_3;

public class Heladera extends Electrodomestico {
	private int capacidad;
	private boolean frost;

	public Heladera(String marca, String modelo, int numeroSerie, int voltaje, boolean estado, int precio,
			int capacidad, boolean frost) {
		super(marca, modelo, numeroSerie, voltaje, estado, precio);
		this.capacidad = capacidad;
		this.frost = frost;
	}

	@Override
	public String toString() {
		return "Heladera [capacidad=" + capacidad + ", frost=" + frost + super.toString() + "]";
	}

	@Override
	public String mostrarProducto() {
		return getTipo() + " " + getMarca() + ", modelo " + getModelo();
	}

	@Override
	public String getTipo() {
		return "Heladera";
	}

}
