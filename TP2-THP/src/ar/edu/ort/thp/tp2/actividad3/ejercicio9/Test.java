package ar.edu.ort.thp.tp2.actividad3.ejercicio9;

public class Test {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println(a + "+" + b + "=" + Calculadora.sumar(a, b));
		System.out.println(a + "-" + b + "=" + Calculadora.restar(a, b));
		System.out.println(b + "-" + a + "=" + Calculadora.restar(b, a));
		System.out.println(a + "*" + b + "=" + Calculadora.multiplicar(a, b));
		System.out.println(a + "/" + b + "=" + Calculadora.dividir(a, b));
		System.out.println(b + "/" + a + "=" + Calculadora.dividir(b, a));
		System.out.println(a + "/" + 0 + "=" + Calculadora.dividir(a, 0));
		System.out.println(b + "/" + 0 + "=" + Calculadora.dividir(b, 0));
		System.out.println(0 + "/" + a + "=" + Calculadora.dividir(0, a));
		System.out.println(0 + "/" + b + "=" + Calculadora.dividir(0, b));
	}

}
