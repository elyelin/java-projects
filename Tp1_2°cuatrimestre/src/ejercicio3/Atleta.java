package ejercicio3;

public class Atleta {
	
	
	String nombre;
	double tiempo;
	
	public Atleta(String nombre, double tiempo) {
		setNombre(nombre);
		setTiempo(tiempo);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public double getTiempo() {
		return this.tiempo;
	}

	private void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

}
