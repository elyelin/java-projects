package ar.ort.edu.ejercicio1;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private ArrayList<String> integrantes;
	
	public Grupo(String nombre) {
		setNombre(nombre);
		integrantes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidadIntegrantes() {
		return this.integrantes.size();
	}
	
	public void agregarIntegrante(String nombre) {
		if(buscarIntegrante(nombre) == null) {
			integrantes.add(nombre);
			System.out.println(nombre + " fue asignada al grupo: " + getNombre());
		}
	}
	
	public String buscarIntegrante(String nombre) {
		int i = 0;
		boolean encontrado = false;
		String integranteEncontrado = null;

		while (i < getCantidadIntegrantes() && !encontrado) {
			if (integrantes.get(i).equals(nombre)) {
				encontrado = true;
				integranteEncontrado = nombre;
				System.out.println("Se encontro a " + integranteEncontrado + " en la posicion " + (i+1));
			}
			i++;
		}
		return integranteEncontrado;
	}
	
	private int obtenerPosicionIntegrante (String nombreIntegrante) {
		int retorno = -1;
		int i=0;
		if (buscarIntegrante(nombreIntegrante) != null) {
			while (i<=integrantes.size()) {
				if (integrantes.get(i).equals(nombreIntegrante)){
					retorno = i;
				} else {
					i++;
				}
			}
		}
		return retorno;
	}
	
	public String obtenerIntegrante(int posicion) {
		String integrante = null;

		if (posicion <= this.integrantes.size() && posicion >= 1) {
			integrante = integrantes.get(posicion - 1);
		} 
		return integrante;
	}

	public String removerIntegrante(String nombre) {
		boolean sePudoRemover = this.integrantes.remove(nombre);
		String removido = null;
		if(sePudoRemover) {
			removido = nombre;
			System.out.println("Se removio correctamente");
		}else {
			System.out.println("No existe");
		}
		return removido;
	}

	private void mostrarIntegrantes() {
		System.out.println("Cantidad de integrantes del grupo: " + integrantes.size() + " Integrantes: " + integrantes );
	}

	public void mostrar() {
		System.out.println("Nombre del grupo: " + this.nombre);
		mostrarIntegrantes(); 
	}
	
	public void vaciar() {
		integrantes.clear();
	}
}