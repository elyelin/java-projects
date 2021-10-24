package tp1.parcial1.clases;

public class Encendido extends Servicio implements CotizablePorMateriales {

	public Encendido(String descripcion, double porcentajeGanancia, String patente) {
		super(descripcion, porcentajeGanancia, patente);
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
	public double calcularPrecioCosto() {
		return calcularCostoMateriales();
	}

}
