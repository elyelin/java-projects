package ar.edu.ort.monedero;

public class Bitcoin extends Moneda {
	private static int MENOR = -1;
	private double coeficiente;

	public Bitcoin(int i) {
		setCoeficiente(i);
	}

	/**/
	@Override
	public double convertirACripto(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(double coeficiente) {
		if (coeficiente != MENOR) {
			this.coeficiente = coeficiente;
		}
	}

}
