package ar.edu.ort.monedero;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int cantClientes = 0;
		EntidadFinanciera e = crearEntidad("",cantClientes);

		cantClientes = 3;
		EntidadFinanciera entidad = crearEntidad("EntidadVirtual", cantClientes);
		entidad.agregarCliente("Jose Perez", 55);
		entidad.agregarCliente("Alejandra Gonzalez", 30);
		entidad.agregarCliente("Carlos Garcia", 27);
		

		Moneda bitcoin = new Bitcoin(40000);
		Moneda ethereum = new Ethereum(32500);

		entidad.agregarTransaccion(1, bitcoin, 14000);
		entidad.agregarTransaccion(1, ethereum, 12000);
		entidad.agregarTransaccion(2, ethereum, 78000);
		entidad.agregarTransaccion(2, bitcoin, 62000);
		entidad.agregarTransaccion(3, bitcoin, 178000);
		
		entidad.agregarTransaccion(3, ethereum, 8000);
		entidad.agregarTransaccion(3, ethereum, 1000);
		entidad.agregarTransaccion(1, ethereum, 46000);
		entidad.agregarTransaccion(2, bitcoin, 56500);
		entidad.agregarTransaccion(2, bitcoin, 6120);
		entidad.agregarTransaccion(1, bitcoin, 7443);
		
		
		System.out.println("----------------------");
		entidad.mostrarDetalle();
		System.out.println("----------------------");
		entidad.cantMonedasPorCliente("Bitcoin");
		System.out.println("----------------------");
		mostrarInfoCliente(entidad);
		System.out.println("----------------------");
	
	}

	public static EntidadFinanciera crearEntidad(String nombre, int cantClientes){
	
	}
	
	public static void mostrarInfoCliente(EntidadFinanciera e){
		Scanner input = new Scanner(System.in);
	}
}
