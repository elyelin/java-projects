package ar.edu.ort.tp1.pacial1.clases;

public class Mesa extends Mueble {
	private static final float COEFICIENTE_SUPERFICIE = 0.2f;
	private int largo;
	private int ancho;
	private TipoMesa tipoMesa;

	public Mesa(String modelo, float costoBase, float porcentajeGanancia, int largo, int ancho, TipoMesa tipoMesa) {
		super(modelo, costoBase, porcentajeGanancia);
		this.largo = largo;
		this.ancho = ancho;
		this.setTipoMesa(tipoMesa);
	}

	@Override
	public float calcularPrecioCosto() {
		return  super.getCostoBase() * this.getTipoMesa().getMultiplicadorValor() + this.COEFICIENTE_SUPERFICIE * largo * ancho;
	}

	public TipoMesa getTipoMesa() {
		return tipoMesa;
	}

	public void setTipoMesa(TipoMesa tipoMesa) {
		this.tipoMesa = tipoMesa;
	}
	
	public boolean modeloCorrecto(String modelo) {
		return super.modeloCorrecto(modelo);
	}

}
