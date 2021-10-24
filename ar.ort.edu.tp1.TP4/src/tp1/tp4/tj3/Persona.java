package tp1.tp4.tj3;

import java.time.Year;

public class Persona {
	
	private int anioNacimiento;
	private int anioFallecimiento;
	
	public Persona(int anioNacimiento, int anioFallecimiento){
		this.anioNacimiento = anioNacimiento;
		this.anioFallecimiento = anioFallecimiento;
	}

	public boolean vive(){
		return anioFallecimiento == Ej3.VALOR_DE_FIN_DE_CARGA;
	}	
	
	public int calcularEdad(){
		return vive() ? Year.now().getValue() - anioNacimiento : anioFallecimiento - anioNacimiento;
	}
}
