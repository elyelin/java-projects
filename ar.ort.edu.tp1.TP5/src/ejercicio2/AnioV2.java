package ejercicio2;

public class AnioV2 {
	private MESES[] meses = MESES.values();
	
	public void mostrar() {
	for(int i = 0; i < meses.length; i++) {
		System.out.println(". " + meses[i].toString());
	}
	}
}
