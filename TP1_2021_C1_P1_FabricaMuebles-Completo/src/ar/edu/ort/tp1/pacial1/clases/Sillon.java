package ar.edu.ort.tp1.pacial1.clases;

public class Sillon extends Mueble {

	//TODO A completar
	private int cantCuerpos;
	private TelaSillon tela;

	//TODO A completar
	public Sillon(String modelo, float costoBase, float porcentajeGanancia, int cantCuerpos, TelaSillon tela) {
		super(modelo, costoBase, porcentajeGanancia);
		this.tela = tela;
		this.cantCuerpos = cantCuerpos;
	}

	//TODO A completar
	@Override
	public float calcularPrecioCosto() {
		return getCostoBase() * cantCuerpos * (1 + tela.getPorcentaje() / 100);
	}

}
