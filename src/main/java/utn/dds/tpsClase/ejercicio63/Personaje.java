package utn.dds.tpsClase.ejercicio63;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class Personaje {

	private Float altura;
	private Set<String> habilidades;
	private String imagen;
	private int inteligencia;
	private String nombre;
	private Float peso;


	public Personaje(){

	}
	
	public boolean esAlto() {
		return altura > 1.70;
	}
	
	public boolean esInteligente() {
		return inteligencia > 1000;
	}

	public boolean esGordo() {
		return peso > 100;
	}
	
	public List<String> getCaracteristicas(){
		List<String> caracteristicas = new ArrayList();
		if(esAlto()) {
			caracteristicas.add("Alto");
		}
		else { 
			caracteristicas.add("Enano");
		}
			
		if(esInteligente()) {
			caracteristicas.add("Inteligente");
		}
		else {
			caracteristicas.add("Tonto");
		}
		
		if(esGordo()) {
			caracteristicas.add("Gordo");
		}
		else {
			caracteristicas.add("Flaco");
		}
		return caracteristicas;
	}
	
	public abstract String getTipo();
	
	public String getNombre() {
		
		return getTipo() + " " + String.join(", ", getCaracteristicas()); 
	
	}
	
}