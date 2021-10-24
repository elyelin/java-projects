package ar.edu.ort.thp.tp2.actividad2.ejercicio5;

public class Test {

	public static void main(String[] args) {
		Automovil auto = new Automovil("Ford", "Fiesta", "ABCD123", 40);
		auto.setRendimientoPorLitro(10);
		auto.cargarCombustible(20);

		realizarViaje(auto, 180);
		realizarViaje(auto, 50);
	}

	/**
	 * Realiza el viaje de un auto indicando los kilometros
	 * 
	 * @param auto
	 *            El automovil que viaja
	 * @param km
	 *            Los kilometros que se quieren responder
	 */
	private static void realizarViaje(Automovil auto, int km) {
		// Como viajar devuelve los kilometros se puede informar directamente en
		// la salida.
		System.out.println(auto.viajar(km) + " kilometros recorridos.");
	}

}