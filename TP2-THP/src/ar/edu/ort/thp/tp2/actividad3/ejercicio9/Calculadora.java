package ar.edu.ort.thp.tp2.actividad3.ejercicio9;

public class Calculadora {

	/**
	 * Resuelve la suma de dos números
	 * 
	 * @param numero1
	 * @param numero2
	 * @return El resultado de la operación
	 */
	public static int sumar(int numero1, int numero2) {
		return numero1 + numero2;
	}

	/**
	 * Resuelve la resta entre dos números
	 * 
	 * @param numero1
	 * @param numero2
	 * @return El resultado de la operación
	 */
	public static int restar(int numero1, int numero2) {
		return numero1 - numero2;
	}

	/**
	 * Resuelve el producto entre dos números
	 * 
	 * @param numero1
	 * @param numero2
	 * @return El resultado de la operación
	 */
	public static int multiplicar(int numero1, int numero2) {
		return numero1 * numero2;
	}

	/**
	 * Si puede, Resuelve la división entre dos números. Si el divisor es 0, no
	 * realiza la división y devuelve 0.
	 * 
	 * @param numero1
	 * @param numero2
	 * @return El resultado de la operación o 0 (cero) cuando la división no es
	 *         posible.
	 */
	public static int dividir(int numero1, int numero2) {
		if (numero2 != 0) {
			return numero1 / numero2;
		} else {
			return 0;
		}
	}

}
