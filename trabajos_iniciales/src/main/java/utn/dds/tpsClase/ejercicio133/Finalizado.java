package utn.dds.tpsClase.ejercicio133;

public class Finalizado extends Estado {

	private static Finalizado instance = new Finalizado();

	private Finalizado(){

	}
	
	public static Finalizado getInstance() {
		return instance;
	}

	@Override
	public Estado retener(){
		return null;
	}
}