package utn.dds.ejercicio34.db.entity.estados;

import javax.persistence.*;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:24 PM
 */
public abstract class Estado {

	public Estado disponibilizar(){
		return this;
	}

	public Estado prestar(){
		return this;
	}

	public Estado reparar(){
		return this;
	}

	public Estado retrasar(){
		return this;
	}
}