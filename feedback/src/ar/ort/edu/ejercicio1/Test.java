package ar.ort.edu.ejercicio1;

public class Test {
	
	public static void main(String[] args) {
		Grupo g1 = new Grupo("TP1");

		g1.agregarIntegrante("Juan Pablo");
		g1.agregarIntegrante("Elyelin");
		g1.agregarIntegrante("Orellano");
		g1.agregarIntegrante("Irma");
		g1.agregarIntegrante("El pepe");
		g1.buscarIntegrante("El pepe");
		g1.mostrar();
		System.out.println("--------------------------------------------");
		g1.buscarIntegrante("Elyelin");
		g1.buscarIntegrante("pablo");
		g1.buscarIntegrante("norberto");
		g1.buscarIntegrante("El pepe");
		g1.mostrar();
		System.out.println("---------------------------------------------");
		g1.removerIntegrante("norberto");
		g1.removerIntegrante("norberto");
		g1.removerIntegrante("El pepe");
		g1.mostrar();
		System.out.println("---------------------------------------------");
		g1.vaciar();
		g1.mostrar();
	}

}
