package ejercicio2;

import java.util.ArrayList;

public class Carrera {
	private String nombre;
	private ArrayList<Atleta> competidores;
	
	public Carrera(String nombre) {
		setNombre(nombre);
		competidores = new ArrayList<Atleta>();
	}

	private void setNombre(String nombre) {
		this.nombre= nombre;
	}
	
	public void ganador(Atleta atleta) {
		double mejorTiempo = 9999.999;
		Atleta priPuesto = null;
		Atleta repetido;
		Atleta segPuesto;
		int i = 0;
		while (i < competidores.size()) {
			double a = atleta.getTiempo();
			if (a < mejorTiempo) {
				priPuesto = atleta;
				i++;
			} else if (a == mejorTiempo) {
					repetido = atleta;
					i++;
				} else {
					segPuesto = atleta;
					i++;
				}
				System.out.println("El mejor tiempo fue; " + priPuesto);
			}
		}
	}

	


