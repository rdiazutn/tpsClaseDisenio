package utn.dds.ejercicio34.db.entity.estados;


import java.util.Arrays;
import java.util.Optional;

public enum EstadoEnum {
    DISPONIBLE("Disponible", Disponible.getInstance()),
    EN_REPARACION("En reparacion", EnReparacion.getInstance()),
    PRESTADO("Prestado", Prestado.getInstance()),
    RETRASADO("Retrasado", Retrasado.getInstance());

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

    public static Optional<EstadoEnum> fromEstado(Estado estado){
        return Arrays.stream(EstadoEnum.values())
                .filter(estadoEnum -> estadoEnum.getEstadoEquivalente().equals(estado))
                .findFirst();
    }
}
