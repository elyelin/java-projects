package Ejercicio_5;

public class TorneoFutbol5 extends TorneoFutbol implements Puntajes {
	private int jugadores;

	public TorneoFutbol5(int jugadores) {
		setJugadores(jugadores);
	}

	@Override
	public String getTipo() {
		return "Torneo de futbol 5";
	}

	@Override
	public int puntajePartidoGanado() {
		return 2;
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
		return 1;
	}

	@Override
	public int puntajeEmpateMas3Goles() {
		return 2;
	}

	private void setJugadores(int jugadores) {
		this.jugadores = jugadores;
	}
}