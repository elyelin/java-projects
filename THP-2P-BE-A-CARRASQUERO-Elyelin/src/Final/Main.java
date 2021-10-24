package Final;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Edificio alvear = new Edificio(30, 4);
		
		System.out.println(alvear.llamarAscensor(14));
		System.out.println(alvear.llamarAscensor(13));	
		System.out.println(alvear.llamarAscensor(2));
		System.out.println(alvear.llamarAscensor(16));
		System.out.println(alvear.llamarAscensor(5));
		System.out.println(alvear.llamarAscensor(30));
		System.out.println(alvear.llamarAscensor(1));
	}

}
/*
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
private void ascensoresListos(int cant) {
	ascensores = new ArrayList<>();
	for(int i = 1; i <= cant; i++) {
		Ascensor n = new Ascensor(ascensores.size()+1);
		ascensores.add(n);
	}
}
private Ascensor obtenerMasCercano(int piso) {
	Ascensor a = null;
	for(int i = 0; i < ascensores.size(); i++) { 
			if(ascensores.get(i).getPisoParado() <= piso || ascensores.get(i).getPisoParado() >= piso) {
				if(ascensores.get(i).getModo() == Modo.SOLO_PARES) {
			a = ascensores.get(i);
		}else {
			a = ascensores.get(i);
		}
	}
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
	return ascensor;}}
*/