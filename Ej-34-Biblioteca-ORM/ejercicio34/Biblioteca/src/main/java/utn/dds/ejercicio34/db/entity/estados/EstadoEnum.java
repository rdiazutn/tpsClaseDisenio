package utn.dds.ejercicio34.db.entity.estados;

public enum EstadoEnum {
    DISPONIBLE("Disponible", Disponible.getInstance()),
    EN_REPARACION("En reparacion", Disponible.getInstance()),
    PRESTADO,
    RESTRASADO;

    private String nombre;
    private Estado estadoEquivalente;

    EstadoEnum(String nombre, Estado estadoEquivalente){
        this.nombre = nombre;
        this.estadoEquivalente = estadoEquivalente;
    }

    public String getNombre() {
        return nombre;
    }

    public Estado getEstadoEquivalente() {
        return estadoEquivalente;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
