package Ejercicio_1;

public class Anio {
	private String[] nombreMes;
	private Integer[] cantidadDiasMes;

	public Anio() {
		this.nombreMes = new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" };
		this.cantidadDiasMes = new Integer[] { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };
		// { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	}

	public String getNombreDelMes(int mes) {
		String resultado = "No existe";
		if (mes > 0 && mes < 13) {
			resultado = nombreMes[mes - 1];
		}
		return resultado;
	}

	public int diasTranscurridos(int mes) {
		int total = 0;

		if (mes > 0 && mes < 13) {
			total = this.cantidadDiasMes[mes - 1];
		} else {
			total = -1;
		}
		return total;
	}

	public int diasTranscurridosalCumpleanios(int numeroMes, int fecha) {
		return this.diasTranscurridos(numeroMes) + fecha;
	}
}
