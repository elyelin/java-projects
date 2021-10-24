package ar.edu.tp1.excepciones;

public class Ejemplo3 {
	public static void main(String[] args) {
	    Persona unaPersona = null;
	    try {
	        unaPersona = new Persona("Juan", 1984, 2018);
	    } catch (RuntimeException re) {
	        System.out.println(re.getMessage());
	    } finally {
	        System.out.println("Los datos de la persona son " + unaPersona);
	    }
	}
}
