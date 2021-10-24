package ejercicio3;

import java.util.ArrayList;

import ejercicio3.Atleta;

public class Carrera {
	String nombre;
	ArrayList<Atleta> competidores;
	
	public Carrera(String nombre) {
		setNombre(nombre);
		competidores = new ArrayList<Atleta>();
	}

	private void setNombre(String nombre) {
		this.nombre= nombre;
	}
	
	public void ganador(Atleta atleta) {
		double mejorTiempo=9999.999;
		Atleta priPuesto;
		Atleta repetido;
		Atleta segPuesto;
		int i=0;
		while (i<competidores.size()) {
			double a = atleta.getTiempo();
			if(a<mejorTiempo) {
			priPuesto=atleta;
			i++;
			}else {
				if(a==mejorTiempo) {
				repetido=atleta;
				i++;
				}else {
					segPuesto=atleta;
					i++;
			}
		if(priPuesto==repetido) {
			System.out.println("Los mejores puestos fueron "+priPuesto+" ,"+repetido);
		}else {
			System.out.println("Solo hubo un ganador y fue "+priPuesto);
		}
		}
		}
		
		
	}
}

