package tp1.tp4.ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

import tp1.tp4.tj3.RangoDeEnteros;

public class Ej2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
		final RangoDeEnteros RANGO_ANIO_NACIMIENTO = new RangoDeEnteros(1900, 2019);

		Alumno alu = null;
		int dni = 0, anioNacimiento = 0, legajo = 0;
		String nombreCompleto;

		while (alu == null) {
			try {
				System.out.println("Complete los siguienes datos:");
				System.out.println("Nombre:");
				nombreCompleto = input.nextLine();
				System.out.println("Anio de nacimiento");
				anioNacimiento = Integer.parseInt(input.nextLine());
				System.out.println("Dni:");
				dni = Integer.parseInt(input.nextLine());
				System.out.println("Legajo:");
				legajo = Integer.parseInt(input.nextLine());
				alu = new Alumno(nombreCompleto, anioNacimiento, dni, legajo);
				alu.setNumeroLegajo(dni);

			} catch (NullPointerException e) {
				System.out.println("Hubi uin error en la carga de un valor: " + e.getMessage());
			} catch (IllegalArgumentException i) {
				System.out.println(i.getMessage());
			} catch (InputMismatchException ime) {
				System.out.println("Hubo un error en la carga del numero: " + ime.getMessage());
			}
		}
		input.close();
		System.out.println(alu.toString());

		if (alu.vive()) {
			System.out.println("La persona vive");
		} else {
			System.out.println("La persona no vive");
		}

	}

}