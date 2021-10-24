package ar.edu.ort.thp.tp2.actividad3.ejercicio8;

public class Test {

	public static void main(String[] args) {
		System.out.println("Saco un turno");
		int turno = Turnera.otorgarProximoNumero();
		System.out.println("devolvio el Turno->" + turno);
		Turnera.verUltimoNumeroOtorgado();
		System.out.println("Reseteamos el contador (por defecto en 0)");
		Turnera.resetearContador();
		Turnera.verUltimoNumeroOtorgado();
		System.out.println("Saco un turno");
		turno = Turnera.otorgarProximoNumero();
		Turnera.verUltimoNumeroOtorgado();
		System.out.println("Turno->" + turno);
		System.out.println("Reseteamos el contador a 100");
		Turnera.resetearContador(100);
		Turnera.verUltimoNumeroOtorgado();
		System.out.println("Saco un turno");
		turno = Turnera.otorgarProximoNumero();
		System.out.println("Turno->" + turno);
		Turnera.verUltimoNumeroOtorgado();
	}

}
