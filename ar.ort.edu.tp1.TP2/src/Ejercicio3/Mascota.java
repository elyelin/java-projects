package Ejercicio3;
//agregacion 
public class Mascota {
	private String nombre;
	private String tipoAnimal;
	
	public Mascota(String nombre, String tipoAnimal) {
		setNombre(nombre);
		setTipoAnimal(tipoAnimal);
	}
	public void mostrarMascota() {
		System.out.println(this.tipoAnimal + ", " + this.nombre);
	}
	public String getTipoAnimal() {
		return tipoAnimal;
	}

	private void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
