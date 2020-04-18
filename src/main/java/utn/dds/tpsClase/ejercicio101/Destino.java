package utn.dds.tpsClase.ejercicio101;

public class Destino {

	private String direccion;
	private boolean esLocal;
	
	public Destino(String direccion, boolean esLocal) {
		this.direccion = direccion;
		this.esLocal = esLocal;
	}

	public boolean esLocal() {
		return esLocal;
	}

}