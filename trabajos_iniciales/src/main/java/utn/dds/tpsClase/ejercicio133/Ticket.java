package utn.dds.tpsClase.ejercicio133;

import java.time.LocalDateTime;

public class Ticket {

	private LocalDateTime entrada;
	private Estado estado;
	private float precio;
	private LocalDateTime salida;
	
	public Ticket(){

	}
	
	public void aCobrar(){
		estado = estado.aCobrar();
	}

	public void finalizar(){
		estado = estado.finalizar();
	}

	public Float getPrecio(){
		return this.precio;
	}

	public void retener(){

	}

	public void setPrecio(Float nuevoPrecio){	
		this.precio = nuevoPrecio;
	}

	public void setSalida(LocalDateTime nuevaSalida){
		this.salida = nuevaSalida;
	}
	
}







