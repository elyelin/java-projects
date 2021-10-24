package ej1;

public class Main {
	
	public static Persona persona;

	public static void main(String[] args) {
		persona = new Persona("Lionel", "Messi");
		
		persona.agregarEmail("correo@pepe.com");
		persona.agregarTelefono(54, 4323, 1234, TipoDeLinea.CELULAR);
		persona.agregarTelefono(54, 5341, 6745, TipoDeLinea.FAX);
		persona.agregarTelefono(54, 8953, 8562, TipoDeLinea.FIJO);
		
		persona.mostrarTodo();
		
	}

}


