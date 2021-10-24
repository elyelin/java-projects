package ar.edu.ort.thp.tp2.actividad3.ejercicio7;

public class Test {

	public static void main(String[] args) {
		Persona persona = new Persona("Juani", "Pinchame");
		Robot roboto = new Robot();
		roboto.saludar();
		roboto.saludar(persona);

		Robot r2d2 = new Robot("R2D2");
		r2d2.saludar();
		r2d2.saludar(persona);
	}

}
