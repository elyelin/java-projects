package ejercicio1;

public class Test {

	public static void main(String[] args) {
		Grupo grupo;
		
		grupo= new Grupo("TP1");
		
		grupo.agregarIntegrante("elyelin");
		System.out.println(grupo.buscarIntegrante("elyelin")+"fue asignada al grupo"+grupo.getNombre());
		grupo.agregarIntegrante("pablo");
		System.out.println(grupo.buscarIntegrante("pablo")+"fue asignado al grupo"+grupo.getNombre());
		grupo.agregarIntegrante("norberto");
		System.out.println(grupo.buscarIntegrante("norberto")+"fue asignado al grupo"+grupo.getNombre());

		grupo.buscarIntegrante("pablo");
		grupo.buscarIntegrante("El pepe");
		
		grupo.mostrar();
		grupo.removerIntegrante("norberto");
		grupo.removerIntegrante("norberto");
		grupo.mostrar();
		grupo.vaciar();
		grupo.mostrar();
		
	}

}
