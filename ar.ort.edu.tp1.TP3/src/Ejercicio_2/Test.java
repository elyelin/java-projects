package Ejercicio_2;

public class Test {

	public static void main(String[] args) {
		Asalariado asa = new Asalariado("Jose", 30, 10000);
		SubContratado subco = new SubContratado("Carlos", 23, 50, 100);
		System.out.println("Asalariado " + asa.getNombre() + " gana: " + asa.calcularPago());
		System.out.println("SubContratado" + subco.getNombre() + " gana: " + subco.calcularPago());

		Vendedor vend = new Vendedor("Pedro", 25, 100, 200, 5);
		System.out.println("Vendedor " + vend.getNombre() + " gana: " + vend.calcularPago());

	}

}
