package Ejercicio1;

public class NumeroTelefonico {
	private int caracterictica;
	private int numeroDeAbono;
	private int codigoDePais;
	private TipoDeLinea linea;

	public NumeroTelefonico(int caracterictica, int numeroDeAbono, int codigoDePais, TipoDeLinea tipoLinea) {
		this.caracterictica = caracterictica;
		this.numeroDeAbono = numeroDeAbono;
		this.codigoDePais = codigoDePais;
		this.linea = tipoLinea;
	}

	public NumeroTelefonico() {
	}

	public String getValor() {
		return "+" + this.caracterictica + "-" + this.numeroDeAbono + "-" + this.codigoDePais;
	}

	public String mostrar() {
		return linea + ": " + getValor();
	}

	public String getTipoDeLinea() {
		String tipo = "";
		switch (linea) {
		case CELULAR:
			tipo = "Celular";
			break;
		case FIJO:
			tipo = "Fijo";
			break;
		case FAX:
			tipo = "Fax";
			break;
		}
		return tipo;
	}

}
