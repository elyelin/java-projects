package ejercicio1;

public class Anio {
	private static int PRIMERO = 1;
	private static int ULTIMO = 12;
	private String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
			"Octubre", "Noviembre", "Diciembre" };
	private Integer[] dias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public Anio() {

	}

	public String getNombreDelMes(int numeroMes) {
		String mes = "No existe";
		int i = 0;

		/*
		 * if(i < meses.length && meses[i] == null) { System.out.println(mes);
		 * 
		 * }else { System.out.println(mes); return meses[i-1]; }
		 */
		/*
		 * for(int i = 0; i < meses.length; i++) { if(meses[i] != null) {
		 * System.out.println("posicion " + i + " esto me devuelve el contenido " +
		 * meses[i]); } }
		 */

		/*
		 * while (i < meses.length && meses[i] != mes) { i++; } if (i != -1) {
		 * System.out.println("El valor buscado esta en la posicion " + i + " es " +
		 * meses[i]); } else { System.out.println("No esta " + i); }
		 */
		return mes;
	}

	public int diasTranscurridos(int mes) {
		int total = 0;

		if (mes > 0 && mes < 13) {
			total = this.dias[mes - 1];
		} else {
			total = -1;
		}
		return total;
	}

	public int diasTranscurridosalCumpleanios(int numeroMes, int fecha) {
		return this.diasTranscurridos(numeroMes) + fecha;
	}

}
