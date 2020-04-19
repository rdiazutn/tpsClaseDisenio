package utn.dds.tpsClase.ejercicio63;


/**
 * @author Daiana
 * @version 1.0
 * @created 18-abr.-2020 9:09:18 p. m.
 */
public abstract class TipoPersonaje {

	public Personaje m_Personaje;

	public TipoPersonaje(){

	}

	public void finalize() throws Throwable {

	}
	public abstract String getTipo();
}//end TipoPersonaje