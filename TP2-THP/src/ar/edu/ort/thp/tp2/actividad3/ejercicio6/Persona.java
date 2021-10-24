package ar.edu.ort.thp.tp2.actividad3.ejercicio6;

public class Persona {
	private int dni;
	private String nombre;
	private String apellido;
	private String fechaNac;
	private Domicilio domicilio;
	
	public Persona(int dni, String nombre, String apellido, String fecha, Domicilio domicilio) {
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setFechaNac(fecha);
		this.setDomicilio(domicilio);
	}

	public int getDni() {
		return dni;
	}

	private void setDni(int dni) {
		this.dni = dni;
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

	public String getFechaNac() {
		return fechaNac;
	}

	private void setFechaNac(String fecha) {
		this.fechaNac = fecha;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac
				+ ", domicilio=" + domicilio + "]";
	}
	
	
	
}
