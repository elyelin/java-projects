package Ejercicio3;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> numeros;
	private ArrayList<EMail> mails;
	private ArrayList<Mascota> mascotas;
	
	public class EMail {
		private String cuenta;
		private String dominio;
		
		
		public EMail(String mail) {
			String [] partes = mail.split("@");
			if(partes.length == 2) {
			setCuenta(setCuenta(partes[0]));
			setDominio(setDominio(partes[1]));
			}
		}

		public String getDominio() {
			return dominio;
		}

		private String setDominio(String dominio) {
			this.dominio = dominio;
			return dominio;
		}

		public String getCuenta() {
			return cuenta;
		}

		private String setCuenta(String cuenta) {
			this.cuenta = cuenta;
			return cuenta;
		}
		
		public String getValor() {
			return  getCuenta() + "@" + getDominio();
		}
		
	}
	
	public Persona(String nombre, String apellido) {
		setNombre(nombre);
		setApellido(apellido);
		numeros = new ArrayList<NumeroTelefonico>();
		mails = new ArrayList<EMail>();
		mascotas = new ArrayList<Mascota>();
	}
	
	public void agregarMail(String mail) {
		if(mail != null) {
			mails.add(new EMail(mail));
			System.out.println("Email agregado correctamente");
		}
	}
	
	public void agregarTelefono(NumeroTelefonico numero) {
		if(numero != null) {
			numeros.add(numero);
			System.out.println("Numero de telefono agregado correctamente");
		}
	}
	public void agregarMascota(Mascota m) {
		this.mascotas.add(m);
		System.out.println("La mascota se agrego correctamente");
	}
	
	public void mostrarTodo() {
		System.out.println(getApellido() + ", " + getNombre());
		if(numeros.size() > 0) {
			System.out.println("Telefonos: ");
			for (NumeroTelefonico telefono : numeros) {
				System.out.println(telefono.getTipoDeLinea() + ": " + telefono.getValor());
			}
		}
		if(mails.size() > 0) {
			System.out.println("Emails:");
			for (EMail email : mails) {
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

	private String getNombre() {
		return this.nombre;
	}

	private String getApellido() {
		return this.apellido;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombreYApellido() {
		return this.nombre + ", " + this.apellido;
	}
}
