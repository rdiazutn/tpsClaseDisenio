package utn.dds.ejercicio34.db.entity.estados;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:24 PM
 */
public class EnReparacion extends Estado {

	private static EnReparacion instance;

	private EnReparacion(){

	}

	public static Estado getInstance(){
		if(instance == null)
			instance = new EnReparacion();
		return instance;
	}

	@Override
	public Estado disponibilizar(){
		return Disponible.getInstance();
	}
}