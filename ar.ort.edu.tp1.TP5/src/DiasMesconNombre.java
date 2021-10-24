
public enum DiasMesconNombre {
	ENERO(31, "Enero"), FEBRERO(28, "Febrero"), MARZO(30, "Marzo"), ABRIL(31, "Abril");

	private int dias;
	private String nombre;

	DiasMesconNombre(int dias, String nombre) {
		this.dias = dias;
		this.nombre = nombre;
	}

	public int getDias() {
		return this.dias;
	}

	public String getNombre() {
		return this.nombre;
	}

}
