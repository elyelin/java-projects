package Ejercicio_2;

public class Vendedor extends Subcontratado{
	private float porcentaje;
	
	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.porcentaje = porcentaje;
	}
	
	public Vendedor() {
	}
	
	
	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	@Override
	public float calcularPago() {  
		float pago = super.calcularPago() + super.calcularPago() * porcentaje / 100;
		return pago;
	}
	
	public String mostrar() {
		return "Vendedor " + super.getNombre() + " gana: " + calcularPago();
	}

	@Override
	public String toString() {
		return "Vendedor [porcentaje=" + porcentaje + "]";
	}
	
	
}
