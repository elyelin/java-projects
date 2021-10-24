package tp1.tp4.tj3;

import java.util.Scanner;

public class LectorEnteros {
	private static final String MENSAJE_ERROR_SCANNER_NULL = "Debe recibirse un Scanner.";
	private static final String MENSAJE_CARGA_ENTERO = "Ingrese un numero entero cualquiera";
	private static final String MENSAJE_FUERA_DE_RANGO = "El valor ingresado esta fuera del rango aceptable";
	private RangoDeEnteros rangoEnteros;
	private Scanner scanner;

	public LectorEnteros(Scanner input) {
		setScanner(input);
	}

	private int cargar(String mensaje) {
		System.out.println(mensaje);
		return Integer.parseInt(scanner.nextLine());
	}

	public int pedir() {
		return cargar(MENSAJE_CARGA_ENTERO);
	}

	public int pedir(String mensaje) {
		int num = 0;
		try {
			num = cargar(mensaje);
		} catch (NumberFormatException i) {
			System.out.println("Error:  " + i.getMessage());
		}

		return num;
	}

	public int pedir(String mensaje, int limiteA, int limiteB) {
		int num = 0;
		num = cargar(mensaje + " entre " + limiteA + " y " + limiteB);
		rangoEnteros = new RangoDeEnteros(limiteA, limiteB);
		if (!rangoEnteros.incluye(num)) {
			throw new IllegalArgumentException(MENSAJE_FUERA_DE_RANGO);
		}
		return num;
	}

	public int pedir(String mensaje, RangoDeEnteros rangoValido) {
		int num = 0;
		if (mensaje == null) {
			throw new IllegalArgumentException("Mensaje null");
		} else if (rangoValido == null) {
			throw new IllegalArgumentException("Error rango invalido");
		} else if (mensaje.isEmpty()) {
			mensaje = MENSAJE_CARGA_ENTERO;
		}
		num = cargar(mensaje);
		if (!rangoValido.incluye(num)) {
			throw new IllegalArgumentException(MENSAJE_FUERA_DE_RANGO);
		}

		return num;
	}

	public int pedir(String mensaje, RangoDeEnteros rango, int numero) {
		int num = 0;

		num = cargar(mensaje);

		if (!rango.incluye(num) && num != numero) {
			throw new IllegalArgumentException(MENSAJE_FUERA_DE_RANGO + " y diferente al valor carga " + numero);
		}

		return num;
	}

	public void setScanner(Scanner scanner) {
		if (scanner != null) {
			this.scanner = scanner;
		} else {
			throw new IllegalArgumentException(MENSAJE_ERROR_SCANNER_NULL);
		}
	}
}
