package ar.edu.ort.monedero;

public class Cliente implements Detallable{

	private int edad;
	private String nombre;
	
	
	public Cliente(String nombre, int edad){
		this.edad = edad;
		this.nombre = nombre;
	}	
	
	public void agregarTransaccion(Moneda moneda, double valor){
		Transaccion t = new Transaccion(moneda, valor);
		System.out.println("Transaccion agregada");
	}	
	

	public double cantMonedas(String moneda){
		double salida = 0;
		
		return salida;
	}

	@Override
	public void mostrarDetalle() {
	}
	
	
}
