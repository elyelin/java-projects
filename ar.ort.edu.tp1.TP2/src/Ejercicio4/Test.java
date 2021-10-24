package Ejercicio4;

public class Test {

	public static void main(String[] args) {
		Vivienda v1 = new Vivienda("Echague", 1234, 4, "A");
		v1.agregarPersona("Juan", "Pablo", 53);
		v1.agregarMueble("Mesa", "Madera","Blanca");
		v1.agregarPersona("Irma", "Josefa", 35);
		v1.agregarMueble("Cocina", "Acero","Gris"); 
		v1.agregarMueble("Perchero", "Metal","Negro"); 
		v1.agregarMueble("Comedor", "Madera","Azul"); 
		
		v1.mostrar();
	}

}
