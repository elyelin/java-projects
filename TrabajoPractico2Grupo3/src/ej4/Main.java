package ej4;

public class Main {

	public static void main(String[] args) {
		Vivienda v1 = new Vivienda("Montañeses", "1234", "4", "C");
		v1.agregarPersona("Roman", "Arturo", 53);
		v1.agregarMueble("Mesa", "Madera","Marrón");
		v1.agregarPersona("Mónica", "Gaztambide", 35);
		v1.agregarMueble("Mesada", "Mármol","Rojo"); 
		v1.agregarMueble("Perchero", "Metal","Negro"); 
		v1.agregarMueble("Sillón", "Cuero","Azul"); 
		
		v1.mostrar();

	}

}