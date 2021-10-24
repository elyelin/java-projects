package ar.edu.ort.tp1.tp6Ej4.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ColaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Cola;

public class CompaniaDeTransportes {
	private static int ultimoLegajo = 0;

	private ListaChoferes staff;
	private ListaVehiculos flota;
	private Cola<Vehiculo> viajesListos;

	// 1 - Crear las estructuras propuestas
	public CompaniaDeTransportes() {
		// TODO
		staff = new ListaChoferes();
		flota = new ListaVehiculos();
		viajesListos = new ColaNodos<>();
	}

	public void altaChofer(int dni, String nombre) {
		Chofer chofer = staff.search(dni);
		if (chofer != null) {
			throw new RuntimeException("Chofer existente!");
		}
		staff.add(new Chofer(dni, proximoLegajo(), nombre));
	}

	public Chofer bajaChofer(int dni) {
		Chofer chofer = staff.search(dni);
		if (chofer != null) {
			if (chofer.getVehiculo() == null)
				staff.remove(chofer);
			else
				throw new RuntimeException("No se puede despedir a un chofer en viaje!");
		}
		return chofer;
	}

	public void altaVehiculo(String patente, TipoVehiculo tipoVehiculo, double capacidadDeCarga) {
		Vehiculo vehiculo = flota.search(patente);
		if (vehiculo != null) {
			throw new RuntimeException("Vehiculo existente!");
		}
		flota.add(new Vehiculo(patente, tipoVehiculo, capacidadDeCarga));
	}

	private static int proximoLegajo() {
		return ++ultimoLegajo;
	}

	public void listarChoferes() {
		for (Chofer chofer : staff) {
			System.out.println(chofer);
		}
	}

	public void listarVehiculos() {
		for (Vehiculo vehiculo : flota) {
			System.out.println(vehiculo);
		}
	}

	// 2 - Asignar un vehiculo a un chofer (utilizando Excepciones)
	public void asignarVehiculo(String patenteVehiculo, int dniChofer) {
		// TODO implementar
		if (patenteVehiculo == null || patenteVehiculo.isEmpty()){
			throw new RuntimeException("Debe ingresarse una patente");
		}
		
		Chofer c = staff.search(dniChofer);
		Vehiculo v = flota.search(patenteVehiculo);
		if (c != null && v != null){
			if (v.getChoferACargo() == null){
				v.asignarChofer(c);
				c.asignarVehiculo(v);				
			}else{
				throw new RuntimeException("Vehiculo con chofer asignado");
			}			

		}else{
			if(c== null){
				throw new RuntimeException("Chofer inexistente");
			}else{
				throw new RuntimeException("Vehiculo inexistente");
			}
		}		
	}

	// 3 - Asignar una carga (utilizando Excepciones) al vehiculo que más se
	// adapte al peso de la carga.
	// a - Vehiculo con conductor asignado.
	// b - No debe tener carga asignada.
	// c - Su capacidad debe ser mayor o igual al peso de la carga.
	// De todos los vehículos posibles debe quedarse con el menor de todos
	// ellos.
	//
	// Si se logra asignar la carga el vehiculo debe agregarse a la cola de
	// vehiculos listos para partir.
	public void asignarCarga(Carga carga) {
		System.out.println("\n*** ASIGNACION DE CARGA ***");
		// TODO implementar
		System.out.println("Carga a asignar: "+carga.getDescripcion()+"("+carga.getPeso()+" Kg)");
		Vehiculo aux = null;
		for(Vehiculo v: flota){
			if (v.getNombreChofer() != null && v.getCargaAsignada() == null && 
					v.getCapacidadDeCarga() >= carga.getPeso()){
				if (aux != null){
					if (v.getCapacidadDeCarga()< aux.getCapacidadDeCarga()){
						aux = v;
					}
				}else{
					aux = v;
				}
			}
		}
		
		if (aux != null){
			aux.asignarCarga(carga);
			viajesListos.add(aux);
		}
	}

	// 4 - Listar choferes libres (que no estan de viaje)
	public void listarChoferesLibres() {
		System.out.println("\n--- Choferes Libres ---");
		for(Chofer c: staff){
			
			if (c.getVehiculo() == null){
				System.out.println(c.getDni() + " - " +c.getNombre());
			}
			if (c.getVehiculo() != null && c.getVehiculo().getCargaAsignada()==null){
				System.out.println(c.getDni() + " - " +c.getNombre());
			}
		}
	}

	// 5 - Listar los vehiculos listos para salir de viaje (la estructura debe
	// quedar en el orden inicial).
	public void listarVehiculosListosParaPartir() {
		// TODO implementar
		Vehiculo v = new Vehiculo("*********", TipoVehiculo.CAMION, 1000);
		viajesListos.add(v);
		v = viajesListos.remove();
		while(!v.getPatente().equals("*********")){
			System.out.println("El vehiculo con patente "+v.getPatente() + " esta listo para"
					+ " salir.");
			System.out.println("El conductor del vehiculo es "+v.getNombreChofer() + " y la "
					+ " carga asignada "+v.getCargaAsignada().getDescripcion() + "("+
					v.getCargaAsignada().getPeso()+")");
			viajesListos.add(v);
			v = viajesListos.remove();
			
		}
	}

}