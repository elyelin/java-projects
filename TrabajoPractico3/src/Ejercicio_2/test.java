package Ejercicio_2;

public class test {

	public static void main(String[] args) {
		Vendedor v1 = new Vendedor("Pedro", 25, 100, 200, 5);
		Vendedor v2 = new Vendedor("Maria", 30, 100, 200, 10);
		v1.calcularPago();
		
		System.out.println(v2.calcularPago());
		System.out.println(v1.mostrar());
		System.out.println(v2.mostrar());
	}

}
