package utn.dds.tpsClase.ejercicio101;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private int codigoCliente;
	private List<Envio> envios;
	
	public Cliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public void agregarEnvio(Envio envio) {
		if(envios != null) {
			envios = new ArrayList<Envio>();
		}
		envios.add(envio);
	}	
}