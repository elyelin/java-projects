package par1.cerveceria.entidades;

public class Cajon extends Contenedor{
	public static final int BOTELLAS = 12;
	private int botellas;
	
	public Cajon(Sabor sabor) {
		super(sabor);
		this.setBotellas(BOTELLAS);
	}

	@Override
	protected EnvaseCerveza extraer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean estaVacio() {
		
		return false;
	}

	public int getBotellas() {
		return botellas;
	}

	public void setBotellas(int botellas) {
		this.botellas = botellas;
	}

	@Override
	public String toString() {
		return "Cajon [botellas=" + botellas + "]";
	}

}
