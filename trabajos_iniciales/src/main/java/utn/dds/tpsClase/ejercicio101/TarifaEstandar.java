package utn.dds.tpsClase.ejercicio101;


/**
 * @author Tomas
 * @version 1.0
 * @created 18-abr.-2020 6:50:17 p. m.
 */
public class TarifaEstandar extends Tarifa {
	
	private static TarifaEstandar instance;
	
	private TarifaEstandar() {
		
	}
	
	public static Tarifa getInstance() {
		if (instance == null) {
			instance = new TarifaEstandar();
		}
		return instance;
	}

	public Float getPrecio(Envio envio){
		return getTarifa(envio.esLocal()).floatValue() * envio.getPeso();

	}

	private Float getTarifa(Boolean esLocal){
		return esLocal ? 20F : 10F;
	}

}