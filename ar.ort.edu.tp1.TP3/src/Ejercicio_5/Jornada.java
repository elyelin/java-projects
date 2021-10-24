package Ejercicio_5;

import java.util.ArrayList;

public class Jornada {

	private ArrayList<Partido> partidos;
	private int fecha;

	public Jornada() {
		fecha = 0;
		partidos = new ArrayList<>();
	}

	public Jornada(int fecha) {
		this.fecha = fecha;
		partidos = new ArrayList<>();
	}

	public void agregarPartido(Partido partido) {
		partidos.add(partido);
	}

	public void eliminarPartido(Partido partido) {
		partidos.remove(partido);
	}

	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
}