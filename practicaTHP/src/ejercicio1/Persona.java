package ejercicio1;

public class Persona {
	private String nombre;
	private String apellido;
	private String direccion;
	private String dni;

	public Persona() {
		this.setNombre("");
		this.setApellido("");
		this.setDireccion("");
	}

	public Persona(String nombre, String apellido, String direccion, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
	};

	// public void mostrarPersona(Persona persona) {
	// *System.out.println(persona); };

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getDni() {
		return this.dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", dni=" + dni
				+ "]";
	}

	
}
