package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class FabricaDeMuebles implements Mostrable{
	private String nombre;
	private ArrayList<Mueble> muebles;

	public FabricaDeMuebles(String nombre) {
		this.nombre = nombre;
		this.muebles = new ArrayList<>();
	}

	public boolean fabricar(Mueble m) {
		boolean retorno = false;
		if (m.getPorcentajeGanancia() > 5) {
			System.out.println("Fabricando el mueble:");
			m.mostrar();
			retorno = this.muebles.add(m);
		} else {
			System.out.println("No se pudo fabricar el mueble " + m.getModelo());
			}
		return retorno;
	}
	
	public boolean superoCosto(double monto) {
		boolean seHaFabricado = false;
		int i = 0;
		Mueble m = null;
		while (this.muebles.size() > i && seHaFabricado == false) {
			m = this.muebles.get(i);
			if(m.getCostoBase() > monto) {
				seHaFabricado = true;
			}			
			i++;
		}
		return seHaFabricado;
		
		/*while(!sehasuperado && i < muebluefabricados.size())
		if(fabricados.get(i).getCostovae>monto
				superado=true
		}
	i++*/
	}

	@Override
	public void mostrar() {
		System.out.println("Fábrica de muebles: " + this.getNombre());
		// como se debio haber hecho
		int sillas = 0;
		int total = 0;
		
		float ventas = 0;
		for (Mueble mueble : muebles) {
			if (mueble instanceof Silla) {
				sillas++;
			}
			total++;
			ventas += mueble.calcularPrecioVenta();
		}
		double porcentaje = sillas * 100/ total ; 
		System.out.println("La cantidad de sillas corresponde a "+porcentaje+"% del total de muebles fabricados");
		System.out.printf("La venta total fue: $%.2f\n", ventas);
	}

	public String getNombre() {
		return nombre;
	}
}
