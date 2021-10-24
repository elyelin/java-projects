package ar.edu.ort.thp.tp2.actividad2.ejercicio4;

public class Test {

	public static void main(String[] args) {
		Propietario fulano = new Propietario("Gomez", "Fulano", new RegistroDeConducir("12345678"));
		Vehiculo auto = new Vehiculo("Giat", "Halio", "Gris oscuro", 180);
		fulano.montarVehiculo(auto);
		
		System.out.println(fulano);
		
		fulano.ponerEnMarchaVehiculo();
		fulano.acelerar(40);

		for (int cantGiros = 0; cantGiros < 4; cantGiros++) {
			fulano.conducir();
			fulano.frenar(35);
			fulano.girar('D', 90);
			fulano.acelerar(35);
		}

		fulano.conducir();
		fulano.frenar(40);

		fulano.apagarVehiculo();
	}

}
