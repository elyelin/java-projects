package Ejercicio_3;

public class Lavarropa extends Electrodomestico {
	private int cargaMaxima;
	private boolean automatico;

	public Lavarropa(String tipo, String marca, String modelo, int numeroSerie, float voltaje, boolean encendidoApagado,
			float precio, int cargaMaxima, boolean automatico) {
		super(tipo, marca, modelo, numeroSerie, voltaje, encendidoApagado, precio);
		this.cargaMaxima = cargaMaxima;
		this.automatico = automatico;
	}

	public Lavarropa() {
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public boolean isAutomatico() {
		return automatico;
	}

	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}

	@Override
	public String toString() {
		return super.toString() + "Lavarropa [cargaMaxima=" + cargaMaxima + ", automatico=" + automatico + "]";
	}

	@Override
	public String mostrarProducto() {
		return super.getMarca() + ", modelo " + super.getModelo();
	}

	@Override
	public String getTipo() {
		return "Lavarropa";
	}

}
