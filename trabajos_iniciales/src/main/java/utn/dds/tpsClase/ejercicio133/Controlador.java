package utn.dds.tpsClase.ejercicio133;

import java.time.LocalDateTime;

public class Controlador {
	
	private static Controlador instance = new Controlador();

	private Controlador(){

	}
	
	public static Controlador getInstance() {
		return instance;
	}

	public void cobrar(Ticket ticket){
		ticket.finalizar();
	}
	
	public Float getPrecioPara(Ticket ticket){
		ticket.setSalida(LocalDateTime.now());
		ticket.setPrecio(null); //Operacion no especificada
		iniciarTimeOut();
		return ticket.getPrecio();
	}
	
	private void iniciarTimeOut() {
		//Aca se iniciaria el proceso de timeout.
	}
	
	public boolean hayCambio() {
		return false;
	}

	public void retornar(Ticket ticket){

	}

	public void timeout(){

	}

}