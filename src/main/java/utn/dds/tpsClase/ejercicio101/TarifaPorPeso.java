package utn.dds.tpsClase.ejercicio101;


/**
 * @author Tomas
 * @version 1.0
 * @created 18-abr.-2020 6:50:17 p. m.
 */
public class TarifaPorPeso extends Tarifa {
	TarifaPorPeso instance;
	
	private TarifaPorPeso() {
		
	}
	
	public Tarifa getInstance() {
		if (instance == null) {
			instance = new TarifaPorPeso();
		}
		return instance;
	}
	public Float getPrecio(Envio envio){
		return envio.getPeso() * 10F + 50F;
	}
}