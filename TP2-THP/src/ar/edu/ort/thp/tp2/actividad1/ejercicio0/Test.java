package ar.edu.ort.thp.tp2.actividad1.ejercicio0;

public class Test {

	public static void main(String[] args) {

		// crea una persona y le pone el nombre
		Persona unaPersona = new Persona();

		System.out.println("El nombre de la persona es " + unaPersona.obtenerNombreCompleto());

		unaPersona.ponerNombre("Hortencio");
		unaPersona.ponerApellido("Ortega");

		System.out.println("El nombre de la persona es " + unaPersona.obtenerNombreCompleto());
	}

}
