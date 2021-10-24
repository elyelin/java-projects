package ar.edu.ort.tp1.parcial1.clases;

public abstract class Mascota implements Animal {

	private static final String MSG_COM_FELIZ = "He comido demasiado";
	private static final String MSG_COM_HAMBRIENTO = "Muchas gracias tenía hambre";
	private static final String MSG_COM_ENFERMO = "No tenía mucha hambre, pero gracias";

	private static final int CIEN = 100;
	private String nombre;
	private int peso;
	private Estado estado;
	private boolean vacuna;

	public Mascota(String nombre, int peso, boolean vacuna, Estado estado) {
		this.nombre = nombre;
		this.peso = peso;
		this.setVacuna(vacuna);
		this.setEstado(estado);
	}

	public void comer(double comida) {
		System.out.println("comio");
	}

	public void comer(double comida, double multiplicador) {
		switch (estado) {
		case HAMBRIENTO:
			System.out.println(MSG_COM_FELIZ);
			setEstado(estado.FELIZ);
			this.peso = (int) (this.peso + comida * multiplicador);
			actualizarPeso(multiplicador);
			break;
		case FELIZ:
			System.out.println(MSG_COM_HAMBRIENTO);
			setEstado(estado.ENFERMO);
			this.peso = (int) (this.peso + comida * multiplicador);
			actualizarPeso(multiplicador);
			break;
		case ENFERMO:
			System.out.println(MSG_COM_ENFERMO);
			setEstado(estado.ENFERMO);
			this.peso = (int) (this.peso + comida * multiplicador);
			actualizarPeso(multiplicador);
		default:
			break;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void actualizarPeso(double porcentaje) {
		this.peso += peso * porcentaje / CIEN;
	}

	public boolean isVacuna() {
		return vacuna;
	}

	public void setVacuna(boolean vacuna) {
		this.vacuna = vacuna;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
