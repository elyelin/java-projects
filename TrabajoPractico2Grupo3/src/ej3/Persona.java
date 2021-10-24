package ej3;

import java.util.ArrayList;

public class Persona {
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;
	private ArrayList<Mascota> mascotas;
	private String apellido;
	private String nombre;
	
	public class Mascota {
		private String nombre;
		private String tipoAnimal;
		
		public Mascota(String nombre, String tipoAnimal) {
			this.nombre = nombre;
			this.tipoAnimal = tipoAnimal;
		}
		
		public void mostrarMascota() {
			System.out.println(this.tipoAnimal + ", " + this.nombre);
		}
	}
	
	public class NumeroTelefonico {
		private int caracteristica;
		private int numeroDeAbonado;
		private int codigoDePais;
		private TipoDeLinea linea;
		
		public NumeroTelefonico(int pais, int caracteristica, int numero, TipoDeLinea tipo) {
			this.caracteristica = caracteristica;
			this.codigoDePais = pais;
			this.numeroDeAbonado = numero;
			this.linea = tipo;
		}
		
		public String getValor() {
			return "(+" + codigoDePais + ")" + caracteristica + "-" + numeroDeAbonado;
		}
		
		public String getTipoDeLinea() {
			String tipo = "";
			switch (linea) {
			case CELULAR:
				tipo = "Celular";
				break;
			case FIJO:
				tipo = "Fijo";
				break;
			case FAX:
				tipo = "Fax";
				break;
			}
			return tipo;
		}
	}
	
	public class Email {
		private String cuenta;
		private String dominio;
		
		public Email(String email){
			String[] splitedEmail = email.split("@");
			this.cuenta = splitedEmail[0];
			this.dominio = splitedEmail[1];
		}
			
		public String getValor() {
			return cuenta + "@" + dominio;
		}

	}
	
	public Persona(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefonos = new ArrayList<NumeroTelefonico>();
		this.emails = new ArrayList<Email>();
		this.mascotas = new ArrayList<Mascota>();
	}
	
	public void agregarTelefono(int pais, int caracteristica, int numero, TipoDeLinea tipo) {
		telefonos.add(new NumeroTelefonico(pais, caracteristica, numero, tipo));
	}
	
	public void agregarEmail(String correo) {
		this.emails.add(new Email(correo));
	}
	
	public void agregarMascota(String nombre, String tipo) {
		this.mascotas.add(new Mascota(nombre, tipo));
	}
	
	public void mostrarTodo() {
		System.out.println(this.apellido +", " + this.nombre);
		if(telefonos.size() > 0) {
			System.out.println("Telefonos:");
			for (NumeroTelefonico telefono : telefonos) {
				System.out.println(telefono.getTipoDeLinea() + ": " + telefono.getValor());
			}
		}
		if(emails.size() > 0) {
			System.out.println("Emails:");
			for (Email email : emails) {
				System.out.println(email.getValor());
			}
		}
		if(mascotas.size() > 0) {
			System.out.println("Mascotas:");
			for (Mascota mascota : mascotas) {
				mascota.mostrarMascota();
			}
		}
	}
	
	public String getNombreYApellido() {
		return this.nombre + " " + this.apellido;
	}
}
