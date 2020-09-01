package utn.dds.ejercicio34.db.entity;

import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

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

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private CopiaLibro copiaLibro;

	@Column(name = "FECHA_DEVOLUCION")
	private LocalDateTime fechaDevolucion;

	@Column(name = "FECHA_PRESTAMO")
	private LocalDateTime fechaPrestamo;

	@Column(name = "FECHA_FIN_PRESTAMO")
	private LocalDateTime fechaFinPrestamo;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Lector lector;

	@Column(name = "OBSERVACION")
	private String observacion;

	public Prestamo(){

	}

	public Prestamo(CopiaLibro copiaLibro, LocalDateTime fechaPrestamo, Lector lector, String observacion, int duracionPrestamo) {
		this.copiaLibro = copiaLibro;
		this.fechaPrestamo = fechaPrestamo;
		this.lector = lector;
		this.observacion = observacion;
		this.fechaFinPrestamo = LocalDateTime.now().plus(Long.valueOf(duracionPrestamo), ChronoUnit.DAYS );
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

	public boolean esMultable() {
		return LocalDateTime.now().isAfter(this.fechaFinPrestamo);
	}

	public int cantidadDiasMulta(int penaPorDia) {
		return (int) Duration.between(fechaFinPrestamo, fechaDevolucion).toDays()
				* penaPorDia;
	}

	public boolean estaVigente() {
		return this.fechaDevolucion == null;
	}

	public void finalizar() {
		this.copiaLibro.serDevuelta();
		this.fechaDevolucion = LocalDateTime.now();
	}
}