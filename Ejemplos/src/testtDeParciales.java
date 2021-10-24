import java.util.Scanner;

public class testtDeParciales {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int tiempo, dia = 0, suma = 0, promedio = 0;
		boolean es = false;
		/*do {
			do {
				System.out.println("Cantidad de tiempo");
			tiempo = input.nextInt();
			} while (tiempo < 0 || tiempo > 100);
			dia++;
			suma += tiempo;
		} while (tiempo < 20 && dia < 10);
		promedio = tiempo / dia;
		if (tiempo < 15) {
			if (promedio <= 18) {
				es = true;
			}
		}
		System.out.println(promedio + " " + es);*/
		do {
			System.out.println("Cantidad de tiempo");
		tiempo = input.nextInt();
		} while (tiempo < 1 || tiempo > 5);
String		OPCION_1 = "HOLA", OPCION_2 = "COMO", OPCION_3 = "ESTAS";
		for (int i = 1; i <= tiempo; i++) {
			System.out.println("selecciona una opcion para jugar (" + OPCION_1 + ", " + OPCION_2 + " o " + OPCION_3 + "): ");
		}
}
}
