package unidad2EjercicioProfe;

public class Titulo {
	private String descripcion;
	
	public Titulo(String descripcion){
		this.descripcion = descripcion;
	}

	
	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "Titulo [descripcion=" + descripcion + "]";
	}
	
}
