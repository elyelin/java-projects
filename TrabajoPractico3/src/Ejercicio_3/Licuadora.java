package Ejercicio_3;

public class Licuadora extends Electrodomestico {
	private int potencia;
	private int velocidad;

	public Licuadora(String tipo, String marca, String modelo, int numeroSerie, float voltaje, boolean encendidoApagado,
			float precio, int potencia, int velocidad) {
		super(tipo, marca, modelo, numeroSerie, voltaje, encendidoApagado, precio);
		this.potencia = potencia;
		this.velocidad = velocidad;
	}

	public Licuadora() {
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return super.toString() + "Licuadora [potencia=" + potencia + ", velocidad=" + velocidad + "]";
	}

	@Override
	public String mostrarProducto() {
		return super.getMarca() + ", modelo " + super.getModelo();
	}

	@Override
	public String getTipo() {
		return "Licuadora";
	}

}
