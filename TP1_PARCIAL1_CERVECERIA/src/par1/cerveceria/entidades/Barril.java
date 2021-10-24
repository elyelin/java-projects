package par1.cerveceria.entidades;

public class Barril extends Contenedor {
	public static final int CAPACIDAD = 30000;

	private int capacidad;

	public Barril(Sabor sabor) {
		super(sabor);
		this.setCapacidad(CAPACIDAD);
	}

	@Override
	public boolean estaVacio() {
		boolean vacio = false;
		if (vacio == true) {
			vacio = true;
		} else {
			vacio = false;
		}
		return vacio;
	}

	@Override
	public EnvaseCerveza extraer() {
		EnvaseCerveza barril = null;
		if (CAPACIDAD == 0) {
			barril = null;
		} else {
			barril = null;
		}
		return barril;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int cantidadEntrega(Medida medidas) {
		int entregar = 0;

		switch (medidas) {
		case CHICA:
			entregar += 750;
			break;
		case GRANDE:
			entregar += 3000;
			break;
		case MEDIANA:
			entregar += 1.500;
			break;
		default:
			entregar += 1.500;
			break;
		}
		return entregar;
	}

}
