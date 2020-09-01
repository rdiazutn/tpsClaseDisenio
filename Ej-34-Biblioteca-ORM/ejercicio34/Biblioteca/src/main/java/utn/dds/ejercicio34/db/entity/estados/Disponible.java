package utn.dds.ejercicio34.db.entity.estados;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:24 PM
 */
public class Disponible extends Estado {

	private static Disponible instance;

	private Disponible(){

	}

	public static Estado getInstance(){
		if(instance == null)
			instance = new Disponible();
		return instance;
	}

	@Override
	public Estado prestar() {
		return Prestado.getInstance();
	}

	@Override
	public Estado reparar(){
		return EnReparacion.getInstance();
	}
}