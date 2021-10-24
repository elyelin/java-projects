package Ejercicio_2;

public class Empleado {
	private String nombre;
	private int edad;

	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Empleado() {
		nombre = "";
		edad = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public float calcularPago() {
		return 0;
	}

}
