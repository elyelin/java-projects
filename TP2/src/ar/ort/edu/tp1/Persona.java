package ar.ort.edu.tp1;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = new ArrayList<NumeroTelefonico>();
		this.emails = new ArrayList<Email>();
		
	}
	
	public void agregarTelefono(NumeroTelefonico numero) {
		this.telefonos.add(numero);
	}
	
	public void agregarEmail(Email email) {
		emails.add(email);
	}
	
	private void mostrarEmails() {
        
		System.out.println("Emails:");
		
		for (Email email : this.emails) {
			System.out.println(email.getValor());
		}
	}
	
	private void mostrarTelefonos() {
		
		System.out.println("Telefonos:");
		
		for (NumeroTelefonico telefono : telefonos) {
			System.out.println(telefono.getTipoDeLinea() + ": " + telefono.getValor());
		}
	}
	
	public void mostrarTodo() {
		System.out.println(this.apellido + ", "+ this.nombre);
		this.mostrarTelefonos();
		this.mostrarEmails();
	}
	
}
