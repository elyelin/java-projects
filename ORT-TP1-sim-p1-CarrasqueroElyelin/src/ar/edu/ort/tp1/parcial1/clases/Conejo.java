package ar.edu.ort.tp1.parcial1.clases;

public class Conejo extends Mascota {
	private static final double MULT_ALIMENTACION = 0.022;
	private static final double PORC_DESC_PESO = -2;
	
	public Conejo(String nombre, double peso, boolean vacunado, Estado estado) {
		super(nombre, peso, vacunado, estado);
	}
	
	@Override
	public void comer(double comida) {
		super.comer(comida, MULT_ALIMENTACION);
		
	}
	@Override
	public void defecar() {
		System.out.println("Ya fui al ba�o, recoje mi regalito");
		super.actualizarPeso(PORC_DESC_PESO);
	}

	//TODO Completar

}
