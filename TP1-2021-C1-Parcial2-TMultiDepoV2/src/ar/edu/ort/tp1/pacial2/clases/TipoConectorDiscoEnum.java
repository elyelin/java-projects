package ar.edu.ort.tp1.pacial2.clases;

public enum TipoConectorDiscoEnum {
	SATA("SATA"), M2("M.2"), USB("USB");

	private String descripcion;

	private TipoConectorDiscoEnum(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
