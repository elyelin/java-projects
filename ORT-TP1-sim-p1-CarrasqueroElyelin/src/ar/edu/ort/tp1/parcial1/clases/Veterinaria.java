package ar.edu.ort.tp1.parcial1.clases;

import java.util.ArrayList;

//import ej2.Persona.Mascota;

public class Veterinaria implements Mostrable {

	private static final String TXT_INGRESO = "Ingresando a la veterinaria a: ";
	private static final String TXT_CANTIDADES = "Han sido ingresados: ";
	private ArrayList<Mascota> mascotas;
	private String nombre;
	private Doctor doctor;

	public Veterinaria(String nombre, Doctor doctor) {
		this.nombre = nombre;
		this.doctor = doctor;
		this.mascotas = new ArrayList<Mascota>();
	}

	public void admitirMascota(Mascota mascota) {
		System.out.println(TXT_INGRESO + mascota.getNombre());
		mascotas.add(mascota);
	}

	public Mascota buscarMascota(String nombreDeMascota) {
		Mascota m = null;
		int i = 0;
		while(m == null && i < mascotas.size()) {
			if(mascotas.get(i).getNombre().equals(nombreDeMascota)) {
				m = mascotas.get(i);
			}
			i++;
		}
		return m;
		
	}

	public void vacunar() {
		int aplicadas = 0;
		for (int i = 0; i < mascotas.size(); i++) {
			if(!mascotas.get(i).estaVacunado()) {
				mascotas.get(i).vacunar();
				aplicadas++;
			}
		}
		System.out.println("Vacunas aplicadas: " + aplicadas);
		
	}
	
	@Override
	public void mostrar() {
		 System.out.println("Veterinaria: " + this.nombre);
		 System.out.println("Doctor de turno: " + this.doctor.getNombre());
		 
		 int perros = 0;
		 int gatos = 0;
		 int conejos = 0;
		 for(int i = 0; i < mascotas.size(); i++) {
			 if(mascotas.get(i) instanceof Perro) {
				 perros++;
			 }else {
				 if(mascotas.get(i) instanceof Gato) {
					 gatos++;
				 }else {
					 conejos++;
				 }
			 }
		 }
				 
		System.out.println("Han ingresado: " + conejos + " conejos, " + gatos + " gatos, " + perros + " perros");
	}

}
