package Ejemplo_01;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private int edad;
	private int peso;
	private int altura;
	private ArrayList<Propiedad> lPropiedades;
	//private ArrayList 
	
	public Persona(){
		nombre = "sin nombre";
		edad = 0;
	}

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		lPropiedades = new ArrayList<>();
	}
	
	public void agregarPropiedad(Propiedad p) {
		lPropiedades.add(p);
	}
	
	public Propiedad getPropiedad(int numPropiedad) {
		//El indice de las lista arrancan en el entonces la segunda propiedad es 1
		Propiedad aux = null;
		if(numPropiedad <= lPropiedades.size()) {
		//-1 es para que el usuario siempre obtenga la propiedad que pide
		aux = lPropiedades.get(numPropiedad -1);
		}
		return aux;
	}
	
	public void mostrarPropiedades() {
		for(Propiedad p : lPropiedades) {
			System.out.println(p.toString());
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	public String mostrarNombreYEdad(){
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
//Los setter y getter que no los usan no los escribas