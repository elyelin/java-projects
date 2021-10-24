package Ejercicio_5;

import java.util.ArrayList;

public abstract class TorneoFutbol implements Puntajes {

	private ArrayList<Jornada> jornadas;
	private ArrayList<Equipo> equipos;

	public TorneoFutbol() {
		jornadas = new ArrayList<>();
		equipos = new ArrayList<>();
	}

	public void agregarJornada(Jornada jornada) {
		jornadas.add(jornada);
	}

	public void eliminarJornada(Jornada jornada) {
		jornadas.remove(jornada);
	}

	public void agregarEquipo(Equipo equipo) {
		equipos.add(equipo);
	}

	public void eliminarEquipo(Equipo equipo) {
		equipos.remove(equipo);
	}

	public void finalizarJornada(Jornada jornada) {
		if (jornadas.contains(jornada)) {
			ArrayList<Partido> p = jornada.getPartidos();
			for (int i = 0; i < p.size(); i++) {
				calcularPuntos(p.get(i)); //
			}
		}
	}

	public void mostrarTabla() {
		System.out.println(getTipo());
		System.out.println("Tabla de posiciones al cabo de " + String.valueOf(jornadas.size()) + " fechas:");

		for (Equipo e : equipos) {
			System.out.println(e.getNombre() + ": " + e.getPuntos() + " puntos");
		}
	}

	public abstract String getTipo();

	public void calcularPuntos(Partido partido) {
		int puntosLocal = 0;
		int puntosVisitante = 0;
		int golesEquipoLocal = partido.getGolesEquipoLocal();
		int golesEquipoVisitante = partido.getGolesEquipoVisitante();

		if (golesEquipoLocal > golesEquipoVisitante) {// Si gana el local
			puntosLocal = +puntajePartidoGanado();
			puntosVisitante += puntajePartidoPerdido();
			if (golesEquipoVisitante == 0) {
				puntosLocal += puntajeVallaInvicta();
			}
			if ((golesEquipoLocal - golesEquipoVisitante) > 4) {
				puntosLocal += puntajeGanador4Goles();
			}

		} else {
			if (golesEquipoLocal == golesEquipoVisitante) {
				puntosLocal = puntajePartidoEmpatado();
				puntosVisitante = puntajePartidoEmpatado();
				if (golesEquipoLocal > 3) {
					puntosLocal += puntajeEmpateMas3Goles();
					puntosVisitante += puntajeEmpateMas3Goles();
				}
			} else {// Si gana el visitante
				puntosVisitante = +puntajePartidoGanado();
				puntosLocal += puntajePartidoPerdido();
				if (golesEquipoLocal == 0) {
					puntosVisitante += puntajeVallaInvicta();
				}
				if ((golesEquipoVisitante - golesEquipoLocal) > 4) {
					puntosVisitante += puntajeGanador4Goles();
				}
			}
		}
		partido.getEquipoLocal().setPuntos(puntosLocal);
		partido.getEquipoVisitante().setPuntos(puntosVisitante);
	}

	public int puntajePartidoEmpatado() {
		return 0;
	}

	public abstract int puntajePartidoGanado();

	public abstract int puntajePartidoPerdido();

	public abstract int puntajeVallaInvicta();

	public abstract int puntajeGanador4Goles();

	public abstract int puntajeEmpateMas3Goles();

}