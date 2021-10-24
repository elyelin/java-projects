package ar.ort.edu.ejercicio3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Carrera {
	static Scanner input = new Scanner(System.in);
	private String nombre;
	private static String SALIDA = "N";
	private static ArrayList<Atleta> atletas = new ArrayList<Atleta>();
	private static ArrayList<Atleta> competidores;

	public Carrera(String nombre) {
		setNombre(nombre);
		competidores = new ArrayList<>();
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void ingresoAtletas() {
		String nombre, continuar;
		double tiempo;
		
		do {
			System.out.println("Ingrese el nombre del atleta");
			nombre = input.next();
			System.out.println("Ingrese el tiempo del atleta");
			tiempo = input.nextDouble();
			System.out.println("Desea cargar mas atletas? [S/N]");
			continuar = input.next();
			
			atletas.add(new Atleta(nombre,tiempo));
		} while(!continuar.toUpperCase().equals(SALIDA));
	}
	
	public void calcularGanadores() {
		double mejorTiempo = 999999999.99;
		
		for (Atleta atleta : atletas) {
			double tiempoAtleta = atleta.getTiempo();
			if(tiempoAtleta < mejorTiempo) {
				mejorTiempo = tiempoAtleta;
				competidores.clear();
				competidores.add(atleta);
			} else if(tiempoAtleta == mejorTiempo) {
				competidores.add(atleta);
			}
		}
		if (competidores.size() > 1) {
			System.out.println("Los ganadores son:");
		} else {
			System.out.println("El ganador es:");
		}
		System.out.println(competidores);
	}
	
	public void podioGanadores() {
		ArrayList<Atleta> primerLugar = new ArrayList<Atleta>();
		ArrayList<Atleta> segundoLugar = new ArrayList<Atleta>();
		ArrayList<Atleta> tercerLugar = new ArrayList<Atleta>();
		double tiempoAux;
		int listaAux;

		/**
		 * Muy bueno.
		 */
		atletas.sort(new Comparator<Atleta>() {
			@Override
			public int compare(Atleta a1, Atleta a2) {
				return Double.compare(a1.getTiempo(), a2.getTiempo());
			}
		});
		tiempoAux = atletas.get(0).getTiempo();
		listaAux = 1;
		int index = 0;

		while (listaAux < 4) {
			Atleta atleta = atletas.get(index);
			if (tiempoAux == atleta.getTiempo()) {
				posicionAtleta(atleta, listaAux);
			} else {
				tiempoAux = atleta.getTiempo();
				listaAux++;
				posicionAtleta(atleta, listaAux);
			}
			index++;
		}
	}
	
	private static void posicionAtleta(Atleta atleta, int listaAux) {
		if (listaAux == 1) {
			System.out.println("La posicion del atleta " + atleta.getNombre() + " con un tiempo de " + atleta.getTiempo() + " y su posicion es primero");
		}
		if (listaAux == 2) {
			System.out.println("La posicion del atleta " + atleta.getNombre() + " con un tiempo de " + atleta.getTiempo() + " y su posicion es segundo");
		}
		if (listaAux == 3) {
			System.out.println("La posicion del atleta " + atleta.getNombre() + " con un tiempo de " + atleta.getTiempo() + " y su posicion es tercero");
		}
	}
}
