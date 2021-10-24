package ar.edu.ort.thp.tp2.actividad1.ejercicio0;

/**
 * Representa a una persona con solo lo necesario para poder ubicarla por nombre
 * completo.
 */
public class Persona {
	private String nombre;
	private String apellido;

	public Persona() {
		nombre = "";
		apellido = "";
	}

	/**
	 * Permite agregarle el nombre a la persona
	 * 
	 * @param valor
	 *            el valor del nombre
	 */
	public void ponerNombre(String valor) {
		nombre = valor;
	}

	public void ponerApellido(String valor) {
		apellido = valor;
	}

	public String obtenerNombreCompleto() {
		return nombre + " " + apellido;
	}

}