package utn.dds.ejercicio34.db.entity.biblioteca.estados;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:25 PM
 */
@Entity(name = "Retrasado")
@DiscriminatorValue("Retrasado")
public class Retrasado extends Estado {

	private final String nombre = "Retrasado";

	public Retrasado(){

	}

	public void disponibilizar(){

	}

	@Override
	public String getNombre() {
		return nombre;
	}
}