package ej3;

public class Main {
	
	public static Persona messi, cristiano;

	public static void main(String[] args) {
		messi = new Persona("Lionel", "Messi");
		cristiano = new Persona("Cristiano", "Ronaldo");
		
		messi.agregarEmail("correo@pepe.com");
		messi.agregarTelefono(54, 4323, 1234, TipoDeLinea.CELULAR);
		messi.agregarTelefono(54, 5341, 6745, TipoDeLinea.FAX);
		messi.agregarTelefono(54, 8953, 8562, TipoDeLinea.FIJO);
		messi.agregarMascota("Pluto", "perro");
		messi.agregarMascota("Macri", "gato");
		messi.agregarMascota("Vos", "loro");
		messi.agregarTelefono(54, 7345, 6745, TipoDeLinea.FAX);
		messi.agregarTelefono(54, 7623, 8562, TipoDeLinea.FIJO);
		messi.agregarEmail("mesiGato@gmail.com");
		
		Hito goleador = new Hito("01/01/2015", "Goleador de la champions league");
		goleador.agregarPersona(messi);
		goleador.agregarPersona(cristiano);
		
		messi.mostrarTodo();
		System.out.println("---");
		goleador.mostrarHito();
		
	}

}


