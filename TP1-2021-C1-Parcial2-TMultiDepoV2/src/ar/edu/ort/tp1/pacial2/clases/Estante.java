package ar.edu.ort.tp1.pacial2.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ColaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Cola;

public class Estante implements Depositante<Producto, Integer> {

	// TODO Completar
	private Cola<Producto> ubicaciones;
	private int cantidadAlojados;
	private int profundidadEstanteria;

	public Estante(int profundidadEstanteria) {
		this.profundidadEstanteria = profundidadEstanteria;
		this.ubicaciones = new ColaNodos<>();
	}

	/**
	 * Agrega un elemento al estante siempre y cuando haya lugar, sino, deberá
	 * emitir la excepción que corresponda..
	 */
	@Override
	public void depositar(Producto p) throws RuntimeException {
		if (profundidadEstanteria == cantidadAlojados) {
			throw new RuntimeException("No se pueden agregar mas productos a este estante.");
		}
		ubicaciones.add(p);
		cantidadAlojados++;
	}

	/**
	 * Retira el producto de la estantería por su id
	 */
	@Override
	public Producto retirarPorId(Integer id) {
		Producto retorno = null;
		Producto productoAuxiliar;
		Producto centinela = null;

		ubicaciones.add(centinela);
		productoAuxiliar = ubicaciones.remove();
		while (productoAuxiliar != centinela) {

			if (productoAuxiliar.coincideId(id)) {
				retorno = productoAuxiliar;
			} else {
				ubicaciones.add(productoAuxiliar);
			}
			productoAuxiliar = ubicaciones.remove();
		}

		return retorno;
	}

}
