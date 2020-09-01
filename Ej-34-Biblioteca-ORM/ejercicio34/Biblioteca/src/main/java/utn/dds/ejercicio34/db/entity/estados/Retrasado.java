package utn.dds.ejercicio34.db.entity.estados;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:25 PM
 */
public class Retrasado extends Estado {

	private static Retrasado instance;

	private Retrasado(){

	}
	public static Estado getInstance(){
		if(instance == null)
			instance = new Retrasado();
		return instance;
	}

	@Override
	public Estado disponibilizar(){
		return Disponible.getInstance();
	}
}