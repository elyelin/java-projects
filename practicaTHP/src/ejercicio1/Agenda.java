package ejercicio1;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Persona> agenda;
	
	public Agenda() {
		agenda = new ArrayList<>();
	}
	
	private Persona buscarPersona(String dni) {
		int i = 0;
		Persona p = null;
		
		while(i < agenda.size() && p == null) {
			if(agenda.get(i).getDni() != dni) {
				i++;
			}else {
				p = agenda.get(i);
			}
		}
		return p;
	}
	
	public boolean agregarPersona(String n, String a, String d, String dni) {
		boolean agregado = false;
		if(buscarPersona(dni) == null) {
			Persona p = new Persona(n, a, d, dni);
			agenda.add(p);
			agregado = true;
		}
		return agregado;
	}
	
	public Persona removerPersona(String dni) {
		Persona p = buscarPersona(dni);
		if(p != null) {
			agenda.remove(p);
		}
		return p;
	}
	
	public boolean modificarDomicilio(String dni, String dom) {
		boolean exito = false;
		Persona p = buscarPersona(dni);
		if(p != null) {
			p.setDireccion(dom);
			exito = true;
		}
		return exito;
	}
	
	public void listarPersonas() {
		for(Persona p : agenda) {
			System.out.println( p.toString());
		}
	}
	
	public Persona devolverUltimo() {
		Persona p = null;
		if(!agenda.isEmpty()) {
			p = agenda.get(agenda.size()-1);
			System.out.println(p);
		}
		return p;
	}
	
	public boolean eliminartodosElementosAMano() {
		boolean m = false;
		while ( this.agenda.size() > 0) { 
			this.agenda.remove(0) ;
			}
		for(Persona p : agenda) {
			m = agenda.remove(p);
			System.out.println("eliminado: " + p.getNombre());
		}
		return m;
	}
}
