package ar.edu.ort.thp.tp2.actividad2.ejercicio4;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String color;
	private double velocidadMaxima;
	private boolean encendido;
	private double velocidad;
	private double anguloDeGiro;

	public Vehiculo(String marca, String modelo, String color, double velocidadMaxima) {
		setMarca(marca);
		setModelo(modelo);
		pintar(color);
		setVelocidadMaxima(velocidadMaxima);
	}

	public void acelerar(double kmh) {
		if (kmh > 0) {
			if (velocidad + kmh < velocidadMaxima)
				velocidad += kmh;
			else
				velocidad = velocidadMaxima;
			System.out.println("El vehiculo está acelerando.");
			mostrarVelocidadActual();
		}
	}

	public void apagar() {
		encendido = false;
		System.out.println("El vehiculo se ha apagado");
	}

	public void avanzar() {
		System.out.println("El vehiculo avanza");
	}

	public void encender() {
		encendido = true;
		System.out.println("El vehiculo está en marcha");
	}

	public boolean estaEncendido() {
		return encendido;
	}

	public void frenar(double kmh) {
		if (kmh > 0) {
			if (velocidad - kmh > 0)
				velocidad -= kmh;
			else
				velocidad = 0;
			System.out.println("El vehiculo está frenando.");
			mostrarVelocidadActual();
		}
	}

	public String getColor() {
		return color;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void girar(char lado, double grados) {
		if (grados < 0) {
			grados = 0;
		} else if (grados > 90) {
			grados = 90;
		}
		if (lado == 'I') {
			anguloDeGiro -= grados;
		} else {
			anguloDeGiro += grados;
		}
		anguloDeGiro = anguloDeGiro % 360;
		System.out.println("El vehiculo ha girado. El angulo de giro es " + anguloDeGiro);
	}

	private void mostrarVelocidadActual() {
		System.out.println("La velocidad actual es " + velocidad);
	}

	public void pintar(String color) {
		this.color = color;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	private void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", velocidadMaxima="
				+ velocidadMaxima + "]";
	}

}
