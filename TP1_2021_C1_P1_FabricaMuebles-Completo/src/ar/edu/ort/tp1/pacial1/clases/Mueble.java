package ar.edu.ort.tp1.pacial1.clases;

public abstract class Mueble implements Mostrable {

	//TODO A completar
	private String modelo;
	private float costoBase;
	private float porcentajeGanancia;

	public Mueble(String modelo, float costoBase, float porcentajeGanancia) {
		//TODO A completar
		this.modelo = modelo;
		this.costoBase = costoBase;
		this.porcentajeGanancia = porcentajeGanancia;
	}

	//TODO A completar
	public abstract float calcularPrecioCosto();

	public float calcularPrecioVenta() {
		//TODO A completar
		float costo = this.calcularPrecioCosto();
		return this.porcentajeGanancia * costo/100 + costo;
	}

	@Override
	public void mostrar() {
		//TODO A completar
		System.out.println("Mueble tipo: " + getClass().getSimpleName() + " - Modelo: " + this.modelo
				+ " - Precio de venta:" + calcularPrecioCosto());
	}

	protected float getCostoBase() {
		return costoBase;
	}

	public boolean modeloCorrecto(String modelo) {
	
		return modelo == this.modelo;
	}

}
