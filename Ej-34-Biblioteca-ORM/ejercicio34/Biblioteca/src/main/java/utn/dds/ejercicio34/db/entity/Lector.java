package utn.dds.ejercicio34.db.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:24 PM
 */
@Entity
@Table(name = "LECTOR")
public class Lector {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long lectorId;

	@Column(name = "NOMBRE_APELLIDO")
	private String nombreApellido;

	@Column(name = "DOMICILIO")
	private String domicilio;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "lector")
	private Set<Multa> multas;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "lector")
	private Set<Prestamo> prestamos;

	@Column(name = "TELEFONO", length = 50)
	private String telefono;

	public Lector() {

	}

	public void agregarPrestamo(CopiaLibro libro, String observacion, int duracionPrestamo) {
		if (this.prestamos == null) {
			this.prestamos = new HashSet<>();
		}
		this.prestamos.add(new Prestamo(libro, LocalDateTime.now(), this, observacion, duracionPrestamo));
	}

	public void cargarMulta(Multa multa) {
		this.multas.add(multa);
	}

	public void devolver(CopiaLibro copia) {

	}

	public Boolean puedePrestarseUnaCopia() {
		return false;
	}

	public Long getLectorId() {
		return lectorId;
	}

	public void setLectorId(Long lectorId) {
		this.lectorId = lectorId;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Set<Multa> getMultas() {
		return multas;
	}

	public void setMultas(Set<Multa> multas) {
		this.multas = multas;
	}

	public Set<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(Set<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Multa> getMultasVigentes() {
		return this.multas.stream().filter(multa -> multa.estaVigente()).collect(Collectors.toList());
	}

	public List<Prestamo> getPrestamosVigentes() {
		return this.prestamos.stream().filter(prestamo -> prestamo.estaVigente()).collect(Collectors.toList());
	}
}