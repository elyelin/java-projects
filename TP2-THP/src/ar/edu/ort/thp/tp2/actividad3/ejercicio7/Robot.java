package ar.edu.ort.thp.tp2.actividad3.ejercicio7;

public class Robot {
	
	private String nombre;

	public Robot() {
		this("");
	}

	public Robot(String nombre) {
		this.setNombre(nombre);
	}

	public void saludar() {
		// posible solucion para el sin nombre.
		if (nombre.equals(""))
			System.out.println("¡Hola! ¿En qué puedo ayudarte?");
		else
			System.out.println("¡Hola, mi nombre es " + nombre + ". ¿En qué puedo ayudarte?");
	}

	public void saludar(Persona persona) {
		// posible solucion para el sin nombre.
		if (nombre.equals(""))
			System.out.println("¡Hola " + persona.getNombreCompleto() + "! ¿En qué puedo ayudarte?");
		else
			System.out.println("¡Hola " + persona.getNombreCompleto() + ", mi nombre es " + nombre + ". ¿En qué puedo ayudarte?");
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
