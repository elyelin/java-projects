package Ejercicio_4;

public class Lavarropa extends Electrodomestico {
	private int carga;
	private boolean automatico;

	public Lavarropa(String marca, String modelo, int numeroSerie, int voltaje, boolean estado, int precio, int carga,
			boolean automatico) {
		super(marca, modelo, numeroSerie, voltaje, estado, precio);
		this.carga = carga;
		this.automatico = automatico;
	}

	@Override
	public String toString() {
		return "Lavarropa [carga=" + carga + ", automatico=" + automatico + super.toString() + "]";
	}

	@Override
	public String mostrarProducto() {
		return getTipo() + " " + getMarca() + ", modelo " + getModelo();
	}

	@Override
	public String getTipo() {
		return "Lavarropa";
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub

	}

}
