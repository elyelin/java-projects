package ej4;

import java.util.ArrayList;

public class Vivienda {
	private Direccion direccion;
	private ArrayList<Mueble> muebles;
	private ArrayList<Persona> personas;

	public class Direccion {
		private String calle;
		private String altura;
		private String piso;
		private String departamento;

		public Direccion(String calle, String altura, String piso, String departamento) {
			this.calle = calle;
			this.altura = altura;
			this.piso = piso;
			this.departamento = departamento;
		}

		@Override
		public String toString() {
			return "Direccion: " + calle + " " + altura + " " + piso + " ”" + departamento + "”";
		}
	}
	
	public Vivienda(String calle, String altura, String piso, String departamento) {
		this.direccion = new Direccion(calle, altura, piso, departamento);
		this.muebles = new ArrayList<Mueble>();
		this.personas = new ArrayList<Persona>();
	}

	public void mostrarDireccion() {
		System.out.println(direccion);
	}

	public void agregarMueble(String nombre,String material,String color) {
		this.muebles.add(new Mueble(nombre, material, color));
	}

	public void agregarPersona(String nombre,String apellido,int edad) {
		this.personas.add(new Persona(nombre, apellido, edad));
	}
	
	public void mostrar() {
		System.out.println("Vivienda 1:");
		System.out.println(direccion);
		for (Persona persona : personas) {
			System.out.println(persona);
		}
		for (Mueble mueble : muebles) {
			System.out.println(mueble);
		}
	}

}
