package ar.edu.ort.tp1.ortmarket.modelo;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Pila;

public class Cliente {
	private static final int DNI_MINIMO = 1000000;
	private final static String MSJ_DNI_INVALIDO = "DNI Invalido";
	private final static String MSJ_NOMBRE_INVALIDO = "Nombre Invalido";
	private final static String MSJ_APELLIDO_INVALIDO = "Apellido Invalido";

	private String nombre;
	private String apellido;
	private int dni;
	private double saldo;
	// TODO: A completar

	public Cliente(String nombre, String apellido, int dni, double saldoInicial) {
		// TODO: A completar
	}

	private void agregarEntradaEnHistorial(String mensaje, TipoHistorial tipo) {
		historial.push(mensaje + " Tipo: " + tipo + " Dni: " + dni + " Saldo: " + saldo);
	}

	public int getDni() {
		return dni;
	}

	public String getNombreCompleto() {
		return nombre + " " + apellido;
	}

	/**
	 * Se tiene que mostrar en pantalla el historia completo del Cliente.
	 * Ejemplo: ------------- Mostrando historial de: Mario Perez Creacion de la
	 * cuenta con 60000.0$ de saldo Tipo: FONDEO_INICIAL Dni: 6852741 Saldo:
	 * 60000.0 Se proceso la orden. Codigo: YPFD - BONO USD 2030 L.A.(Gobierno
	 * Nacional Argentino) Tipo: VENTA Dni: 6852741 Saldo: 61200.0 Se proceso la
	 * orden. Codigo: SE - Superfondo Equilibrado(Santander Rio) Tipo: COMPRA
	 * Dni: 6852741 Saldo: 60958.5510105
	 */
	public void imprimirHistorial() {
		// TODO: COMPLETAR
	}

	private void inicializarCuenta(double saldoInicial) {
		historial = new PilaNodos<>();
		saldo = saldoInicial;
		agregarEntradaEnHistorial("Creacion de la cuenta con " + saldoInicial + "$ de saldo",
				TipoHistorial.FONDEO_INICIAL);
	}

	/**
	 * El cliente es responsable de procesar sus ordenes Si la orden es de
	 * compra tiene que restar a su saldo el precio de la Orden al Cliente, si
	 * es menor a 0 se va a registrar en el historial un error de compra Si la
	 * orden es de venta se va a sumar el saldo el precio de la Orden al
	 * Cliente, si el saldo del cliente es menor que el precio de la orden se va
	 * a registrar un error de venta. En los dos casos si se realizo la
	 * operacion tambien tiene que registrarse en el historial
	 * 
	 * @param orden
	 */
	public void procesarOrden(Orden orden) {
		// TODO: COMPLETAR
	}

}
