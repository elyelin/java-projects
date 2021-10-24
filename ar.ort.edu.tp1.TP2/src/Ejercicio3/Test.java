package Ejercicio3;

public class Test {
	public static void main(String[] args) {
		Persona p;
		Persona x;
		NumeroTelefonico n = new NumeroTelefonico(549, 114111, 2222, TipoDeLinea.CELULAR);
		NumeroTelefonico a = new NumeroTelefonico(054, 4411, 5472, TipoDeLinea.FIJO);
		Mascota m = new Mascota("Kamba", "perro");
		Mascota g = new Mascota("Tana", "gato");
		p = new Persona("Lionel", "Messi");
		x = new Persona("Rojas", "Yulimar");
		p.agregarMail("lio@messi.com");
		p.agregarTelefono(n);
		p.agregarTelefono(a);
		p.agregarMascota(m);
		p.agregarMascota(g);

		Hito mejorJugador = new Hito("30/08/2021", "Mejor jugador/a de la historia");
		mejorJugador.agregarPersona(p);
		mejorJugador.agregarPersona(x);
		p.mostrarTodo();
		System.out.println("---");
		mejorJugador.mostrarHito();
		
	}

}
