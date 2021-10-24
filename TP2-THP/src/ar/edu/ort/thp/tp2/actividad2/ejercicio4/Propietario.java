package ar.edu.ort.thp.tp2.actividad2.ejercicio4;

public class Propietario {
	private String apellido;
	private String nombre;
	private RegistroDeConducir registro;
	private Vehiculo vehiculo;

	public Propietario(String apellido, String nombre, RegistroDeConducir registro) {
		setApellido(apellido);
		setNombre(nombre);
		setRegistro(registro);
		vehiculo = null;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public RegistroDeConducir getRegistro() {
		return registro;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setRegistro(RegistroDeConducir registro) {
		this.registro = registro;
	}

	public void montarVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Vehiculo venderVehiculo() {
		Vehiculo vehiculo = this.vehiculo;
		this.vehiculo = null;
		return vehiculo;
	}

	@Override
	public String toString() {
		return "Propietario [apellido=" + apellido + ", nombre=" + nombre + ", registro=" + registro + ", vehiculo="
				+ vehiculo + "]";
	}

	public void ponerEnMarchaVehiculo() {
		if (vehiculo != null) {
			vehiculo.encender();
		}
	}

	public void acelerar(double kmh) {
		if (vehiculo != null) {
			vehiculo.acelerar(kmh);
		}
	}

	public void conducir() {
		if (vehiculo != null) {
			vehiculo.avanzar();
		}
	}

	public void frenar(double kmh) {
		if (vehiculo != null) {
			vehiculo.frenar(kmh);
		}
	}

	public void girar(char lado, double grados) {
		if (vehiculo != null) {
			vehiculo.girar(lado, grados);
		}
	}

	public void apagarVehiculo() {
		if (vehiculo != null) {
			vehiculo.apagar();
		}		
	}
}
