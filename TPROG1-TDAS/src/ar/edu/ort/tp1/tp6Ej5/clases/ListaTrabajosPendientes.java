package ar.edu.ort.tp1.tp6Ej5.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaTrabajosPendientes extends ListaOrdenadaNodos<Integer, Trabajo> implements Reportable{

	@Override
	public int compare(Trabajo dato1, Trabajo dato2) {
		return dato1.getCodigo() - dato2.getCodigo();
	}

	@Override
	public int compareByKey(Integer clave, Trabajo elemento) {
		return clave - elemento.getCodigo();
	}

	@Override
	public void reportar() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		//Recorrer la lista y para cada trabajo, invocar al metodo reportar
		for(Trabajo t: this){
			t.reportar();
		}
	}

}
