package ar.edu.ort.tp1.pacial1.clases;

public abstract class Mueble implements Mostrable{
	private String modelo;
	private float costoBase;
	private float porcentajeGanancia;

	public Mueble(String modelo, float costoBase, float porcentajeGanancia) {
		this.modelo = modelo;
		this.costoBase = costoBase;
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public abstract float calcularPrecioCosto();
	
	public float calcularPrecioVenta() {
		float precioVenta = costoBase * porcentajeGanancia;
		return precioVenta;
	}
	
	public void mostrar() {
		System.out.println("Mueble tipo: " + getClass().getSimpleName() + " - Modelo: " + this.modelo
				+ " - Precio de venta:" + calcularPrecioCosto());
	}

	protected float getCostoBase() {
		return costoBase;
	}
	
	protected float getPorcentajeGanancia() {
		return porcentajeGanancia;
	}
	
	protected String getModelo() {
		return modelo;
	}
	
	public boolean modeloCorrecto(String modelo) {
		return modelo == this.modelo;
	}

}
