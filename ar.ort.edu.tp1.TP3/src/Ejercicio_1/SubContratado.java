package Ejercicio_1;

public class SubContratado extends Empleado {
	private int horas;
	private float precioHora;

	public SubContratado(String nombre, int edad, int horas, float precioHora) {
		super(nombre, edad);
		this.horas = horas;
		this.precioHora = precioHora;
	}

	public SubContratado() {
		super();
		this.horas = 0;
		this.precioHora = 0;
	}

	@Override
	public String toString() {
		return "SubContratado [horas=" + horas + ", precioHora=" + precioHora + "]" + super.toString();
	}

	@Override
	public float calcularPago() {
		return precioHora * horas;
	}

}
