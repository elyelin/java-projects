package ar.edu.ort.tp1.pacial2.clases;

public abstract class Producto implements Mostrable {
	private static final String MSG_ATRIBUTO_STRING_INVALIDO = "El campo %s no puede ser nulo ni vacío";
	private static final String MSG_ID_INVALIDO = "El id no puede ser menor a 1";
	private static final String MSG_MOSTRAR = "El %s con id %d es de la marca %s y modelo %s";
	// TODO Completar
	private int id;
	private String marca;
	private String modelo;

	// TODO Completar
	/**
	 * Constructor
	 * 
	 * @param id    debe ser mayor o igual a 1
	 * @param marca no ser nulo ni vacío.
	 */
	public Producto(int id, String marca, String modelo) {
		this.setId(id);
		this.setMarca(marca);
		this.setModelo(modelo);
	}

	// TODO Completar
	private void setId(int id) {
		if (id < 1) {
			throw new IllegalArgumentException(MSG_ID_INVALIDO);
		}
		this.id = id;
	}

	// TODO Completar
	private void setMarca(String marca) {
		validarStringNuloOVacio(marca, "marca");
		this.marca = marca;
	}

	private void setModelo(String modelo) {
		validarStringNuloOVacio(modelo, "modelo");
		this.modelo = modelo;
	}

	protected void validarStringNuloOVacio(String str, String nombreAtributo) {
		if (str == null || str.isEmpty()) {
			throw new IllegalArgumentException(String.format(MSG_ATRIBUTO_STRING_INVALIDO, nombreAtributo));
		}
	}

	@Override
	public void mostrar() {
		System.out.printf(MSG_MOSTRAR, this.getClass().getSimpleName(), this.id, this.marca, this.modelo);
	}

	public boolean coincideId(int id) {
		return this.id == id;
	}

	public int getId() {
		return id;
	}

	protected String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

}
