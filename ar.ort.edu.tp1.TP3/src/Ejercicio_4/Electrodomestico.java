package Ejercicio_4;

public abstract class Electrodomestico implements Imprimible {
	private String tipo;
	private String marca;
	private String modelo;
	private int numeroSerie;
	private int voltaje;
	private boolean estado;
	private int precio;

	public Electrodomestico(String marca, String modelo, int numeroSerie, int voltaje, boolean estado, int precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.voltaje = voltaje;
		this.estado = estado;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", numeroSerie=" + numeroSerie + ", voltaje="
				+ voltaje + ", estado=" + estado + ", precio=" + precio + "]";
	}

	public abstract String mostrarProducto();

	public abstract String getTipo();

	public String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	private void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public int getVoltaje() {
		return voltaje;
	}

	private void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}

	public boolean isEstado() {
		return estado;
	}

	private void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getPrecio() {
		return precio;
	}

	private void setPrecio(int precio) {
		this.precio = precio;
	}

}
