package ar.edu.ort.tp1.tp6Ej2.clases;

import java.util.ArrayList;

import ar.edu.ort.tp1.tdas.implementaciones.ColaNodos;
import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Cola;
import ar.edu.ort.tp1.tdas.interfaces.Pila;

public abstract class Baraja {

	protected Pila<Naipe> naipes;

	public Baraja(boolean mezclado) {
		naipes = new PilaNodos<Naipe>();
		cargarNaipes();
		if (mezclado) {
			mezclar();
		}
	}

	public void agregar(ArrayList<Naipe> nuevosNaipes) {
		while (!nuevosNaipes.isEmpty()) {
			naipes.push(nuevosNaipes.remove(0));			
		}
	}

	public void agregar(Cola<Naipe> nuevosNaipes) {
		while (!nuevosNaipes.isEmpty()) {
			naipes.push(nuevosNaipes.remove());			
		}
	}

	public void agregar(Naipe naipe) {
		naipes.push(naipe);
	}

	public void agregar(Pila<Naipe> nuevosNaipes) {
		while (!nuevosNaipes.isEmpty()) {
			naipes.push(nuevosNaipes.pop());			
		}
	}

	protected abstract void cargarNaipes();

	public Naipe extraer() {
		return naipes.pop();
	}

	public Cola<Naipe> extraer(int cuantos) {
		// TODO Implementar
		Cola<Naipe> colaCartas = new ColaNodos<>();
		
		//Tengo que sacar 10 cartas del mazo y devolverlas
		int i = 0;
		while(!naipes.isEmpty() && i < cuantos){
			colaCartas.add(naipes.pop());
			i++;
		}
		
		return colaCartas;
	}

	public int getCantidadNaipes() {
		return naipes.size();
	}

	/**
	 * Explicar aca que hace y como funciona
	 */
	protected void mezclar() {
		Urna<Naipe> mezclador = new Urna<>();
		while (!naipes.isEmpty()) {
			mezclador.add(naipes.pop());
		}
		while (!mezclador.isEmpty()) {
			naipes.push(mezclador.remove());
		}
	}
}