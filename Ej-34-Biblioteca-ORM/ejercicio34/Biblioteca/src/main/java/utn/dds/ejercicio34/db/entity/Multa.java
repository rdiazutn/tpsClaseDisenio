package utn.dds.ejercicio34.db.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:24 PM
 */
@Entity
@Table(name = "MULTA")
public class Multa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long multaId;

	@Column(name = "FECHA_ALTA")
	private LocalDate fechaDeAlta;

	@Column(name = "FECHA_CANCELACION", nullable = true)
	private LocalDate fechaCancelacion;

	@Column(name = "OBSERVACION")
	private String observacion;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private Lector lector;

	public Multa(){

	}

	public int getDiasPenalizacion(){
		return 0;
	}

	public Long getMultaId() {
		return multaId;
	}

	public void setMultaId(Long multaId) {
		this.multaId = multaId;
	}

	public LocalDate getFechaDeAlta() {
		return fechaDeAlta;
	}

	public void setFechaDeAlta(LocalDate fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}

	public LocalDate getFechaCancelacion() {
		return fechaCancelacion;
	}

	public void setFechaCancelacion(LocalDate fechaCancelacion) {
		this.fechaCancelacion = fechaCancelacion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
}