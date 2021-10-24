package Ejercicio_2;

public class Asalariado extends Empleado{
	private float sueldo;
	
	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}
	public Asalariado() {
	}
	@Override
	public float calcularPago() {
		return sueldo;
	}
	
	public float getSueldo() {
		return  sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	public String mostrar() {
		return "Asalariado " + super.getNombre() + " gana: " + calcularPago();
	}
	
	@Override
	public String toString() {
		return "Asalariado: " + super.toString() + " [sueldo=" + sueldo + "]";
	}
	
}
