package utn.dds.tpsClase.ejercicio133;

public class ACobrar extends Estado {

	private static ACobrar instance = new ACobrar();

	private ACobrar(){

	}
	
	public static ACobrar getInstance() {
		return instance;
	}

	@Override
	public Estado finalizar(){
		return Finalizado.getInstance();
	}
}