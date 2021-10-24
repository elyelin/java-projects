package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class FabricaDeMuebles implements Mostrable {

	//TODO A completar
	private ArrayList<Mueble> mueblesFabricados;
	private String nombre;

	
	public FabricaDeMuebles(String nombre) {
		//TODO A completar
		this.nombre = nombre;
		this.mueblesFabricados = new ArrayList<Mueble>();
	}

	public boolean fabricar(Mueble m) {
		//TODO A completar
		boolean retorno = false;
		if (m != null) {
			System.out.println("Fabricando el mueble: ");
			m.mostrar();
			retorno = this.mueblesFabricados.add(m);
		}
		return retorno;
	}

	@Override
	public void mostrar() {
		//TODO A completar
		System.out.println("Fábrica de muebles: " + nombre);
		int sillones = 0;
		int mesas = 0;
		int sillas = 0;
		float ventasTotales = 0;

		for (Mueble mueble : mueblesFabricados) {
			if (mueble instanceof Silla) {
				sillas++;
			} else if (mueble instanceof Sillon) {
				sillones++;
			} else {
				mesas++;
			}
			ventasTotales += mueble.calcularPrecioVenta();
		}

		System.out.printf("Se han fabricado: %d Mesas, %d Sillas y %d Sillones\n", mesas, sillas, sillones);
		System.out.printf("La venta total fue: $%.2f\n", ventasTotales);
	}

	public boolean seHaFabricado(String modelo) {
		//TODO A completar
		boolean seHaFabricado = false;
		int idx = 0;
		while (!seHaFabricado && idx < this.mueblesFabricados.size()) {
			seHaFabricado = this.mueblesFabricados.get(idx).modeloCorrecto(modelo);
			idx++;
		}
		return seHaFabricado;
	}
}
