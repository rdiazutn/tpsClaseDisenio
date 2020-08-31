package utn.dds.ejercicio34.db.service;
import com.sun.org.apache.bcel.internal.ExceptionConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.dds.ejercicio34.db.entity.CopiaLibro;
import utn.dds.ejercicio34.db.entity.Lector;
import utn.dds.ejercicio34.db.entity.Prestamo;
import utn.dds.ejercicio34.db.service.Controlador;
import utn.dds.ejercicio34.db.service.LectorService;

import javax.persistence.criteria.CriteriaBuilder;
import javax.xml.ws.ServiceMode;
import java.util.Arrays;
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

	private Scanner scanner = new Scanner(System.in);
	public void correrPrueba(){

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
					return;
			}
		}

	}

	private void calcularMultas() {
		Lector lector = obtenerLector();
		controlador.mostrarMultas(lector);
	}

	private void realizarDevolucion() {
		Lector lector = obtenerLector();
		CopiaLibro copiaLibro = obtenerNombreCopia();
		Prestamo prestamo = obtenerPrestamoCon(lector, copiaLibro);
		controlador.devolverLibro(prestamo);
	}

	private Prestamo obtenerPrestamoCon(Lector lector, CopiaLibro copiaLibro) {
		return prestamoService.findPrestamoBy(lector, copiaLibro);
	}

	private Lector obtenerLector() {
		String nombreLector = obtenerString(" nombre del lector ");
		Lector lector = null;
		while (true) {
			lector = lectorService.getByNombre(nombreLector);
			if (lector != null){
				return lector;
			}
			System.out.println(" Lector no encontrado ");
		}
	}

	private void realizarPrestamo() {
		CopiaLibro copiaLibro = obtenerNombreCopia();
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
			try {
				System.out.println("Por favor seleccione la opcion que desee realizar:" +
						"\n 1. Realizar un prestamo" +
						"\n 2. Realizar una devolucion " +
						"\n 3. Ver las multas " +
						"\n 4. Finalizar");
				String input = scanner.nextLine();
				Integer opcion = Integer.valueOf(input);
				if (opcion < 1 || opcion > 4){
					throw new RuntimeException();
				}
				return opcion;
			}catch (Exception ex){
				System.out.println("Valor invalido!");
			}
		}
	}




}
