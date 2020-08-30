package utn.dds.ejercicio34.db.entity.estados;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:24 PM
 */
@Entity(name = "EnReparacion")
@DiscriminatorValue("EnReparacion")
public class EnReparacion extends Estado {

	private final String nombre = "En reparacion";

	public EnReparacion(){

	}

	public void disponibilizar(){

	}

	@Override
	public String getNombre() {
		return nombre;
	}
}