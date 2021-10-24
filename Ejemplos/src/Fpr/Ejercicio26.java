package Fpr;

public class Ejercicio26 {

	public static void main(String[] args) {
		int num = 10;
		int multi;
		for(int i = 0; i <= num; i++) {
			multi = i * 3;
			if((multi % 3 == 0) != (multi % 5 == 0)) {
					System.out.println(multi);
			}
		}
	}

}
