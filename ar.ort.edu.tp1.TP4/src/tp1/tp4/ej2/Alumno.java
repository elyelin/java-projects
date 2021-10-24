package tp1.tp4.ej2;

import tp1.tp4.tj3.RangoDeEnteros;

public class Alumno extends Persona {
	public static final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
	private int dni;
	private int numeroLegajo;

	public Alumno(String nombre, int anioNacimiento, int numeroLegajo, int dni) {
		super(nombre, anioNacimiento);
		setNumeroLegajo(numeroLegajo);
		setDni(dni);
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		if (RANGO_NRO_DOCUMENTO.incluye(dni)) {
			this.dni = dni;
		} else {
			throw new IllegalArgumentException("El dni es invalido");
		}
	}

	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) {
		if (RANGO_NRO_DOCUMENTO.estaEnRango(numeroLegajo)) {
			throw new IllegalArgumentException("El numero de legajo es invalido");
		}
		this.numeroLegajo = numeroLegajo;
	}
}
