package ar.edu.ort.tp1.parcial1.clases;

import java.util.ArrayList;

public class Veterinaria implements Mostrable {

	private static final String TXT_INGRESO = "Ingresando a %s a la veterinaria \n";
	private static final String TXT_CANTIDADES = "Han sido ingresados: %d conejos, %d gatos y %d perros\n";
	private String nombre;
	private Doctor doctor;
	private ArrayList<Mascota> mascotas;

	public Veterinaria(String nombre, Doctor doctor) {
		this.setNombre(nombre);
		this.doctor = doctor;
		mascotas = new ArrayList<>();
	}

	public void admitirMascota(Mascota mascota) throws Exception {
		if (mascota.getNombre() == null) {
			throw new Exception("Mascota inexsistente");
		} else {
			mascotas.add(mascota);
		}
	}

	public Mascota buscarMascota(String nombreDeMascota) {
		int i = 0;
		Mascota m = null;

		while (i < mascotas.size() && m != null) {
			if (mascotas.get(i).getNombre().equals(nombreDeMascota)) {
				m = mascotas.get(i);
			}
			i++;
		}
		return m;
	}

	public void vacunar() {
		for (int i = 0; i < mascotas.size(); i++) {
			if (mascotas.get(i).isVacuna()) {
				System.out.println("Mascota vacunada");
			}
		}
	}

	@Override
	public void mostrar() {
		int contPerro = 0;
		int contGato = 0;
		int contConejo = 0;

		for (Mascota m : mascotas) {
			if (m instanceof Gato) {
				contGato++;
			}
			if (m instanceof Perro) {
				contPerro++;
			}
			if (m instanceof Conejo) {
				contConejo++;
			}
		}
		System.out.println("veterinaria: " + getNombre());
		System.out.println("Perros en la veterinaria " + contPerro);
		System.out.println("Gatos en la veterinaria " + contGato);
		System.out.println("Conejos en la veterinaria " + contConejo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
