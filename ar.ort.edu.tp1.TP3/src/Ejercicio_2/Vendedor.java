package Ejercicio_2;

public class Vendedor extends SubContratado {
	private float porcentaje;

	public Vendedor(String nombre, int edad, int horas, float precioHoras, float porcentaje) {
		super(nombre, edad, horas, precioHoras);
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() {
		return "Vendedor [porcetaje=" + porcentaje + "]";
	}

	@Override
	public float calcularPago() {
		return (getPrecioHora() * getHoras()) + (getPrecioHora() * getHoras() * porcentaje / 100);
	}

	public float getPorcetaje() {
		return porcentaje;
	}

}
