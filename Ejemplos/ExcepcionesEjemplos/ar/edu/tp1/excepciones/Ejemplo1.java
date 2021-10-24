package ar.edu.tp1.excepciones;

import java.util.Scanner;

public class Ejemplo1 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in); 
		int numero = -1;
		try {
		   System.out.println("El numero vale " + numero);
		   System.out.print("ingresá un número: ");
		   numero = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException nfe) {
		   System.out.println("Hubo un error en la carga del numero: " + nfe.getMessage());
		} finally {
		   System.out.println("El numero ahora vale " + numero);
		   scanner.close(); 
		   }
	}
}