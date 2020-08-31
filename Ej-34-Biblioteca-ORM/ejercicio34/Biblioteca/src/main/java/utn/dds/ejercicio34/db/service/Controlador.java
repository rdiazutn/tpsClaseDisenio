package utn.dds.ejercicio34.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.dds.ejercicio34.db.entity.CopiaLibro;
import utn.dds.ejercicio34.db.entity.Lector;
import utn.dds.ejercicio34.db.entity.Multa;
import utn.dds.ejercicio34.db.entity.Prestamo;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:24 PM
 */
@Service
public class Controlador {

	@Autowired
	private CopiaLibroService copiaLibroService;

	@Autowired
	private LectorService lectorService;

	@Autowired
	private PrestamoService prestamoService;

	private final int DURACION_PRESTAMO = 30;
	private final int PENALIDAD = 2;

	public Controlador(){

	}

	public void finalize() throws Throwable {

	}

	private void calcularMulta(Prestamo prestamo){
		if(prestamo.esMultable()){
			int cantidadDias = prestamo.cantidadDiasMulta(PENALIDAD);
			Lector lector = prestamo.getLector();
			lector.cargarMulta(new Multa(cantidadDias, lector, prestamo.getCopiaLibro()));
			lectorService.save(lector);
		}
	}

	public void mostrarMultas(Lector lector) {
		List<Multa> multas = lector.getMultas();
		multas.stream().forEach(multa -> System.out.println(multa.toString()));
	}

	public void devolverLibro(Prestamo prestamo){
		prestamo.finalizar();
		prestamoService.save(prestamo);
		calcularMulta(prestamo);
	}

	/**
	 * 
	 * @param copiaLibro
	 * @param lector
	 */
	public void realizarPrestamo(CopiaLibro copiaLibro, Lector lector, String observacion){
		if (lector.getMultasVigentes().size() > 0) {
			// throw error
			throw new RuntimeException("El lector tiene multas vigentes");
		}
		if (lector.getPrestamosVigentes().size() > 3) {
			// throw error
			throw new RuntimeException("El lector tiene mas de 3 libros prestados actualmente");
		}
		if (!copiaLibro.estaDisponible()) {
			// throw error
			throw new RuntimeException("El libro seleccionado no esta disponible :(");
		}
		copiaLibro.serPrestada();
		lector.agregarPrestamo(copiaLibro, observacion, DURACION_PRESTAMO);
		lectorService.save(lector);

	}

}