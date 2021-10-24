package Ejercicio5;

import java.util.ArrayList;

public class Vivienda {
	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;

	public Vivienda(String calle, int altura, int piso, String departamento) {
		this.direccion = new Direccion(calle, altura, piso, departamento);
		this.personas = new ArrayList<Persona>();
		this.muebles = new ArrayList<Mueble>();
	}
	
	public void mostrarDireccion() {
		System.out.println(direccion);
	}
	
	public int getPiso() {
		return direccion.piso;
	}
	
	public String getDepto() {
		return direccion.departamento;
	}

	public void agregarMueble(String nombre,String material,String color) {
		this.muebles.add(new Mueble(nombre, material, color));
	}

	public void agregarPersona(String nombre,String apellido,int edad) {
		this.personas.add(new Persona(nombre, apellido, edad));
	}
	
	public void mostrar() {
		System.out.println("Vivienda 1:");
		System.out.println(direccion.mostrar());
		for (Persona persona : personas) {
			System.out.println(persona.mostrar());
		}
		for (Mueble mueble : muebles) {
			System.out.println(mueble.mostrar());
		}
	}

	
	public class Direccion {
		private String calle;
		private int altura;
		private int piso;
		private String departamento;

		public Direccion(String calle, int altura, int piso, String departamento) {
			this.calle = calle;
			this.altura = altura;
			this.piso = piso;
			this.departamento = departamento;
		}
	
		public String mostrar() {
			return "Direccion: " + calle + " " + altura + " " + piso + " '" + departamento + "'";
		}
		
	}
}
