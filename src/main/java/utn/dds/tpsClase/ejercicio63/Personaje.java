package utn.dds.tpsClase.ejercicio63;


/**
 * @version 1.0
 * @created 18-abr.-2020 9:09:18 p. m.
 */
public class Personaje {

	private Float altura;
	private Set<String> habilidades;
	private String imagen;
	private int inteligencia;
	private String nombre;
	private Float peso;
	private TipoPersonaje tipo;
	public EnumCaracteristica m_EnumCaracteristica;

	public Personaje(){

	}

	public void finalize() throws Throwable {

	}
	public String getCaracteristica(){
		return "";
	}
}//end Personaje