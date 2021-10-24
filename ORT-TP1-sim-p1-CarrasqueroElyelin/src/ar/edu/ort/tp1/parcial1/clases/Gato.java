package ar.edu.ort.tp1.parcial1.clases;

public class Gato extends Mascota {
	private static final double MULT_ALIMENTACION = 0.033;
	private static final int PORC_DESC_PESO = -1;
	
	public Gato(String nombre, double peso, boolean vacunado, Estado estado) {
		super(nombre, peso, vacunado, estado);
		// TODO Auto-generated constructor stub
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
