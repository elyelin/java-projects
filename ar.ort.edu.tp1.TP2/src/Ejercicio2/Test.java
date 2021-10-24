package Ejercicio2;

public class Test {
	public static void main(String[] args) {
		Persona p;
		NumeroTelefonico n = new NumeroTelefonico(549, 114111, 2222, TipoDeLinea.CELULAR);
		NumeroTelefonico a = new NumeroTelefonico(054, 4411, 5472, TipoDeLinea.FIJO);
		Mascota m = new Mascota("Kamba", "perro");
		Mascota g = new Mascota("Tana", "gato");
		p = new Persona("Lionel", "Messi");
		p.agregarMail("lio@messi.com");
		p.agregarTelefono(n);
		p.agregarTelefono(a);
		p.agregarMascota(m);
		p.agregarMascota(g);
		p.mostrarTodo();

	}

}
