package tp1.tp4.ej2;

public class Persona {
	private static final int VALOR_AUN_VIVE = -9999;
	private String nombreCompleto;
	private int anioActual;
	private int anioNacimiento;
	private int anioFallecimiento;

	public Persona(String nombreCompleto, int anioNacimiento) {
		setNombreCompleto(nombreCompleto);
		setAnioNacimiento(anioNacimiento);
	}

	public Persona(String nombreCompleto, int anioNacimineto, int anioFallecimiento) {
		setNombreCompleto(nombreCompleto);
		setAnioNacimiento(anioNacimiento);
		setAnioFallecimiento(anioFallecimiento);
	}

	public boolean vive() {
		return anioFallecimiento < anioActual;
	}

	private String getNombreCompleto() {
		return nombreCompleto;
	}

	private void setNombreCompleto(String nombreCompleto) {
		if (nombreCompleto == null || nombreCompleto.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacio");
		} else {
			this.nombreCompleto = nombreCompleto;
		}
	}

	private int getAnioNacimiento() {
		return anioNacimiento;
	}

	private void setAnioNacimiento(int anioNacimiento) {
		if (anioNacimiento > anioActual) {
			throw new IllegalArgumentException("El anio de nacimiento no puede ser posterior al anio actual");
		} else {
			this.anioNacimiento = anioNacimiento;
		}
	}

	public void setAnioFallecimiento(int anioFallecimineto) {
		if (anioFallecimiento > anioActual) {
			throw new IllegalArgumentException("El anio de fallecimiento no puede ser posterior al anio actual");
		}
		this.anioFallecimiento = anioFallecimineto;
	}

	@Override
	public String toString() {
		return "Persona [nombreCompleto=" + nombreCompleto + ", anioNacimiento=" + anioNacimiento
				+ ", anioFallecimineto=" + anioFallecimiento + ", anioActual=" + anioActual + "]";
	}
}
