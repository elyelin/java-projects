package ar.edu.ort.tp1.pacial1.clases;

public abstract class Mueble implements Mostrable {
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
		return this.calcularPrecioCosto() + (this.calcularPrecioCosto() * this.porcentajeGanancia / 100);
	}

	protected float getCostoBase() {
		return costoBase;
	}

	public boolean modeloCorrecto(String modelo) {
		return this.modelo.equals(modelo);
	}

	@Override
	public void mostrar() {
		System.out.println("Mueble tipo: " + this.getClass().getSimpleName() + " - Modelo: " + this.modelo
				+ " - Precio de venta: " + this.calcularPrecioVenta());
	}

}
