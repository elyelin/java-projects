package tp1.parcial1.clases;

public class CambioAceite extends Servicio implements CotizablePorManoObra, CotizablePorMateriales {

	private int horas;

	public CambioAceite(String descripcion, double porcentajeGanancia, String patente, int horas) {
		super(descripcion, porcentajeGanancia, patente);
		this.horas = horas;
	}

	@Override
	public void detallar() {
		System.out.println("Servicio: " + this.getClass().getSimpleName());
		System.out.println("Patente del vehiculo: " + super.getPatente());
		System.out.println("Precio de venta: " + super.calcularPrecioVenta());
	}

	@Override
	public double calcularCostoMateriales() {
		return CotizablePorMateriales.COSTOMATERIAL1 + CotizablePorMateriales.COSTOMATERIAL2;
	}

	@Override
	public double calcularCostoHoras() {
		return horas * CotizablePorManoObra.COSTOHORA;
	}

	@Override
	public double calcularPrecioCosto() {
		return calcularCostoHoras() + calcularCostoMateriales();
	}

}
