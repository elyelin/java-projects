package par1.cerveceria.entidades;

public class Garrafa extends EnvaseCerveza{
	public static final double precioLitro = 160;
	public static final double porcentajeMediana = 1.1;
	public static final double porcentajeChica = 1.2;
	private Medida tamanio;
	
	public Garrafa(Sabor sabor, Medida tamanio) {
		super(sabor);
		this.setTamanio(tamanio);
	}
	
	public Garrafa(Sabor sabor){
		super(sabor);
		this.setTamanio(Medida.MEDIANA);
	}
	
	private void setPrecioPorTamanio() {
		switch (this.getTamanio()) {
		case CHICA:
			double precioChica = (precioLitro * 0.75) * porcentajeChica;
			this.setPrecioVenta(precioChica);
			break;
		case GRANDE:
			double precioGrande = precioLitro * 3;
			this.setPrecioVenta(precioGrande);
			break;
		case MEDIANA:
			double precioMediana = (precioLitro * 1.5) * porcentajeMediana;
			this.setPrecioVenta(precioMediana);
			break;
		default:
			break;
		}
	}
	
	@Override
	protected void setPrecioVenta(double precio) {
		this.precioVenta = precio;
	}

	@Override
	public String getTipo() {
		return "GARRAFA" + getTamanio();
	}

	public Medida getTamanio() {
		return tamanio;
	}

	public void setTamanio(Medida tamanio) {
		this.tamanio = tamanio;
	}
	

}
