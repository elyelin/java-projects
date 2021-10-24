package ar.edu.ort.monedero;

public abstract class Moneda {
	private final String MSG_COEFICIENTE = "EL VALOR DEL COEFICIENTE DEBE SER MAYOR A 0";

	public abstract double convertirACripto(double valor);

}
