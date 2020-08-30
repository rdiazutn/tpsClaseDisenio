package utn.dds.ejercicio34.db.entity;

import javax.persistence.*;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:24 PM
 */
@Entity
@Table(name = "EDITORIAL")
public class Editorial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long editorialId;

	@Column(name = "NOMBRE", length = 50)
	private String nombre;

	public Editorial(){

	}

	public Long getEditorialId() {
		return editorialId;
	}

	public void setEditorialId(Long editorialId) {
		this.editorialId = editorialId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}