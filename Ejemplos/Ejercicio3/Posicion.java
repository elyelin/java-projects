package ar.edu.ort.taller.Ejercicio3;

import java.util.ArrayList;

public class Posicion {
	private ArrayList<Atleta> lAtletas;
	private double tiempo;
	
	public Posicion(){
		lAtletas = new ArrayList<Atleta>();
		tiempo = 99999;
	}
	
	public void agregarAtleta(Atleta atleta){
		lAtletas.add(atleta);
	}
	
	public ArrayList<Atleta> getListaAtletas(){
		return lAtletas;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}	
}