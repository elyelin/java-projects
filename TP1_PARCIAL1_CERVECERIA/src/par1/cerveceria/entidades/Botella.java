package par1.cerveceria.entidades;

public class Botella extends EnvaseCerveza{
	public static final double precioUnitario = 80;
	
	public Botella(Sabor sabor) {
		super(sabor);
		this.setPrecioVenta(precioUnitario);
	}

	@Override
	protected void setPrecioVenta(double precio) {
		this.precioVenta = precio;
	}

	@Override
	public String getTipo() {
		return "BOTELLA" + this.getSabor();
	}

	
	
}
