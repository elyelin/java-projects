package ejercicio1;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private ArrayList<String> integrantes;

	public Grupo(String nombre) {
		setNombre(nombre);
		integrantes = new ArrayList<String>();
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void agregarIntegrante(String nombreIntegrante) {
		if (existeIntegrante(nombreIntegrante) != null) {
			integrantes.add(nombreIntegrante);
			System.out.println("Agregado correctamente");
		} else {
			System.out.println("No se agrego");
		}
	}

	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int retorno = -1;
		int i = 0;
		if (existeIntegrante(nombreIntegrante) != null) {
			while (i <= integrantes.size()) {
				if (integrantes.get(i).equals(nombreIntegrante)) {
					retorno = i;
				} else {
					i++;
				}
			}
		}
		return retorno;
	}

	public String obtenerIntegrante(int posicion) {
		String pudo = null;
		if (validarNumeroPositivoEntero(posicion) == true) {
			pudo = integrantes.get(posicion - 1);
		}
		return pudo;
	}

	public String buscarIntegrante(String nombre) {
		String pudo = null;
		if (existeIntegrante(nombre) != null) {
			pudo = nombre;
			System.out.println("Se encontro a: " + pudo);
		}
		return pudo;
	}

	public String removerIntegrante(String nombreIntegrante) {
		boolean sePudoRemover = this.integrantes.remove(nombreIntegrante);
		String removido = null;
		if (sePudoRemover) {
			removido = nombreIntegrante;
			System.out.println("Se removio correctamente");
		} else {
			System.out.println("No existe");
		}
		return removido;
	}

	private void mostrarIntegrantes() {
		System.out.println("Cantidad de integrantes del grupo: " + integrantes.size() + " Integrantes: " + integrantes);
	}

	public void mostrar() {
		System.out.println(getNombre());
		mostrarIntegrantes();
	}

	public void vaciar() {
		integrantes.clear();
	}

	private boolean validarNumeroPositivoEntero(int num) {
		boolean pudo = false;
		if (num <= 1) {
			pudo = true;
		}
		return pudo;
	}

	private String existeIntegrante(String nombre) {
		int i = 0;
		boolean encontrado = false;
		String integranteEncontrado = null;

		while (i < this.integrantes.size() && !encontrado) {
			if (integrantes.get(i).equals(nombre)) {
				encontrado = true;
				integranteEncontrado = nombre;
			}
			i++;
		}
		return integranteEncontrado;
	}
}
