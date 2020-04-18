package utn.dds.tpsClase.ejercicio101;


public class Envio {

	private int codigoEnvio;
	private int peso;
	private Destino destino;
	private Tarifa tarifa;
	private Transportista transportista;
	
	public Envio(int codigoEnvio, int peso, Destino destino, Tarifa tarifa, Transportista transportista) {
		this.codigoEnvio = codigoEnvio;
		this.peso = peso;
		this.destino = destino;
		this.tarifa = tarifa;
		this.transportista = transportista;
	}

	public boolean esLocal() {
		return destino.esLocal();
	}
	
	public Float getTotal(){
		return this.tarifa.getPrecio(this);
	}
	
	public int getPeso() {
		return peso;
	}
}