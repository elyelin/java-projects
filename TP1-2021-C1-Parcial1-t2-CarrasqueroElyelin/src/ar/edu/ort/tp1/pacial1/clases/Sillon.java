package ar.edu.ort.tp1.pacial1.clases;

public class Sillon extends Mueble {
	private int cantidadCuerpos;
	private TelaSillon telaSillon;

	public Sillon(String modelo, float costoBase, float porcentajeGanancia, int cantCuerpos, TelaSillon telaSillon) {
		super(modelo, costoBase, porcentajeGanancia);
		this.cantidadCuerpos = cantCuerpos;
		this.telaSillon = telaSillon;
	}

	@Override
	public float calcularPrecioCosto() {
		float precio; 
		precio = super.getCostoBase() * cantidadCuerpos * telaSillon.getPorcentaje();
		return precio;
	}

	public boolean modeloCorrecto(String modelo) {
		return super.modeloCorrecto(modelo);
	}
}
