package ar.ort.edu.tp1;

public class Email {
	
	private String cuenta;
	private String dominio;
	
	public Email(String email) {
		
		String[] partes = email.split("@");
		
		if(partes.length == 2) {
		  this.cuenta = partes[0];
		  this.dominio = partes[1];
		}
	}
	
	public String getValor() {
		return this.cuenta + "@" + this.dominio;
	}
	

}
