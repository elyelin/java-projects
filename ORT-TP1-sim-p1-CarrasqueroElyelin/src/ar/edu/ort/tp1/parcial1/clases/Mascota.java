package ar.edu.ort.tp1.parcial1.clases;

public abstract class Mascota implements Animal {

	private static final String MSG_COM_FELIZ = " He comido demasiado";
	private static final String MSG_COM_HAMBRIENTO = " Muchas gracias tenía hambre";
	private static final String MSG_COM_ENFERMO = " No tenía mucha hambre, pero gracias";
	private static final int CIEN = 100;
	private String nombre;
	private double peso;
	private boolean vacunado;
	private Estado estado;

	public Mascota(String nombre, double peso, boolean vacunado, Estado estado) {
		this.nombre = nombre;
		this.peso = peso;
		this.vacunado = vacunado;
		this.estado = estado;
	}

	/**
	 * Alimenta a las mascotas de forma general. Si su estado es hambiento estará
	 * feliz y dara las gracias ya que tenía hambre Si su estado es feliz, se
	 * enfermará e indicará que comio demasiado. si estaba enfermo, dara las gracias, pero seguirá enfermo.
	 * además actualizará el peso sumando al actual la multiplicación entre la cantidad de comida recibida y un multiplicador.
	 * Finalmente indicará su estado
	 * 
	 * @param comida
	 * @param multiplicador
	 */
	
	public void comer(double comida, double multiplicador) {
		Estado estado = this.estado;
		
		if(this.estado == Estado.HAMBRIENTO) {
			System.out.println(this.getNombre() + MSG_COM_HAMBRIENTO);
			estado = Estado.FELIZ;
		}else if(this.estado == Estado.FELIZ) {
			System.out.println(this.getNombre() + MSG_COM_FELIZ);
			estado = Estado.ENFERMO;
		}else if(this.estado == Estado.ENFERMO) {
			System.out.println(this.getNombre() + MSG_COM_ENFERMO);
		}
		this.peso += comida*multiplicador;
		System.out.println("El estado de " + this.getNombre() + " es: " + this.getEstado().getDescripcion());
	}
	
	private Estado getEstado() {
		return estado;
	}

	private void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void comer(double comida) {
		
	}
	
	public boolean estaVacunado() {
		boolean vac;
		if(vacunado != true) {
			vac = true;
		}else {
			vac = false;
		}
		return vac;
	}
	
	public void vacunar() {
		vacunado = true;
	}
	public void defecar() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void actualizarPeso(double porcentaje) {
		this.peso += peso * porcentaje / CIEN;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", peso=" + peso + ", vacunado=" + vacunado + ", estado=" + estado.getDescripcion() + "]";
	}
	
	
}
