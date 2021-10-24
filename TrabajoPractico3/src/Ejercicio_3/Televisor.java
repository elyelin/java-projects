package Ejercicio_3;

public class Televisor extends Electrodomestico {
	private int dimension;
	private boolean smart;
	
	public Televisor() {
		dimension = 0;
		smart = false;
	}

	public Televisor(String tipo, String marca, String modelo, int numeroSerie, float voltaje, boolean encendidoApagado,
			float precio, int dimension, boolean smart) {
		super(tipo, marca, modelo, numeroSerie, voltaje, encendidoApagado, precio);
		this.dimension = dimension;
		this.smart = smart;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	
	public String descripcionSmart() {
		if(smart) 
			return "smart";
		else 
			return "Sin smart";
	}

	public String esSmart() {
		if(smart) {
			return "smart";
		}else {
			return "Sin smart";
		}
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	@Override
	public String toString() {
		return super.toString() + "Televisor [dimension=" + dimension + ", smart=" + smart + "]";
	}

	@Override
	public String mostrarProducto() {
		return "Televisor " + descripcionSmart() + " " + getMarca() + " " + dimension + "pulgadas, modelo " + getModelo() + ": $" + getPrecio() ;
	}

	@Override
	public String getTipo() {
		return "Televisor";
	}

}
