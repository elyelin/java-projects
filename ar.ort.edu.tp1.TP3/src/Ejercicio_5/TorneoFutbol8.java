package Ejercicio_5;

public class TorneoFutbol8 extends TorneoFutbol implements Puntajes {
	private int jugadores;

	public TorneoFutbol8() {
		setJugadores(jugadores);
	}

	public String getTipo() {
		return "Torneo de futbol 8";
	}

	public int puntajePartidoGanado() {
		return 3;
	}

	public int puntajePartidoPerdido() {
		return 1;
	}

	public int puntajeVallaInvicta() {
		return 1;
	}

	public int puntajeGanador4Goles() {
		return 0;
	}

	public int puntajeEmpateMas3Goles() {
		return 1;
	}

	private void setJugadores(int jugadores) {
		this.jugadores = jugadores;
	}

}
