package Ejercicio2;

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
		 return "+" +getCaracterictica() + "-"+ getNumeroDeAbono() + "-"+ getCodigoDePais()  ;
	 }

	public int getCaracterictica() {
		return caracterictica;
	}

	public void setCaracterictica(int caracterictica) {
		this.caracterictica = caracterictica;
	}

	public int getNumeroDeAbono() {
		return numeroDeAbono;
	}

	public void setNumeroDeAbono(int numeroDeAbono) {
		this.numeroDeAbono = numeroDeAbono;
	}

	public int getCodigoDePais() {
		return codigoDePais;
	}

	public void setCodigoDePais(int codigoDePais) {
		this.codigoDePais = codigoDePais;
	}

	public TipoDeLinea getTipoLinea() {
		return linea;
	}

	public void setTipoLinea(TipoDeLinea tipoLinea) {
		this.linea = tipoLinea;
	}
	 public String mostrar() {
		 return linea +": " + getValor();
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
