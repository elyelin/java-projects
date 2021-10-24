package unidad2EjercicioProfe;

import java.util.ArrayList;
import java.util.Scanner;

public class HolaMundo {
	public static void main(String[] args) {
				
		Persona p1 = new Persona("Uriel", 26);	
		
		//Creo un objeto Propiedad
		Propiedad prop = new Propiedad("Av. Kentucky", "Barrio");
		
		//Le paso el objeto prop a la Persona p1
		p1.agregarPropiedad(prop);
		
		p1.mostrarPropiedades();
		
		//Modifico las caracteristicas de la propiedad que actualmente posee p1. 
		//Como la relacion entre persona y propiedad es de agregacion, puedo modificarla
		prop.setNombre("Av. Connecticut");
		prop.setTipoPropiedad("Ferrocarril");
		
		
		p1.mostrarPropiedades();
		
		//Como la relacion entre Titulo y Persona es de composicion, esto no se puede hacer
		//Titulo t = new Titulo("Analista de Sistemas");
		//p1.agregarTitulo(t);
		
		//Le paso a la persona las caracteristicas del Titulo para que la instancie el objeto
		//y lo agregue a su coleccion de titulos
		p1.agregarTitulo("Analista de Sistemas");
		
		//Si hago esto, rompo la relacion de composicion
		//Titulo t = p1.getPrimerTitulo();
		p1.agregarTitulo("Cheff");
		
		//De esta forma puedo ver los titulos de la persona
		p1.mostrarTitulos();
		
		//Como la clase TituloComp esta creada dentro de la clase Persona, esto no lo puedo hacer, 
		//ya que ninguna otra clase ademas de Persona conoce a TituloComp
		//TituloComposicion t = p1.getPrimerTituloComp();
	}	
}