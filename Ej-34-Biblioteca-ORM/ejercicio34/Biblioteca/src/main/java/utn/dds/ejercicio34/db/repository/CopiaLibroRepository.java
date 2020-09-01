package utn.dds.ejercicio34.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import utn.dds.ejercicio34.db.entity.CopiaLibro;
import utn.dds.ejercicio34.db.entity.estados.EstadoEnum;

import java.util.List;

@Repository
public interface CopiaLibroRepository extends JpaRepository<CopiaLibro, Long> {

    @Query("SELECT c FROM CopiaLibro c" +
            " JOIN FETCH c.libro l " +
            " WHERE c.estadoEnum LIKE :estado")
    List<CopiaLibro> findAllByEstado(@Param("estado")EstadoEnum estado);

}
