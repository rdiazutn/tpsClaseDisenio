package utn.dds.tpsClase.ejercicio63;

import java.util.HashSet;
import java.util.Set;

public class Controlador {

	private Set<Personaje> personajes;
	private Set<Personaje> personajesElegidos;

	public Controlador(){

	}

	public void crearPersonaje(Personaje personaje){
		if(personajes == null) {
			personajes = new HashSet<Personaje>();
		}
		personajes.add(personaje);

	}


	public void elegirPersonaje(Personaje personaje){
		if(personajesElegidos == null){
			personajesElegidos = new HashSet<Personaje>();
		}

		if(personajes == null || !personajes.contains(personaje)){
			throw new RuntimeException("El personaje elegido no pertenece a la lista");
		}
		personajesElegidos.add(personaje);
	}
}