package Ejercicio_5;

public class TorneoFutbol11 extends TorneoFutbol implements Puntajes {
	private int jugadores;

	public TorneoFutbol11(int jugadores) {
		setJugadores(jugadores);
	}

	@Override
	public String getTipo() {
		return "Torneo de futbol 11";
	}

	@Override
	public int puntajePartidoGanado() {
		return 3;
	}

	@Override
	public int puntajePartidoPerdido() {
		return 0;
	}

	@Override
	public int puntajeVallaInvicta() {
		return 0;
	}

	@Override
	public int puntajeGanador4Goles() {
		return 0;
	}

	@Override
	public int puntajeEmpateMas3Goles() {
		return 0;
	}

	public int getJugadores() {
		return jugadores;
	}

	private void setJugadores(int jugadores) {
		this.jugadores = jugadores;
	}

}
