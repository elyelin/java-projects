package tp5EJ4;

import java.util.ArrayList;

public class CircuitoATP {
	private String[] jugadores;
	private String[] torneos;
	private int[][] resultados;

	public CircuitoATP() {
		this.cargarData();
	}
	public void cargarData() {
		this.jugadores = new String[] {"Pella", "Del Potro", "etc"};
		this.torneos = new String[] { "Australia", "USOpen", "RolandGarros", "Wimbledon","Shangai"};
		this.resultados = new int[][] {	{1,3,4,1,3},
										{3,2,3,4,1},
										{2,1,5,5,2},
										{4,5,1,2,5},
										{5,4,2,3,4}};
		
				
	}
	public ArrayList<Jugador> procesarInfo() {
		ArrayList<Jugador> listaJugadores = new ArrayList<>();
		Jugador jug = null;
		for(int i = 0; i<resultados.length; i++) {
			jug = new Jugador(jugadores[i]);
			for(int j=0; j<resultados[i].length; j++) {
				jug.procesarResultado(resultados[i][j]);
			}
			listaJugadores.add(jug);
		}
		return listaJugadores;
	}
	
	public String procesarTorneosJugador(String Jugador) {
		String competencias = "";
		int filaJugador = buscoJugador(Jugador);
		if(filaJugador >= 0) {
			competencias = Jugador + ":";
			for(int i = 0; i < torneos.length; i++) {
				competencias += torneos[i] + ":" + resultados[filaJugador][i] + " ";
			}
		}
		return competencias;
	}
	
	public String obtenerResultadoJugador(String jugador, String torneo) {
		//Completar
	}
	
	private int buscoJugador(String Jugador) {
		int posJugador = -1;
		int i = 0;
		
		while(i < jugadores.length && posJugador == -1) {
			if(jugadores[i].equals(Jugador)) {
				posJugador = i;
			}
			else {
				i++;
			}
		}
		return posJugador;
	}
	
	private int buscoTorneo(String torneo) {
		int posTorneo = -1;
		//Completar
		return posTorneo;
	}
	
	public int procesarPeorPosTorneoJugador(String jugador) {
		
	}
}
