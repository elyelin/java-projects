package Ejercicio_1;

public class Asalariado extends Empleado {
	private float sueldo;

	public Asalariado(String nombre, int edad, int fijo) {
		super(nombre, edad);
		this.setSueldo(fijo);
	}

	public Asalariado() {
		super();
		this.setSueldo(0);
	}

	public float getSueldo() {
		return sueldo;
	}

	private void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public float calcularPago() {
		return sueldo;
	}

	@Override
	public String toString() {
		return "Asalariado [sueldo=" + sueldo + "]" + super.toString();
	}

}
