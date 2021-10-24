package ar.edu.ort.thp.tp2.actividad3.ejercicio11;

public class SuperHeroe {
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int poderes;
	
	private static final int MIN_VALOR_SUPERPODER = 0;
	private static final int MAX_VALOR_SUPERPODER = 100;	

	public SuperHeroe(String nombre, int fuerza, int resistencia, int poderes) {
		this.setNombre(nombre);
		this.setFuerza(fuerza);
		this.setResistencia(resistencia);
		this.setPoderes(poderes);
	}

	public Resultado competir(SuperHeroe heroe) {
		Resultado resultado = Resultado.EMPATE;
		int won_points = 0, lost_points = 0;

		if (this.fuerza > heroe.getFuerza()) {
			won_points++;
		} else if (this.fuerza < heroe.getFuerza()) {
			lost_points++;
		}

		if (this.resistencia > heroe.getResistencia()) {
			won_points++;
		} else if (this.resistencia < heroe.getResistencia()) {
			lost_points++;
		}

		if (this.poderes > heroe.getPoderes()) {
			won_points++;
		} else if (this.poderes < heroe.getPoderes()) {
			lost_points++;
		}

		if (won_points >= 2) {
			resultado = Resultado.TRIUNFO;
		} else if (lost_points >= 2) {
			resultado = Resultado.DERROTA;
		}

		return resultado;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setFuerza(int fuerza) {
		this.fuerza = this.setValue(fuerza);
	}

	private void setResistencia(int resistencia) {
		this.resistencia = this.setValue(resistencia);
	}

	private void setPoderes(int poderes) {
		this.poderes = this.setValue(poderes);
	}

	private int setValue(int value) {
		int ret = value;
		if (value < MIN_VALOR_SUPERPODER) {
			ret = MIN_VALOR_SUPERPODER;
		} else if (value > MAX_VALOR_SUPERPODER) {
			ret = MAX_VALOR_SUPERPODER;
		}

		return ret;
	}

	public String getNombre() {
		return nombre;
	}

	public int getFuerza() {
		return fuerza;
	}

	public int getResistencia() {
		return resistencia;
	}

	public int getPoderes() {
		return poderes;
	}

	@Override
	public String toString() {
		return "SuperHeroe [nombre=" + this.nombre + ", fuerza=" + this.fuerza + ", resistencia=" + this.resistencia
				+ ", poderes=" + this.poderes + "]";
	}

}

