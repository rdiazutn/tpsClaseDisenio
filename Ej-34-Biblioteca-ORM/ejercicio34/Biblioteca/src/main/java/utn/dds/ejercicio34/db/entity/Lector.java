package utn.dds.ejercicio34.db.entity;

import javax.persistence.*;
import java.util.List;

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

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, mappedBy = "lector")
	private List<Multa> multas;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, mappedBy = "lector")
	private List<Prestamo> prestamos;

	@Column(name = "TELEFONO", length = 50)
	private String telefono;

	public Lector(){

	}

	public void agregarPrestamo(CopiaLibro libro){

	}

	public void cargarMulta(Multa multa){

	}

	public void devolver(CopiaLibro copia){

	}

	public Boolean puedePrestarseUnaCopia(){
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

	public List<Multa> getMultas() {
		return multas;
	}

	public void setMultas(List<Multa> multas) {
		this.multas = multas;
	}

	public List<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}