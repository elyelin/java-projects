package ar.edu.ort.thp.tp2.actividad3.ejercicio7;

public class Persona {
	private String nombre;
	private String apellido;
	
	public Persona(String nombre, String apellido) {
		this.setNombre(nombre);
		this.setApellido(apellido);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombreCompleto() {
		return nombre + " " + apellido;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
