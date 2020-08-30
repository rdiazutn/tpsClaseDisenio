package utn.dds.ejercicio34.db.entity.biblioteca;

import javax.persistence.*;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:24 PM
 */
@Entity
@Table(name = "BIBLIOTECA")
public class Biblioteca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long bibliotecaId;

	@Column(name = "DOMICILIO", length = 100)
	private String domicilio;

	@Column(name = "NOMBRE", length = 100)
	private String nombre;

	@Column(name = "PROVINCIA", length = 100)
	private String provincia;

	public Biblioteca(){

	}

	public Long getBibliotecaId() {
		return bibliotecaId;
	}

	public void setBibliotecaId(Long bibliotecaId) {
		this.bibliotecaId = bibliotecaId;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
}