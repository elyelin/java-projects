package Ejercicio_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner(System.in);
	public static String CONFIRMACION = "S";

	public static void main(String[] args) {
		ArrayList<Electrodomestico> electro = new ArrayList<>();

		Televisor tv = new Televisor("LG", "Revolution", 5638, 180, false, 5000, 45, true);
		Lavarropa lv = new Lavarropa("Samsumg", "Chinasse", 384, 200, false, 150000, 50, true);
		Heladera hl = new Heladera("Xiaomi", "Xtremex", 8734, 150, false, 250000, 40, true);
		Licuadora lc = new Licuadora("Cortex", "Fabulosus", 5434, 150, false, 150000, 100, 5);
		electro.add(lv);
		electro.add(hl);
		electro.add(tv);
		electro.add(lc);

		ofrecerProductos(electro);

	}

	public static void ofrecerProductos(ArrayList<Electrodomestico> electro) {
		int fin = 0;
		int x = 0;
		String confir;
		int sumaP = 0;
		Electrodomestico e = null;
		ArrayList<Electrodomestico> carrito = new ArrayList<>();

		do {
			fin = 0;
			e = null;
			System.out.println("Seleccione el numero del producto deseado (0 para terminar)");
			System.out.println("Lista de productos: ");
			for (int i = 0; i < electro.size(); i++) {
				System.out.println((i + 1) + " " + electro.get(i).mostrarProducto());
			}
			System.out.println("Ingrese el numero de su producto a seleccionar: ");
			fin = input.nextInt();
			input.nextLine();

			while (x < electro.size() && e == null) {
				if (electro.get(x) == electro.get(fin)) {
					e = electro.get(x);
					System.out.println(electro.get(fin - 1).toString());
					System.out.println("¿Confirma su eleccion? ('S' o 'N')");
					confir = input.next().toUpperCase();
					input.nextLine();

					if (confir.equals(CONFIRMACION)) {
						carrito.add(electro.get(fin - 1));
						sumaP += electro.get(fin - 1).getPrecio();
					}
				}
				x++;
			}

		} while (fin != 0);
		input.close();
		System.out.println("Ticket de venta \nArticulos: ");
		for (Electrodomestico el : carrito) {
			System.out.println(el.toString());
		}
		System.out.println("Total: " + sumaP);
	}

}
