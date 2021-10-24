package ar.edu.ort.taller.Ejercicio3;

import java.util.ArrayList;

public class Competencia {

	private String nombre;
	private ArrayList<Atleta> atletasConcursantes;
	
	public Competencia(String nombre){
		this.nombre = nombre;
		atletasConcursantes = new ArrayList<Atleta>();
	}
	
	public String getNombre(){ 
		return nombre; 
	}
	
	public ArrayList<Atleta> getAtletasConcursantes(){ 
		return atletasConcursantes; 
	}
	
	public void agregarParticipantes(Atleta atletaParticipante){
		atletasConcursantes.add(atletaParticipante);
	}
	
	public ArrayList<Atleta> getGanadores(){
		ArrayList<Atleta> ganadores = new ArrayList<Atleta>();
		double mejorTiempo = atletasConcursantes.get(0).getTiempo();
		
		for (Atleta atleta : atletasConcursantes) {
			if (atleta.getTiempo()<mejorTiempo){
				ganadores.clear();
				ganadores.add(atleta);
				mejorTiempo = atleta.getTiempo();
			} else 
				if(atleta.getTiempo()==mejorTiempo){
						ganadores.add(atleta);
				}
		}		
		return ganadores;
	}
	
	public ArrayList<Posicion> getTernaGanadores() {
		ArrayList<Posicion> ternaGanadora = new ArrayList<Posicion>();
		Atleta atleta = null;
		Posicion p1 = new Posicion();
		Posicion p2 = new Posicion();
		Posicion p3 = new Posicion();
		int j;
		double primero = 9999;
		double segundo = 9999;
		double tercero = 9999;

		if (atletasConcursantes.size() > 0 ) {
			//Busco los 3 mejores tiempos
			for (int i = 0; i < atletasConcursantes.size(); i++) {
				atleta = atletasConcursantes.get(i);
				j = 0; 			
				
				if (atletasConcursantes.get(i).getTiempo()< primero){
					tercero = segundo;
					segundo = primero;
					primero = atletasConcursantes.get(i).getTiempo();
				}else{
					if(atletasConcursantes.get(i).getTiempo()> primero && atletasConcursantes.get(i).getTiempo()<= segundo){
						tercero = segundo;
						segundo = atletasConcursantes.get(i).getTiempo();
					}else{
						if(atletasConcursantes.get(i).getTiempo()> segundo && atletasConcursantes.get(i).getTiempo()<= tercero){
							tercero = atletasConcursantes.get(i).getTiempo();
						}
					}
				}
			}
			p1.setTiempo(primero);
			p2.setTiempo(segundo);
			p3.setTiempo(tercero);
			
			ternaGanadora.add(p1);
			ternaGanadora.add(p2);
			ternaGanadora.add(p3);

			//Pongo los atletas en las posiciones correspondientes
			for (int i = 0; i < atletasConcursantes.size();i++) {
				for(j = 0; j<ternaGanadora.size();j++){
					if (atletasConcursantes.get(i).getTiempo() == ternaGanadora.get(j).getTiempo()){
						ternaGanadora.get(j).agregarAtleta(atletasConcursantes.get(i));
					}
				}
			}
		}
		return ternaGanadora;
	}
}