package Ejercicio3;

import java.util.ArrayList;

public class Hito {
	private String fecha;
	private String descripcion;
	private ArrayList<Persona> personasInvolucradas;
	
	public Hito(String fecha, String descripcion) {
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.personasInvolucradas = new ArrayList<>();
	}
	
	public void agregarPersona(Persona persona) {
		this.personasInvolucradas.add(persona);
	}
	
	public void mostrarHito() {
		System.out.println(this.fecha + ", " + this.descripcion);
		for (Persona persona : personasInvolucradas) {
			System.out.println(persona.getNombreYApellido());
		}
	}
}
