package tp1.parcial1.clases;

import java.util.ArrayList;

public class TallerMecanico {

	private ArrayList<Servicio> serviciosEfectuados;
	private String nombre;

	private static final String FORMATO_CANTIDADES = "Se efectuaron: %d cambios de aceite, %d encendido y %d alineacion\n";

	public TallerMecanico(String nombre) {
		this.nombre = nombre;
		serviciosEfectuados = new ArrayList<>();
	}

	public boolean agregarServicio(Servicio nuevoServicio) {
		boolean pudo = false;

		try {
			// pudo = serviciosEfectuados.add(nuevoServicio);
			serviciosEfectuados.add(nuevoServicio);
		} catch (NullPointerException e) {
			System.out.println("No se pudo agregar el servicio: " + e);
		}

		// el mensaje estaba duplicado
		// cuando veo que algo es redundante es por que esta mal
		// estaba escribiendo codigo de mas ya que no hacia falta el try
		return pudo;
	}

	private boolean buscarServicio(Servicio serv) {
		boolean encontrado = false;
		int i = 0;

		while (!encontrado && i < serviciosEfectuados.size()) {
			if (serviciosEfectuados.get(i).equals(serv)) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	public void listarServicios() {
		int contadorAlineacion = 0;
		int contadorEncendido = 0;
		int contadorCambio = 0;
		double sumaTotal = 0;

		for (Servicio s : serviciosEfectuados) {
			if (s instanceof CambioAceite) {
				contadorCambio++;
				sumaTotal += s.calcularPrecioVenta();
			}
			if (s instanceof Encendido) {
				contadorEncendido++;
				sumaTotal += s.calcularPrecioVenta();
			}
			if (s instanceof Alineacion) {
				contadorAlineacion++;
				sumaTotal = sumaTotal + s.calcularPrecioVenta();
			}

		}
		System.out.println(getNombre());
		System.out.println("Se efectuaron: " + contadorCambio + " cambios de aceite, " + contadorEncendido
				+ " encendido y " + contadorAlineacion + " alineaciones");
		System.out.println("El importe total de ventas es de $" + sumaTotal);
	}

	public String getNombre() {
		return nombre;
	}
}
