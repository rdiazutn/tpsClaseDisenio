package utn.dds.tpsClase.ejercicio133;

public class Retenido extends Estado {

	private static Retenido instance = new Retenido();

	private Retenido(){

	}
	
	public static Retenido getInstance() {
		return instance;
	}

}