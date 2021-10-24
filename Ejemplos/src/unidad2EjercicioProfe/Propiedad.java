package unidad2EjercicioProfe;

public class Propiedad {
	private String nombre;
	private String tipoPropiedad;
	
	public Propiedad(String nombre, String tipoPropiedad){
		this.nombre = nombre;
		this.tipoPropiedad = tipoPropiedad;
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipoPropiedad() {
		return tipoPropiedad;
	}


	public void setTipoPropiedad(String tipoPropiedad) {
		this.tipoPropiedad = tipoPropiedad;
	}


	@Override
	public String toString() {
		return "Propiedad [nombre=" + nombre + ", tipoPropiedad=" + tipoPropiedad + "]";
	}
}
