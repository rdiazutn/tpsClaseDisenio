package utn.dds.ejercicio34.db.entity;

import utn.dds.ejercicio34.db.entity.estados.Estado;
import utn.dds.ejercicio34.db.entity.estados.EstadoEnum;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:24 PM
 */
@Entity
@Table(name = "COPIA_LIBRO")
public class CopiaLibro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long copiaLibroId;

	@Column(name = "NUMERO_COPIA")
	private Long numeroCopia;

	@Enumerated(EnumType.STRING)
	private EstadoEnum estadoEnum;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private Biblioteca biblioteca;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private Libro libro;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, mappedBy = "copiaLibro")
	private List<Prestamo> prestamos;

	public CopiaLibro(){

	}

	public Estado getEstado(){
		return this.estadoEnum.getEstadoEquivalente();
	}

	public Boolean estaDisponible(){
		return this.estadoEnum == EstadoEnum.DISPONIBLE;
	}

	public Long getCopiaLibroId() {
		return copiaLibroId;
	}

	public void setCopiaLibroId(Long copiaLibroId) {
		this.copiaLibroId = copiaLibroId;
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Long getNumeroCopia() {
		return numeroCopia;
	}

	public void setNumeroCopia(Long numeroCopia) {
		this.numeroCopia = numeroCopia;
	}

	public List<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public EstadoEnum getEstadoEnum() {
		return estadoEnum;
	}

	public void setEstadoEnum(EstadoEnum estadoEnum) {
		this.estadoEnum = estadoEnum;
	}

	public void serPrestada() {
		Estado estado = this.estadoEnum.getEstadoEquivalente().prestar();
		cambiarEstadoA(estado);
	}

	private void cambiarEstadoA(Estado estado){
		Optional<EstadoEnum> estadoOptional = EstadoEnum.fromEstado(estado);
		if (estadoOptional.isPresent()) {
			this.estadoEnum = estadoOptional.get();
		}
	}

	public void serDevuelta() {
		Estado estado = this.estadoEnum.getEstadoEquivalente().disponibilizar();
		cambiarEstadoA(estado);
	}
}