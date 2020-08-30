package utn.dds.ejercicio34.db.entity.biblioteca;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:25 PM
 */
@Entity
@Table(name = "PRESTAMO")
public class Prestamo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long prestamoId;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private CopiaLibro copiaLibro;

	@Column(name = "FECHA_DEVOLUCION")
	private LocalDateTime fechaDevolucion;

	@Column(name = "FECHA_PRESTAMO")
	private LocalDateTime fechaPrestamo;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private Lector lector;

	@Column(name = "OBSERVACION")
	private String observacion;

	public Prestamo(){

	}

	public Long getPrestamoId() {
		return prestamoId;
	}

	public void setPrestamoId(Long prestamoId) {
		this.prestamoId = prestamoId;
	}

	public CopiaLibro getCopiaLibro() {
		return copiaLibro;
	}

	public void setCopiaLibro(CopiaLibro copiaLibro) {
		this.copiaLibro = copiaLibro;
	}

	public LocalDateTime getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public LocalDateTime getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDateTime fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Lector getLector() {
		return lector;
	}

	public void setLector(Lector lector) {
		this.lector = lector;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
}