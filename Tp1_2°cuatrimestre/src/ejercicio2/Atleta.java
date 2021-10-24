package ejercicio2;

public class Atleta {
	private String nombre;
	private double tiempo;
	
	public Atleta(String nombre, double tiempo) {
		setNombre(nombre);
		setTiempo(tiempo);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public double getTiempo() {
		return this.tiempo;
	}

	private void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

}


/*Para los Juegos Olímpicos de la Juventud nos pidieron un programa con el cual podamos
calcular quién fue el ganador de una carrera. Para eso ingresaremos un atleta y los
segundos que ha empleado (con decimales) para recorrer la distancia de una especialidad
determinada. Se debe tener en cuenta que puede haber más de un ganador (sus tiempos
empleados fueron los mismos).*/