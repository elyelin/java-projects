package Ejercicio_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int opcion;
		String confirmacion;
		boolean fin = false;
		ArrayList<Electrodomestico> carrito = new ArrayList<>(); 
		ArrayList<Electrodomestico> productos = new ArrayList<>();
		productos.add(new Heladera("Heladera", "Hawei", "TPRC", 5004, 24, false, 100000, 25, true));
		productos.add(new Televisor("Televisor", "Sansumg", "JwT", 1457, 10, false, 90000, 45, true));
		productos.add(new Licuadora("Licuadora", "Kash", "JVWQ", 7956, 10, false, 15000, 10, 5));
		productos.add(new Lavarropa("Lavarropa", "xiaomi", "JPN", 89317, 15, false, 70000, 30, true));
		//Electrodomestico lave = new Lavarropa();
	
		do {
			System.out.println("Seleccione el numero del producto deseado (0 para terminar)");
			for(int i=0; i<productos.size(); i++) {
				System.out.println((i+1) + ") Tipo: " + productos.get(i).getTipo() + productos.get(i).getMarca() + " " + productos.get(i).getModelo());
			}
			opcion = input.nextInt();
			input.nextLine();
			
			if(opcion == 0) {
				fin = true;
			}else {
				System.out.println(productos.get(opcion-1).toString());
				System.out.println("¿Confirma la seleccion del producto? (S para si)");
				confirmacion = input.nextLine();
				if(confirmacion.equals("S")) {
				carrito.add(productos.get(opcion-1));
			}
		}
	}while(!fin);
		input.close();
	}
	}