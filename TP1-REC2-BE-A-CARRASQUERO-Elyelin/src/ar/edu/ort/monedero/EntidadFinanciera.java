package ar.edu.ort.monedero;

import edu.ort.tp1.u5.tda.ListaOrdenada;

public class EntidadFinanciera implements Detallable{
	private final String MSG_CANT_CLIENTES = "La cantidad de clientes no puede ser menor o igual a cero";
	private String nombre;
	private int cantClientes;


	public EntidadFinanciera(String nombre, int cantClientes) {
		setNombre(nombre);
		this.cantClientes = cantClientes;
	}

	public void agregarCliente(String nombre, int edad) {
	}

	private int verificarDisponibilidad() {
		return 0;
	}

	public void agregarTransaccion(int nroCliente, Moneda moneda, double valor) {
		
	}


	public void mostrarDetalleCliente(int edad) {

	}
	
	


	public void cantMonedasPorCliente(String moneda) {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre != null) {
			this.nombre = nombre;
		}else {
			throw new RuntimeException("Nombre vacio");
		}
	
	}

	@Override
	public void mostrarDetalle() {
		// TODO Auto-generated method stub
		
	}
}
