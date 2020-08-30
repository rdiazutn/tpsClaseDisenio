package utn.dds.ejercicio34.db.entity.biblioteca.estados;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:25 PM
 */
@Entity(name = "Prestado")
@DiscriminatorValue("Prestado")
public class Prestado extends Estado {

	private final String nombre = "Prestado";

	public Prestado(){

	}

	public void disponibilizar(){

	}

	public void retrasar(){

	}

	@Override
	public String getNombre() {
		return nombre;
	}
}