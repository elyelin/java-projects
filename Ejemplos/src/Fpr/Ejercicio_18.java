package Fpr;

import java.util.Scanner;

public class Ejercicio_18 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1, num2, result, numMayor, numMenor;
		/*System.out.println("ingresa dos numero: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1 > num2) {
			numMayor = num1;
			numMenor = num2;
		}else {
			numMayor = num2;
			numMenor = num1;
		}
		
		result = numMayor % numMenor;
		
		System.out.println(result);*/
		
		System.out.println("ingresa dos numero: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		/*if(num1 <= num2) {
		for(int i = num1; i <= num2; i++) {
			System.out.println(i);
		}	
		}*/
		if(num1 > num2) {
			numMayor = num1;
			numMenor = num2;
		}else {
			numMayor = num2;
			numMenor = num1;
		}
		result = numMayor % numMenor;
		System.out.println("El mayor es divisble y el resultado es: " + result);
		
		
		
		
		/*switch(num1) {
		case 1: 
			System.out.println("Domigno");
			break;
		case 2: 
			System.out.println("Lunes");
			break;
		case 3: 
			System.out.println("Martes");
			break;
		default:
			System.out.println("Error");
		}
		boolean ana = true;
		System.out.println("Sea bienvenido " + num1 + " " + ana);
		*/

		input.close();

	}

}
