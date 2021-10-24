package Final;

public class Ascensor {
	private static int PLANTA_BAJA = 0;
	private int numIdentificador;
	private int pisoParado;
	private Modo modo;
	
	public Ascensor() {
	}

	public Ascensor(int num) {
		this.numIdentificador = num;
		this.pisoParado = PLANTA_BAJA;
		setModoSegunNumeroDeAscensor();
	}

	public int getNumIdentificador() {
		return numIdentificador;
	}

	public void setNumIdentificador(int numIdentificador) {
		this.numIdentificador = numIdentificador;
	}
	public int getPisoParado() {
		return pisoParado;
	}
	public void setPisoParado(int pisoParado) {
		this.pisoParado = pisoParado;
	}
	public Modo getModo() {
		return modo;
	}
	
	public void setModoSegunNumeroDeAscensor() {
		if(this.numIdentificador % 2 != 0) {
			this.modo = Modo.SOLO_IMPARES;
		}else {
			this.modo = Modo.SOLO_PARES;
		}
	}
	
	/*public boolean puedoParar(int piso) {
		boolean siPudo = false;
		if(this.pisoParado <= piso || this.pisoParado >= piso) {
			if(this.modo == Modo.SOLO_PARES) {
				siPudo = true;
			}if(this.modo == Modo.SOLO_IMPARES) {
				siPudo = true;
			}
		}
		return siPudo;
	}*/
	public boolean puedoParar(int piso) {
		boolean siPudo = false;
		
		if(this.pisoParado <= piso || this.pisoParado >= piso) {
			siPudo = true;
		}
		return siPudo;
	}
	
	public void numAscensor() {
		System.out.println("ASCENSOR " + this.numIdentificador);
	}
}
