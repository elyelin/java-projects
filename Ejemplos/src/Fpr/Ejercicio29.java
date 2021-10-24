package Fpr;

import java.util.Scanner;

public class Ejercicio29 {

	static final Scanner input = new Scanner(System.in);
	static final int NOTA_MIN = 0;
	static final int NOTA_MAX = 10;

	public static void main(String[] args) {
		int nota;
		String mensaje1 = "Ingrese un número entre ";
		String mensaje2 = " y ";
		String mensaje3 = "La nota ingresada es: ";

		do {
			System.out.println(mensaje1 + NOTA_MIN + mensaje2 + NOTA_MAX);
			nota = Integer.parseInt(input.nextLine());
		} while (nota < 0 || nota > 10);

		System.out.println(mensaje3 + nota);

		input.close();
	}
}
