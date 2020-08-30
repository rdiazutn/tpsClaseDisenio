package utn.dds.ejercicio34.db.entity;

import utn.dds.ejercicio34.db.entity.estados.Estado;

import javax.persistence.*;
import java.util.List;

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

	@Column(name = "ESTADO", length = 50)
	private String estado;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private Biblioteca biblioteca;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private Libro libro;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private List<Prestamo> prestamos;

	public CopiaLibro(){

	}

	public Boolean estaDisponible(){
		return false;
	}

	public Estado getEstado(){
		return null;
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
}