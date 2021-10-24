package Ejercicio_1;

public class test {

	public static void main(String[] args) {
		Asalariado a = new Asalariado("Jose", 30, 10000);
		Subcontratado s = new Subcontratado("Carlos", 23, 50, 100);
		
		System.out.println(s.mostrar());
		System.out.println(a.mostrar());
	}

}
