package ar.edu.ort.thp.tp2.actividad3.ejercicio6;

public class Test {

	public static void main(String[] args) {
		Domicilio domicilioComun = new Domicilio("Yatay", 240, "Almagro");

		CuentaBancaria c1 = new CuentaBancaria(TipoCuenta.CAJA_DE_AHORRO,
				new Persona(12345678, "Fulano", "Gomez", "2000/01/01", domicilioComun));
		
		System.out.println(c1);

		CuentaBancaria c2 = new CuentaBancaria(TipoCuenta.CAJA_DE_AHORRO,
				new Persona(90123456, "Mengana", "Torres", "1999/10/20", domicilioComun));
		
		System.out.println(c2);
	}

}
