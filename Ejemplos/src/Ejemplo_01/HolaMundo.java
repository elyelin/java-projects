package Ejemplo_01;

import java.util.ArrayList;
import java.util.Scanner;

public class HolaMundo {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
				
		Persona p1 = new Persona("Nacho", 26);
		p1.setNombre("Uriel");
		
		ArrayList<Persona> lPersonas = new ArrayList<>();
		System.out.println("Tamaño de la lista: "+ lPersonas.size());
		System.out.println("Agrego objetos a la lista");
		lPersonas.add(p1);
		lPersonas.add(p1);
		lPersonas.add(p1);
		lPersonas.add(p1);
		lPersonas.add(p1);
		//Persona p2 = new Persona("Maxi", 22);-->PODEMOS AHORRARNOS ESTE PASO CREANDO AL MISMO TIEMPO QUE LO AGREGAMOS
		lPersonas.add(new Persona("Maxi", 22));
		lPersonas.add(new Persona("Fabian", 45));
		lPersonas.add(new Persona("Diego", 35));

		for(Persona p: lPersonas){
			System.out.println(p.toString());
		}
		System.out.println("---------------");
		System.out.println("Agrego a la prof. Melody en la posición 2");
		
		//AGREGO EN UNA POSICION ESPECIFICA
		lPersonas.add(2, new Persona("Melody", 29));
		
		//RECORRO CON UN FOREACH
		for(Persona p: lPersonas){
			System.out.println(p.toString());
		}
		System.out.println("Tamaño actual de la lista: "+ lPersonas.size());
		//Mostrar la persona que esta en la cuarta posicion
		//Como el indice empieza en 0, la cuarta posicion es la N°3
		Persona p2 = lPersonas.get(3);
		//El metodo get devuelve un elemento de la lista pero no lo borra de la misma
		
		System.out.println("Tamaño actual de la lista (v2): "+ lPersonas.size());
		
		System.out.println("Persona de la cuarta posicion: " + p2.toString());
		
		//Persona p3 = lPersonas.get(176);
		//boolean elimina = lPersonas.remove(p2);
		//System.out.println("Tamaño actual de la lista (v3): "+ lPersonas.size());
		//System.out.println("Elimina: "+ elimina);
		
		/*
		Persona p4 = new Persona("Norberto", 55);
		System.out.println("Pude eliminar a Norberto?" + lPersonas.remove(p4));
		*/
		boolean elimina;
		System.out.println("---------------");
		System.out.println("Elimino a p1 con el metodo remove.");
		//Se elimina el primer elemento p1 que encuentre en la lista
		elimina = lPersonas.remove(p1);
		
		System.out.println("Tamaño actual de la lista (v4): "+ lPersonas.size());
		System.out.println("---------------");
		System.out.println("Cambio el nombre al objeto p1");
		/* como la referencia a memoria es una sola, va a impactar a todos los objetos p1 
		 * que aparezcan en la lista
		 */
		p1.setNombre("Laura");
		
		for(Persona p: lPersonas){
			System.out.println(p.toString());
		}
		
		/*Recorrido de la lista con un for
		Persona p6;
		for(int i = 0; i < lPersonas.size(); i++){
			p6 = lPersonas.get(i);
			System.out.println(p6.toString());
			//Es lo mismo que la linea de arriba: System.out.println(lPersonas.get(i).toString());
		}
		*/
		boolean encontre = false;
		int j = 0;
		Persona p7;
		
		//mientras que no llegue al final de la lista y no haya encontrado el profesor "Maxi", 
		//tengo que recorrer
		while(j < lPersonas.size() && !encontre){
			p7 = lPersonas.get(j);
			if (p7.getNombre().equals("Maxi")){
				encontre = true;
			}
			j++;
		}		
		if(encontre){
			System.out.println("Encontre al profesor buscado en la posicion: "  + (j-1));
		}else{
			System.out.println("No encontre al profesor buscado");
		}
		
		System.out.println("---------------");
		System.out.println("Vacio la lista usando el método clear");
		lPersonas.clear();
		System.out.println("Tamaño actual de la lista (v5): "+ lPersonas.size());
		
		Propiedad prop = new Propiedad("Av klko", "Barrio");
		p1.agregarPropiedad(prop);
		p1.mostrarPropiedades();
		prop.setTipoPropiedad("Carro");
		p1.mostrarPropiedades();
		
		input.close();
	}	
}
