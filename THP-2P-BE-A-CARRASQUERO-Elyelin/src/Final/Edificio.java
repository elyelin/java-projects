package Final;

import java.util.ArrayList;

public class Edificio {
	private int pisos;
	private ArrayList<Ascensor> ascensores;

	public Edificio(int piso, int ascensores) {
		setPisos(pisos);
		ascensoresListos(ascensores);
	}

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	public void setAscensores(ArrayList<Ascensor> ascensores) {
		this.ascensores = ascensores;
	}

	public ArrayList<Ascensor> getAscensores() {
		return ascensores;
	}
	//bien
	private void ascensoresListos(int cant) {
		ascensores = new ArrayList<>();
		for(int i = 1; i <= cant; i++) {
			Ascensor n = new Ascensor(ascensores.size()+1);
			ascensores.add(n);
		}
	}
	//no funciona
	private Ascensor obtenerMasCercano(int piso) {
		Ascensor a = null;
		int sum;
		for(int i = 0; i < ascensores.size(); i++) { 
			if(ascensores.get(i).getModo() == Modo.TODOS && ascensores.get(i).puedoParar(piso)) {
				//a = ascensores.get(i);
				for(int v = 0; v < ascensores.size(); v++) { 
					if(ascensores.get(v).getPisoParado() <= a.getPisoParado()) {
						a = ascensores.get(i);
					}
				}
			}
				/*if(ascensores.get(i).getPisoParado() <= piso || ascensores.get(i).getPisoParado() >= piso) {
					if(ascensores.get(i).getModo() == Modo.SOLO_PARES) {
				a = ascensores.get(i);
			}else {
				a = ascensores.get(i);
			}
		}*/
		}
		return a;
	}
	
	public int llamarAscensor(int num) {
		int ascensor = 0;
		Ascensor a = obtenerMasCercano(num);
		if(a != null) {
			a.setPisoParado(num);
			ascensor = a.getNumIdentificador();
		}
		return ascensor;
	}

}
