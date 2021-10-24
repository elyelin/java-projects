package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class FabricaDeMuebles implements Mostrable {

	private String nombre;
	private ArrayList<Mueble> mueblesFabricados;

	public FabricaDeMuebles(String nombre) {
		this.setNombre(nombre);
		this.mueblesFabricados = new ArrayList<Mueble>();
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean fabricar(Mueble m) {
		boolean retorno = false;
		if (m != null) {
			System.out.println("Fabricando el mueble:");
			m.mostrar();
			retorno = this.mueblesFabricados.add(m);
		}
		return retorno;
	}

	public boolean seHaFabricado(String modelo) {
		boolean seHaFabricado = false;
		int i = 0;
		while (i < this.mueblesFabricados.size() && seHaFabricado == false) {
			seHaFabricado = this.mueblesFabricados.get(i).modeloCorrecto(modelo);
			i++;
		}
		return seHaFabricado;
	}

	@Override
	public void mostrar() {
		System.out.println("Fabrica de muebles: " + this.getNombre());
		int cantMesas = 0;
		int cantSillas = 0;
		int cantSillones = 0;
		float acumVentas = 0;
		for (Mueble mueble : mueblesFabricados) {
			if (mueble instanceof Mesa) {
				cantMesas++;
			} else if (mueble instanceof Silla) {
				cantSillas++;
			} else {
				cantSillones++;
			}
			acumVentas += mueble.calcularPrecioVenta();
		}
		System.out.println(
				"Se han fabricado: " + cantMesas + " Mesas, " + cantSillas + " Sillas y " + cantSillones + " Sillones");
		System.out.println("La venta total fue: $" + acumVentas);
	}
}
