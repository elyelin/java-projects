package Fpr;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		final char MUJER = 'F';
		final char HOMBRE = 'M';
		final int EDAD_MIN = 1;
		final int EDAD_MAX = 120;
		final int JUBILADA = 60;
		final int JUBILADO = 65;

		int edad;
		char genero = ' ';
		boolean paraJubilarse = false;
		String msj = "";

		System.out.println("Ingrese su edad: ");
		edad = sc.nextInt();
		
		if(edad >= EDAD_MIN && edad <= EDAD_MAX) {
			System.out.println("Ingrese su genero " + MUJER + " o " + HOMBRE);
			//genero = sc.
					//.nextChar();
			
			switch (genero) {
			case MUJER:
				paraJubilarse = edad >= JUBILADA;
				msj = "jubilada";
				break;
				
			case HOMBRE:
				paraJubilarse = edad >= JUBILADO;
				msj = "jubilado";
			break;

			default:
				msj = "error";
				break;
			}
			
			System.out.println(msj);
		}
		
		
		
		
	}

}
