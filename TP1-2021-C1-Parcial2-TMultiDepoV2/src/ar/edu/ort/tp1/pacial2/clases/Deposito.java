package ar.edu.ort.tp1.pacial2.clases;

import ar.edu.ort.tp1.tdas.interfaces.ListaOrdenada;

public class Deposito implements Depositante<Producto, Integer> {

	private static final String MSG_TIPO_PROD_INVALIDO = "Tipo de producto inválido";
	private static final String MSG_NO_PUDO_DEPOSITAR = "No se pudo depositar el producto.";
	private static final String MSG_PROF_INVALIDO = "Profundidad de estantería inválido";
	private static final int ALTO_ESTANTERIA = 3;
	private static final int ANCHO_ESTANTERIA = 4;
	private static final int PROFUNDIDAD_ESTANTERIA_MAX = 10;
	private static final int PROFUNDIDAD_ESTANTERIA_MIN = 2;
	private static final int FILA_MICROPROCESADOR = 0;
	private static final int FILA_MEMORIA_RAM = 1;
	private static final int FILA_MEDIO_ALMACENAMIENTO_MASIVO = 2;

	// TODO Completar
	private Estante[][] estanteria;
	private ListaOrdenada<Integer, Producto> productosDepositados;

	// TODO Completar
	public Deposito(int profundidadEstanteria) {
		inicializarEstanteria(profundidadEstanteria);
		this.productosDepositados = new ListaOrdenadaProductosPorId();
	}

	// TODO Completar
	private void inicializarEstanteria(int profundidadEstanteria) {
		if (profundidadEstanteria > PROFUNDIDAD_ESTANTERIA_MAX || profundidadEstanteria < PROFUNDIDAD_ESTANTERIA_MIN) {
			throw new IllegalArgumentException(MSG_PROF_INVALIDO);
		}
		estanteria = new Estante[ALTO_ESTANTERIA][ANCHO_ESTANTERIA];
		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[i].length; j++) {
				estanteria[i][j] = new Estante(profundidadEstanteria);
			}
		}
	}

	// TODO Completar
	/**
	 * Deposita el producto recibido en la estantería, en la fila que le corresponde
	 * según su producto, en el el primer estante que tenga lugar.
	 */
	@Override
	public void depositar(Producto p) throws RuntimeException {

		int fila = calcularFila(p);
		int idxColumna = 0;
		boolean depositado = false;

		do {
			try {
				estanteria[fila][idxColumna].depositar(p);
				depositado = true;
				this.productosDepositados.add(p);
			} catch (RuntimeException e) {
				idxColumna++;
			}
		} while (idxColumna < estanteria[fila].length && !depositado);

		if (!depositado) {
			throw new RuntimeException(MSG_NO_PUDO_DEPOSITAR);
		}
	}

	// TODO Completar
	/**
	 * Verifica en que fila debe ponerse el producto en base a su tipo.
	 * @param p
	 * @return
	 */
	private int calcularFila(Producto p) {
		int fila;
		if (p instanceof Disco) {
			fila = FILA_MICROPROCESADOR;
		} else if (p instanceof MemoriaRAM) {
			fila = FILA_MEMORIA_RAM;
		} else if (p instanceof MicroProcesador) {
			fila = FILA_MEDIO_ALMACENAMIENTO_MASIVO;
		} else {
			throw new RuntimeException(MSG_TIPO_PROD_INVALIDO);
		}
		return fila;
	}

	// TODO Completar
	/**
	 * Indica si un producto se encuentra depositado
	 * @param idProducto
	 * @return
	 */
	public boolean productoDepositado(int idProducto) {
		return this.productosDepositados.exists(idProducto);
	}

	// TODO Completar
	/**
	 * Retira un producto en base a su ID
	 */
	@Override
	public Producto retirarPorId(Integer id) {
		Producto p = this.productosDepositados.removeByKey(id);
		if (p != null) {
			sacarDeLaEstanteria(p);
		}
		return p;
	}

	/**
	 * Saca el producto de la estantería
	 * @param p
	 */
	private void sacarDeLaEstanteria(Producto p) {
		// TODO Completar
		int fila = calcularFila(p);
		int idxColumna = 0;
		boolean retirado = false;
		while (!retirado && idxColumna < this.estanteria[fila].length) {
			if (estanteria[fila][idxColumna].retirarPorId(p.getId()) != null) {
				retirado = true;
			}
			idxColumna++;
		}
	}
}
