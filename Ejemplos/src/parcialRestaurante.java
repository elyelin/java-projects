import java.util.Scanner;

public class parcialRestaurante {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String medioPago, pago = "";
		int cantP = 0, cantC = 0, costo, contC = 0, reCo, mayorC = -99999999;
		int conR;
		double prome;
		final String PAGO1 = "EFE";
		final String PAGO2 = "DEB";
		final String PAGO3 = "CRE";
		
		for (int i = 1; i < 15; i++) {
			do {
				System.out.println("Comensales");
				cantP = input.nextInt();
			} while (cantP < 1 || cantP > 4);

			contC += cantP;
			costo = cantP * 1200;

			// while ((!medioPago.equals("EFE")) && (!medioPago.equals("DEB")) &&
			// (!medioPago.equals("CRE"))) {
			do {
				System.out.println("Medio de pago");
				medioPago = input.nextLine().toUpperCase();
			} while ((!medioPago.equals(PAGO1)) && (!medioPago.equals(PAGO2)) && (!medioPago.equals(PAGO3)));

			if (medioPago.equals(PAGO3)) {
				do {
					System.out.println("Cantidad de cuotas (Entero entre 1 y 12)");
					cantC = input.nextInt();
				} while (cantC < 1 || cantC > 12);
			}

			if (costo > mayorC) {
				switch (medioPago) {
				case PAGO1:
					pago = PAGO1;
					mayorC = costo;
					break;
				case PAGO2:
					conR = (int) (costo + (costo * 0.5));
					pago = PAGO2;
					mayorC = conR;
					break;
				case PAGO3:
					pago = PAGO3;
					mayorC = costo;
					break;
				}
			}
		}
		prome = contC / cantP;
		System.out.println("Mayor costo registrado: " + mayorC + " medio de pago " + pago);
		System.out.println("Promedio comensales: " + prome);

	}

}