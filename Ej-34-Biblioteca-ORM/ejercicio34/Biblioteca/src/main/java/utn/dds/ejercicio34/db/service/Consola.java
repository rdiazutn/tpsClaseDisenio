package utn.dds.ejercicio34.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.dds.ejercicio34.db.entity.CopiaLibro;
import utn.dds.ejercicio34.db.entity.Lector;
import utn.dds.ejercicio34.db.entity.Prestamo;

import java.util.List;
import java.util.Scanner;


@Service
public class Consola {

	@Autowired
	private Controlador controlador;

	@Autowired
	private LectorService lectorService;

	@Autowired
	private PrestamoService prestamoService;

	@Autowired
	private CopiaLibroService copiaLibroService;

	private Scanner scanner = new Scanner(System.in);

	public void iniciar(){

		System.out.println("Bienvenido!");

		while (true) {
			Integer opcion = this.obtenerOpcion();
			switch (opcion) {
				case 1:
					this.realizarPrestamo();
					break;
				case 2:
					this.realizarDevolucion();
					break;
				case 3:
					this.calcularMultas();
					break;
				case 4:
					System.out.println("Gracias por utilizar el sistema");
					System.exit(0);
					return;
			}
			System.out.println("\n\n");
		}
	}

	private void calcularMultas() {
		Lector lector = obtenerLector();
		controlador.mostrarMultas(lector);
	}

	private void realizarDevolucion() {
		Lector lector = obtenerLector();
		Prestamo prestamo = obtenerPrestamoAFinalizar(lector);
		if(prestamo != null) {
			controlador.devolverLibro(prestamo);
			System.out.println("Se ha devuelto el libro correctamente y se ha cargado la multa en caso de corresponder.");
		}
	}

	private Prestamo obtenerPrestamoAFinalizar(Lector lector) {
		List<Prestamo> prestamos = obtenerPrestamosCon(lector);
		if(prestamos.size() == 0){
			System.out.println("No hay prestamos asociados al lector: " + lector.getNombreApellido());
			return null;
		}
		System.out.println("Seleccione el prestamo que desee finalizar por su indice");
		for(int i = 0 ; i < prestamos.size(); i ++){
			Prestamo prestamo = prestamos.get(i);
			System.out.println("Indice: " + i + " Prestamo: " + prestamo.getCopiaLibro().getLibro().getTitulo()
				+ " Observacion: " + prestamo.getObservacion());
		}
		Integer numeroPrestamo;
		while(true) {
			numeroPrestamo = obtenerInteger();
			try{
				return prestamos.get(numeroPrestamo);
			}catch (Exception ex) {
				System.out.println("El indice del prestamo no pudo ser encontrado. Reintente");
			}
		}
	}

	private CopiaLibro obtenerCopia() {
		List<CopiaLibro> copiasDisponibles = copiaLibroService.getCopiasDisponibles();
		System.out.println("Seleccione el libro que desee reservar por su indice");
		for(int i = 0 ; i < copiasDisponibles.size(); i ++){
			CopiaLibro copiaLibro = copiasDisponibles.get(i);
			System.out.println("Indice: " + i + " libro: " + copiaLibro.getLibro().getTitulo());
		}
		Integer numeroCopia;
		while(true) {
			numeroCopia = obtenerInteger();
			try{
				return copiasDisponibles.get(numeroCopia);
			}catch (Exception ex) {
				System.out.println("El numero de copia no pudo ser encontrado");
			}
		}
	}

	private List<Prestamo> obtenerPrestamosCon(Lector lector) {
		return prestamoService.findPrestamoBy(lector);
	}

	private Lector obtenerLector() {
		List<Lector> lectores = lectorService.getRepository().findAll();
		System.out.println("Los lectores del sistema son:");
		lectores.stream().forEach(lector -> {
			System.out.println("Lector: " + lector.getNombreApellido());
		});
		String nombreLector = obtenerString(" nombre del lector ");
		Lector lector = null;
		while (true) {
			lector = lectorService.getByNombre(nombreLector);
			if (lector != null){
				return lector;
			}
			System.out.println(" Lector no encontrado ");
			nombreLector = obtenerString(" nombre del lector ");
		}
	}

	private void realizarPrestamo() {
		CopiaLibro copiaLibro = obtenerCopia();
		Lector lector = obtenerLector();
		String observacion = obtenerString("observaciones");
		controlador.realizarPrestamo(copiaLibro, lector, observacion);
	}

	private String obtenerString(String nombreCampo) {
		System.out.println("Ingrese " + nombreCampo);
		String input = scanner.nextLine();
		return input;
	}

	private int obtenerOpcion () {
		while(true) {
			System.out.println("Por favor seleccione la opcion que desee realizar:" +
					"\n 1. Realizar un prestamo" +
					"\n 2. Realizar una devolucion " +
					"\n 3. Ver las multas " +
					"\n 4. Finalizar");
			Integer opcion = obtenerInteger();
			if (opcion >= 1 && opcion <= 4){
				return opcion;
			}
			System.out.println("Ingrese un numero valido");
		}
	}

	private Integer obtenerInteger(){
		while(true) {
			try {
				String input = scanner.nextLine();
				Integer opcion = Integer.valueOf(input);
				return opcion;
			}catch(Exception ex){
				System.out.println("Valor invalido, por favor ingrese un numero");
			}
		}
	}
}
