package Ejercicio_3;

public abstract class Electrodomestico {
	private String tipo;
	private String marca;
	private String modelo;
	private int numeroSerie;
	private float voltaje;
	private boolean encendidoApagado;
	private float precio;
	
	public Electrodomestico(String tipo, String marca, String modelo, int numeroSerie, float voltaje, boolean encendidoApagado, float precio) {
		this.setTipo(tipo);
		this.marca = marca;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.voltaje = voltaje;
		this.encendidoApagado = encendidoApagado;
		this.precio = precio;
	}
	
	public Electrodomestico() {
		
	}
	
	public abstract String mostrarProducto();
	
	public abstract String getTipo();

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public float getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(float voltaje) {
		this.voltaje = voltaje;
	}

	public boolean isEncendidoApagado() {
		return encendidoApagado;
	}

	public void setEncendidoApagado(boolean encendidoApagado) {
		this.encendidoApagado = encendidoApagado;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", numeroSerie=" + numeroSerie + ", voltaje="
				+ voltaje + ", encendidoApagado=" + encendidoApagado + ", precio=" + precio + "]";
	}

}
