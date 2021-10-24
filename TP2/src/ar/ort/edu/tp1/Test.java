package ar.ort.edu.tp1;

public class Test {

	public static void main(String[] args) {

		NumeroTelefonico numero1 = new NumeroTelefonico(911, 54564567, 54, TipoDeLinea.CELULAR);
		
		//System.out.println(numero1.getValor());
		
		Email email1 = new Email("cuenta1@dominio1.com.ar");
		
		//System.out.println(email1.getValor());
	
		Persona persona1 = new Persona("Jose","Fernandez");
		
		persona1.agregarEmail(new Email("jose@dominio.com.ar"));
		
		persona1.agregarTelefono(numero1);
		
		persona1.mostrarTodo();
		
	}

}
