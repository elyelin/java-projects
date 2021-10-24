package ar.edu.ort.thp.tp2.actividad3.ejercicio11;

public class Test {
	
	public static void main(String[] args) {
		SuperHeroe superheroe1 = new SuperHeroe("Batman", 90, 70, 0);
		SuperHeroe superheroe2 = new SuperHeroe("Superman", 95, 60, 70);
		SuperHeroe superheroe3 = new SuperHeroe("Patoruzu", 95, 68, 0);
		SuperHeroe superheroe4 = new SuperHeroe("Iron Man", 95, 60, 80);
		
		competir(superheroe1, superheroe2);
		competir(superheroe2, superheroe1);
		competir(superheroe1, superheroe3);
		competir(superheroe3, superheroe1);
		competir(superheroe2, superheroe3);
		competir(superheroe3, superheroe2);
		competir(superheroe4, superheroe2);
	}

	private static void competir(SuperHeroe sh1, SuperHeroe sh2) {
		System.out.println(sh1);
		System.out.println(sh2);
		System.out.println("resultado? " + sh1.competir(sh2));
		
	}
	
}
