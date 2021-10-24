
public enum DiasMes {
	ENERO(31), FEBRERO(28), MARZO(30);

	private int dias;

	DiasMes(int dias) {
		this.dias = dias;
	}

	public int getDias() {
		return this.dias;
	}

}
