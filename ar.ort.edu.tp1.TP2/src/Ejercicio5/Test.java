package Ejercicio5;

public class Test {

	public static void main(String[] args) {
		Vivienda v1 = new Vivienda("Echague", 1234, 4, "A");
		//v1.agregarPersona("Juan", "Pablo", 53);
		//v1.agregarMueble("Mesa", "Madera","Blanca");
		v1.agregarPersona("Irma", "Josefa", 35);
		v1.agregarMueble("Cocina", "Acero","Gris"); 
		//v1.agregarMueble("Perchero", "Metal","Negro"); 
		//v1.agregarMueble("Comedor", "Madera","Azul"); 
		Vivienda v = new Vivienda("Echague", 1234, 2, "M");
		Vivienda vv = new Vivienda("Echague", 1234, 3, "F");
		v1.mostrar();
		Edificio e = new Edificio();
		e.agregarVivienda(vv);
		e.agregarVivienda(v1);
		e.agregarVivienda(v);
		e.realizarMudanza(4, "A", 2, "M");
		
		
	}

}
