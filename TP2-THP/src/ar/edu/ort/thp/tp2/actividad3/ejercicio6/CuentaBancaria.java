package ar.edu.ort.thp.tp2.actividad3.ejercicio6;

public class CuentaBancaria {
	private String cbu;
	private TipoCuenta tipo;
	private double saldo;
	private String fechaApertura;
	private Persona titular;

	public CuentaBancaria(TipoCuenta tipo, Persona titular) {
		this.setTipo(tipo);
		this.setTitular(titular);
		this.setFechaApertura();
		this.saldo = 0;
		this.setCbu();
	}
	
	private static String generarCBU() {
		return "ESTO ES UN CBU";
	}

	private static String obtenerFechaDeHoy() {
		return "hoy";
	}

	public void depositar(double importe) {
		if (importe > 0)
			this.saldo += importe;
	}

	public boolean extraer(double importe) {
		boolean pude = false;
		if (importe > 0 && importe <= saldo) {
			this.saldo -= importe;
			pude = true;
		}
		return pude;
	}

	public String getCbu() {
		return cbu;
	}

	public String getFechaApertura() {
		return fechaApertura;
	}

	public TipoCuenta getTipo() {
		return tipo;
	}

	public Persona getTitular() {
		return titular;
	}

	private void setCbu() {
		this.cbu = generarCBU();
	}

	public void setFechaApertura() {
		this.fechaApertura = obtenerFechaDeHoy();
	}

	private void setTipo(TipoCuenta tipo) {
		this.tipo = tipo;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double verSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [cbu=" + cbu + ", tipo=" + tipo + ", saldo=" + saldo + ", fechaApertura=" + fechaApertura
				+ ", titular=" + titular + "]";
	}

}