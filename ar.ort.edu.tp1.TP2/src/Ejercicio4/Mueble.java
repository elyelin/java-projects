package Ejercicio4;

public class Mueble {
	private String nombre;
	private String material;
	private String color;
	
	public Mueble(String nombre, String material, String color) {
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}
	
	public String mostrar()	{
		return "Muebles: " + nombre + " de " + material + " color " + color;
	}
}
