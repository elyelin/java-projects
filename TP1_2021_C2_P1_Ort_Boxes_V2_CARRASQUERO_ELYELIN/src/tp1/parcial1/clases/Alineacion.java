package tp1.parcial1.clases;

public class Alineacion extends Servicio implements CotizablePorManoObra {

	static final double EXTRABALANCEO = 500;
	private int horas;
	private boolean balanceo;

	public Alineacion(String descripcion, double porcentajeGanancia, String patente, int horas, boolean balanceo) {
		super(descripcion, porcentajeGanancia, patente);
		this.horas = horas;
		this.balanceo = balanceo;
	}

	@Override
	public void detallar() {
		System.out.println("Servicio: " + this.getClass().getSimpleName());
		System.out.println("Patente del vehiculo: " + super.getPatente());
		System.out.println("Precio de venta: " + super.calcularPrecioVenta());
	}

	@Override
	public double calcularCostoHoras() {
		return horas * CotizablePorManoObra.COSTOHORA;
	}

	@Override
	public double calcularPrecioCosto() {
		double costo;
		if (balanceo) {
			costo = calcularCostoHoras() + EXTRABALANCEO;
		} else {
			costo = calcularCostoHoras();
		}
		return costo;
	}

}
