package Ejercicio_1;

public class Test {

	public static void main(String[] args) {
		Anio anio = new Anio();

		System.out.println(anio.getNombreDelMes(1));
		System.out.println(anio.getNombreDelMes(-100));

		System.out.println(anio.diasTranscurridos(1));
		System.out.println(anio.diasTranscurridos(-100));
		System.out.println(anio.diasTranscurridos(15));

		System.out.println(anio.diasTranscurridosalCumpleanios(1, 18));
		System.out.println(anio.diasTranscurridosalCumpleanios(2, 20));

	}

}
