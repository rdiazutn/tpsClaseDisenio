package utn.dds.tpsClase.ejercicio133;

public class EnCurso extends Estado {

	private static EnCurso instance = new EnCurso();

	private EnCurso(){

	}
	
	public static EnCurso getInstance() {
		return instance;
	}

	@Override
	public Estado aCobrar(){
		return ACobrar.getInstance();
	}
}