package ejercicio1;

public class test {

	public static void main(String[] args) {
		Anio a = new Anio();
		
		a.getNombreDelMes(1);
	}

}
/*
 * ejercicio 2
public void getNumeroMes(String nombreMes){
int i = 0;
boolean buscado = false;
while(i<MESES.values().length && !buscado){
	if (MESES.values()[i].name().equals(nombreMes)){
		System.out.println("El mes buscado es el nro: " + i);
		buscado = true;
	}else{
		i++;
	}
}
}
*/