package ar.edu.ort.tp1.tp6Ej1;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Pila;
import ar.edu.ort.tp1.tp6Ej1.clases.FabricanteDePelotas;
import ar.edu.ort.tp1.tp6Ej1.clases.PelotaDeTenis;
import ar.edu.ort.tp1.tp6Ej1.clases.PelotasPorUso;
import ar.edu.ort.tp1.tp6Ej1.clases.TuboPelotasDeTenis;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Obtener un tubo de pelotas de tenis del Fabricante
		TuboPelotasDeTenis tuboDePelotas = FabricanteDePelotas.fabricarTubo();

		// Sacar una pelota del tubo, usara una vez y volverla la guardar.
		PelotaDeTenis pelota = tuboDePelotas.extraer();
		pelota.usar();
		tuboDePelotas.guardar(pelota);
		
		// Desarrollar el metodo nombrado a continuacion.
		// Debe quedar tal como estaba al recibirlo.
		listarContenidoTubo(tuboDePelotas);
	}

	private static void listarContenidoTubo(TuboPelotasDeTenis tuboDePelotas) {
		// TODO completar
		//Vamos a mostrar el estado de cada pelota y luego vamos a guardarlas de forma ordenada
		Pila<PelotaDeTenis> tuboAux = new PilaNodos<>();
		PelotasPorUso listaOrdenadaPelotas = new PelotasPorUso();
		PelotaDeTenis aux = null;
		while(!tuboDePelotas.estaVacio()){
			aux = tuboDePelotas.extraer();
			System.out.println(aux);
			listaOrdenadaPelotas.add(aux);
			//tuboAux.push(aux);
		}	
		/*
		while(!tuboAux.isEmpty()){
			tuboDePelotas.guardar(tuboAux.pop());
		}	
		*/
		//////////////////
		//Recorro la lista ordenada, voy sacando los elementos y los voy apilando en tuboPelotas
		for(PelotaDeTenis pelota: listaOrdenadaPelotas){
			tuboDePelotas.guardar(pelota);
		}		
	}

}
