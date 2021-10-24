package Fpr;

import java.util.Scanner;

public class Ejercicio28 {
	static final Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int cant, max = 0, num, posicion = 0;
		
		System.out.println("Ingrese un numero: ");
		cant = input.nextInt();
		for (int i = 1; i <= cant; i++) {
			System.out.println("Ingrese otro numero: ");
			num = input.nextInt();
			if (num > max) {
				max = num;
				posicion++;
			}
		}
		System.out.println("El numero Mayor: " + max + " y su posicion es: " + posicion);
	}
}
