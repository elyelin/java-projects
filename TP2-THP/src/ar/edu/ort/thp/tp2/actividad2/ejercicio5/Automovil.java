package ar.edu.ort.thp.tp2.actividad2.ejercicio5;

public class Automovil {
	private static final double LIMITE_POCO_COMBUSTIBLE = .15;
	private String marca;
	private String modelo;
	private String patente;
	private double capacidadTanque;
	private double cantidadDeCombustible;
	/* indica cuantos kilometros recorre con un litro de combustible */
	private double rendimientoPorLitro;

	public Automovil(String marca, String modelo, String patente, double capacidadTanque) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPatente(patente);
		this.setCapacidadTanque(capacidadTanque);
		this.setCantidadDeCombustible(0);
		this.setRendimientoPorLitro(0);
	}

	// recibe la cantidad de kilómetros que se quiere recorrer y devuelve un
	// double indicando los litros de combustible necesarios según los
	// kilómetros requeridos.
	private double calcularConsumo(double cantKm) {
		return cantKm / rendimientoPorLitro;
	}

	// recibe la cantidad de litros que quiere consumir y devuelve un double
	// indicando los kilómetros que puede recorrer.
	private double calcularDistancia(double litros) {
		return litros * rendimientoPorLitro;
	}

	/**
	 * @param litros
	 *            la cantidad que se quiere cargar, que nunca debe ser menor o
	 *            igual que cero o mayor al espacio disponible.
	 * @return true o false dependiendo del éxito de la acción
	 */
	public boolean cargarCombustible(double litros) {
		boolean cantidadAceptable = litros > 0 && litros <= espacioDisponible();
		if (cantidadAceptable)
			cantidadDeCombustible += litros;
		return cantidadAceptable;
	}

	/**
	 * Simula el consumo de combustible restándolo al disponible en el tanque.
	 * 
	 * @param litros
	 *            La cantidad de litros que se quiere consumir.
	 * @return Los litros faltantes si es que no le alcanza, o cero.
	 */
	private double consumirCombustible(double litros) {
		double faltante;
		if (litros <= cantidadDeCombustible) {
			faltante = 0;
			cantidadDeCombustible -= litros;
		} else {
			faltante = litros - cantidadDeCombustible;
			cantidadDeCombustible = 0;
		};
		return faltante;
	}

	/**
	 * Indica cuánto combustible se puede cargar en el tanque a partir de la
	 * diferencia entre el tamaño del tanque y los litros de combustible
	 * almacenados
	 * 
	 * @return la cantidad de litros que se pueden cargar.
	 */
	private double espacioDisponible() {
		return capacidadTanque - cantidadDeCombustible;
	}

	public double getCantidadDeCombustible() {
		return cantidadDeCombustible;
	}

	public double getCapacidadTanque() {
		return capacidadTanque;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getPatente() {
		return patente;
	}

	public double getRendimientoPorLitro() {
		return rendimientoPorLitro;
	}

	/**
	 * Indica si hay poco combustible en el tanque.
	 * 
	 * @return verdadero siempre que la cantidad de combustible sea menor al
	 *         quince porciento de la capacidad del tanque.
	 */
	public boolean pocoCombustible() {
		return cantidadDeCombustible / capacidadTanque < LIMITE_POCO_COMBUSTIBLE;
	}

	private void setCantidadDeCombustible(double cantidadDeCombustible) {
		this.cantidadDeCombustible = cantidadDeCombustible;
	}

	private void setCapacidadTanque(double capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public void setRendimientoPorLitro(double rendimientoPorLitro) {
		this.rendimientoPorLitro = rendimientoPorLitro;
	}

	/**
	 * Simula el viaje, traduciendo los km de viaje en consumo de conbustible y
	 * kilómetros viajados efectivamente.
	 * 
	 * @param km
	 *            recibe la cantidad de kilómetros que desea recorrer
	 * @return la cantidad de kilómetros que efectivamente se realizaron con el
	 *         combustible existente en el tanque.
	 */
	public double viajar(double km) {
		// Cuantos litros deberia consumir para los km que deseo viajar?
		double litrosAConsumir = calcularConsumo(km);
		// Consumo el combustible requerido, obtengo el faltante
		double faltantes = consumirCombustible(litrosAConsumir);
		// Traduzco el combustible usado a kms.
		double recorridoEfectivo = calcularDistancia(litrosAConsumir - faltantes);
		// devuelvo el recorrido efectivo.
		return recorridoEfectivo;
	}
}
