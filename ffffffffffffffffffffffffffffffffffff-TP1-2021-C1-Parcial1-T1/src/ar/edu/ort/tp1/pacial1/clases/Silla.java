package ar.edu.ort.tp1.pacial1.clases;

public class Silla extends Mueble {
	
	private static final int COEFICIENTE_SILLA = 3;
	private long alto;
	private MaterialSilla matSilla;
	
	public Silla(String modelo, float costoBase, float porcentajeGanancia, long alto, MaterialSilla matSilla) {
		super(modelo, costoBase, porcentajeGanancia);
		this.alto = alto;
		this.matSilla = matSilla;
	}
	@Override
	public float calcularPrecioCosto() {
		return super.getCostoBase() + (this.matSilla.getMultiplicadorValor() * this.alto);
	}
	

}
