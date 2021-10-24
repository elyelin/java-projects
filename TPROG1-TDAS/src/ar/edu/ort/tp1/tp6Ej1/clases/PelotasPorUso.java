package ar.edu.ort.tp1.tp6Ej1.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class PelotasPorUso extends ListaOrdenadaNodos<Integer, PelotaDeTenis>{

	@Override
	public int compare(PelotaDeTenis dato1, PelotaDeTenis dato2) {
		return dato1.getUsos() - dato2.getUsos();
	}

	@Override
	public int compareByKey(Integer clave, PelotaDeTenis elemento) {
		return clave - elemento.getUsos();
	}

}
