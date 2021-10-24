package Ejercicio_4;

public class Licuadora extends Electrodomestico {
	private int potencia;
	private int velocidades;

	public Licuadora(String marca, String modelo, int numeroSerie, int voltaje, boolean estado, int precio,
			int potencia, int velocidades) {
		super(marca, modelo, numeroSerie, voltaje, estado, precio);
		this.potencia = potencia;
		this.velocidades = velocidades;
	}

	@Override
	public String toString() {
		return "Licuadora [potencia=" + potencia + ", velocidades=" + velocidades + super.toString() + "]";
	}

	@Override
	public String mostrarProducto() {
		return getTipo() + " " + getMarca() + ", modelo " + getModelo();
	}

	@Override
	public String getTipo() {
		return "Licuadora";
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub

	}

}
