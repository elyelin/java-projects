package ar.edu.ort.monedero;

public class Ethereum extends Moneda {
	private static int MENOR = -1;
	private double coeficiente;

	public Ethereum(int i) {
		setCoeficiente(i);
	}

	public double getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(double coeficiente) {
		if(coeficiente != MENOR) {
					this.coeficiente = coeficiente;
		}
	}

	@Override
	public double convertirACripto(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}

}
