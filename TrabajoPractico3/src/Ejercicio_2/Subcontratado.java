package Ejercicio_2;

public class Subcontratado extends Empleado{
	private float cantHoras;
	private float precioHora;
	
	public Subcontratado() {	
	}
	
	public Subcontratado(String nombre, int edad, float cantHoras, float precioHoras) {
		super(nombre, edad);
		this.cantHoras = cantHoras;
		this.precioHora = precioHoras;
	}

	@Override
	public float calcularPago() {
		return cantHoras*precioHora;
	}

	public float getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(float cantHoras) {
		this.cantHoras = cantHoras;
	}

	public float getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(float precioHora) {
		if(precioHora >=0) {
			this.precioHora = precioHora;
		}
		
	}
	
	public String mostrar() {
		return "Subcontratado " + super.getNombre() + " gana: " + calcularPago();
	}

	@Override
	public String toString() {
		return "Subcontratado: " + super.toString() + " [cantHoras=" + cantHoras + ", precioHora=" + precioHora + "]";
	}
	

}
