package utn.dds.ejercicio34.db.entity.estados;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:24 PM
 */
@Entity(name = "Disponible")
@DiscriminatorValue("Disponible")
public class Disponible extends Estado {

	private final String nombre = "Disponible";

	public Disponible(){

	}

	public void prestar(){

	}

	public void reparar(){

	}

	@Override
	public String getNombre() {
		return nombre;
	}
}