package Ejercicio5;

import java.util.ArrayList;

public class Edificio {
	private ArrayList<Vivienda> viviendas;
	
	public Edificio() {
		viviendas = new ArrayList<Vivienda>();
	}
	
	public void realizarMudanza(int piso, String departamento, int pisoD, String departamentoD) {
		/*int p = viviendas.indexOf(piso);
		int d = viviendas.indexOf(departamento);
		if(p != -1 && d != -1) {
			System.out.println("Se encontro en " + p);
		}else {
			System.out.println("NO " + viviendas.size());
		}*/
		
		int i = 0;
		Vivienda v = null;
		
		while(i < viviendas.size() && v == null) {
			if(viviendas.get(i).getPiso() == piso && viviendas.get(i).getDepto().equals(departamento)) {
				v = viviendas.get(i);
				System.out.println("Encontrado ");
			}else {
				System.out.println("No se encontro");
			}
			i++;
		}
		
		
		
	}
	
	public void agregarVivienda(Vivienda v) {
		if(v != null) {
			viviendas.add(v);
		}
	}
}
