package utn.dds.ejercicio34.db.entity.biblioteca;

import javax.persistence.*;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:25 PM
 */
@Entity
@Table(name = "PAIS")
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long paisId;

	@Column(name = "NOMBRE", length = 100)
	private String nombre;

	public Pais(){

	}

	public Long getPaisId() {
		return paisId;
	}

	public void setPaisId(Long paisId) {
		this.paisId = paisId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}