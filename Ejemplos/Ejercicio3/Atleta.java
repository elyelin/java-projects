package ar.edu.ort.taller.Ejercicio3;

public class Atleta {

	private String nombre;
	private double tiempo;
	
	public Atleta(String nombre, double tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	public String getNombre(){ 
		return nombre; 
	}
	
	public double getTiempo(){ 
		return tiempo; 
	}
	
	@Override
	public String toString() {
		return "Atleta [Nombre = " + nombre + ", Tiempo = " + tiempo + "]";
	}
}