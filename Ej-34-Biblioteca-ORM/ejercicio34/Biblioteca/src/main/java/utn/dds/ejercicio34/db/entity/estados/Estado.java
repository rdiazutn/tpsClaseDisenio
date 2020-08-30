package utn.dds.ejercicio34.db.entity.estados;

import javax.persistence.*;

/**
 * @author Daiana
 * @version 1.0
 * @created 29-Aug-2020 8:04:24 PM
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "ESTADO")
public abstract class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long estadoId;

	@Column(name = "NOMBRE", unique = true, nullable = false, length = 50)
	private String nombre;

	public Estado(){

	}

	public void disponibilizar(){

	}

	public void prestar(){

	}

	public void reparar(){

	}

	public void retrasar(){

	}

	public Long getEstadoId() {
		return estadoId;
	}

	public void setEstadoId(Long estadoId) {
		this.estadoId = estadoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}