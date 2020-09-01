package utn.dds.ejercicio34.db.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


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

	@Column(name = "FECHA_FIN_MULTA", nullable = true)
	private LocalDate fechaFinMulta;

	@Column(name = "OBSERVACION")
	private String observacion;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private Lector lector;

	public Multa(){

	}

	public Multa(int cantidadDias, Lector lector, CopiaLibro copiaLibro) {
		this.lector = lector;
		this.fechaDeAlta = LocalDate.now();
		this.fechaFinMulta = fechaDeAlta.plus(Long.valueOf(cantidadDias), ChronoUnit.DAYS);
		this.observacion = "No devolvio el libro " + copiaLibro.getLibro().getTitulo();
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

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

    public boolean estaVigente() {
		return LocalDate.now().isBefore(this.fechaFinMulta);
    }

	@Override
	public String toString() {
		return "Multa{" +
				"multaId=" + multaId +
				", fechaDeAlta=" + fechaDeAlta +
				", fechaFinMulta=" + fechaFinMulta +
				", observacion='" + observacion + '\'' +
				", lector=" + lector +
				'}';
	}
}