package unidad2EjercicioProfe;

import java.util.ArrayList;
import java.util.Iterator;

public class Persona {
	private String nombre;
	private int edad;
	private int peso;
	private int altura;
	private ArrayList<Propiedad> lPropiedades;
	private ArrayList<TituloComposicion> lTitulos;
	private ArrayList<Titulo> lTitulos2;
	
	class TituloComposicion{
		private String descripcion;
		
		public TituloComposicion(String descripcion){
			this.descripcion = descripcion;
		}
		
		public String getDescripcion() {
			return descripcion;
		}


		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}


		@Override
		public String toString() {
			return "Titulo [descripcion=" + descripcion + "]";
		}
	}
	
	/*
	public Persona(){
		nombre = "sin nombre";
		edad = 0;
		lPropiedades = new ArrayList<>();
	}
	*/
	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		lPropiedades = new ArrayList<>();
		lTitulos = new ArrayList<>();
		lTitulos2 = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	//Agregacion
	public void agregarPropiedad(Propiedad p){
		lPropiedades.add(p);
	}
	
	/*
	public void agregarTitulo(Titulo t){
		lTitulos.add(t);
	}
	*/
	
	//Composicion
	public void agregarTitulo(String descripcion){
		TituloComposicion t = new TituloComposicion(descripcion);
		Titulo t2 = new Titulo(descripcion);
		
		lTitulos.add(t);
		lTitulos2.add(t2);
	}
	
	//Rompo la relacion de composicion
	public TituloComposicion getPrimerTituloComp(){
		return lTitulos.get(0);
	}
	
	public void mostrarTitulos(){
		for(TituloComposicion t: lTitulos){
			System.out.println(t.toString());
		}
	}
	
	/*
	 public Titulo getPrimerTitulo(){
	 
		return lTitulos2.get(0);
	}
	*/
	
	public Propiedad getPropiedad(int nroPropiedad){
		Propiedad aux = null;
		if (nroPropiedad <= lPropiedades.size()){
			aux = lPropiedades.get(nroPropiedad - 1);
		}
		return aux;		
	}
	
	public void mostrarPropiedades(){
		for(Propiedad p: lPropiedades){
			System.out.println(p.toString());
		}
	}
	

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	public String mostrarNombreYEdad(){
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
}
