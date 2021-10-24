package tp1.tp4.tj3;

import java.time.Year;
import java.util.Scanner;

public class Ej3 {
	static final int VALOR_DE_FIN_DE_CARGA = -1;

	public static void main(String[] args) {
		int nacimiento = 0;
		int fallecimiento = 0;

		Scanner input = new Scanner(System.in);

		LectorEnteros lector = new LectorEnteros(input);
		Persona persona = null;
		int numero = lector.pedir("Ingrese un numero entero");
		RangoDeEnteros rango = new RangoDeEnteros(1900, Year.now().getValue());
		try {
			nacimiento = lector.pedir("Ingrese el nacimiento", rango);
			RangoDeEnteros rango2 = new RangoDeEnteros(nacimiento, Year.now().getValue());
			fallecimiento = lector.pedir("Ingrese el fallecimiento", rango, VALOR_DE_FIN_DE_CARGA);
			persona = new Persona(nacimiento, fallecimiento);

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		if (persona != null) {
			System.out.println("La persona tiene : " + persona.calcularEdad() + " y aun vive : " + persona.vive());
		}

		input.close();
	}
}
