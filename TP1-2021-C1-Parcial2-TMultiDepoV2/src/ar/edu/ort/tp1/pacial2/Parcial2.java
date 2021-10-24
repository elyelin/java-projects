package ar.edu.ort.tp1.pacial2;

import ar.edu.ort.tp1.pacial2.clases.Deposito;
import ar.edu.ort.tp1.pacial2.clases.Disco;
import ar.edu.ort.tp1.pacial2.clases.MemoriaRAM;
import ar.edu.ort.tp1.pacial2.clases.MicroProcesador;
import ar.edu.ort.tp1.pacial2.clases.Producto;
import ar.edu.ort.tp1.pacial2.clases.TipoConectorDiscoEnum;

public class Parcial2 {

	private static final int ONCE = 11;
	private static int id = 10;

	public static void main(String[] args) {

		Deposito d = new Deposito(3);

		depositar(d);

		retiros(d);
	}

	private static void retiros(Deposito d) {
		System.out.println("Se comienza a retirar elementos");
		System.out.println();
		retirar(d, 12);
		System.out.println();
		retirar(d, 13);
		System.out.println();
		retirar(d, 28);
		System.out.println();
		System.out.println("Fin del retiro de elementos");
	}

	private static void retirar(Deposito d, int id) {
		Producto p = d.retirarPorId(id);
		if (p != null) {
			System.out.println("Se retiró el producto id: " + id);
			p.mostrar();
		} else {
			System.out.println("No se pudo retirar producto id: " + id);
		}

	}

	private static void depositar(Deposito d) {

		System.out.println("Depositando productos");
		System.out.println();

		depositarDisco(d, id++, "WD", "Green", TipoConectorDiscoEnum.M2, 120);
		System.out.println();
		depositarMemoriaRAM(d, id++, "Kingston", "Value", 4);
		System.out.println();
		depositarMicroProcesador(d, id++, "Intel", "i9", 3.6f);
		System.out.println();
		depositarDisco(d, id++, "Seagate", "Barracuda", TipoConectorDiscoEnum.SATA, 240);
		System.out.println();
		depositarMemoriaRAM(d, 0, "HyperX", "Fury", 105);
		System.out.println();
		depositarDisco(d, id++, "Kingston", "Savage", TipoConectorDiscoEnum.SATA, 240);
		System.out.println();
		depositarMemoriaRAM(d, id++, "HyperX", "Fury RGB", 16);
		System.out.println();
		depositarMicroProcesador(d, id++, "AMD", "Ryzen 5", 3.2f);
		System.out.println();
		depositarDisco(d, id++, "Corsair", "Storage", TipoConectorDiscoEnum.M2, 480);
		System.out.println();
		depositarMemoriaRAM(d, id++, "Corsair", "Vengeance LPX", 8);
		System.out.println();
		depositarMicroProcesador(d, id++, "Intel", "i5", 2.4f);
		System.out.println();
		for (int i = 0; i < ONCE; i++) {
			depositarMicroProcesador(d, id++, "Intel", "i3", 2.0f);
			System.out.println();
		}
		depositarDisco(d, id++, "WD", "Blue", TipoConectorDiscoEnum.SATA, 1000);
		System.out.println();
		System.out.println("Fin de los depositos");
	}

	private static void depositarDisco(Deposito d, int id, String marca, String modelo,
			TipoConectorDiscoEnum tipoConector, int capacidad) {
		try {
			d.depositar(new Disco(id, marca, modelo, tipoConector, capacidad));
			System.out.println("Disco depositado id: " + id);
		} catch (RuntimeException e) {
			System.out.println("Error depositando disco: " + e.getMessage());
		}
	}

	private static void depositarMemoriaRAM(Deposito d, int id, String marca, String modelo, int capacidad) {
		try {
			d.depositar(new MemoriaRAM(id, marca, modelo, capacidad));
			System.out.println("Memoria RAM depositada id: " + id);
		} catch (RuntimeException e) {
			System.out.println("Error depositando Memoria RAM: " + e.getMessage());
		}
	}

	private static void depositarMicroProcesador(Deposito d, int id, String marca, String modelo, float frecuenciaBase) {
		try {
			d.depositar(new MicroProcesador(id, marca, modelo, frecuenciaBase));
			System.out.println("Micro Procesador depositado id: " + id);
		} catch (RuntimeException e) {
			System.out.println("Error depositando Micro Procesador: " + e.getMessage());
		}
	}

}
