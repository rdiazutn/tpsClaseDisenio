package utn.dds.ejercicio34.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import utn.dds.ejercicio34.db.entity.CopiaLibro;
import utn.dds.ejercicio34.db.entity.Lector;
import utn.dds.ejercicio34.db.entity.Prestamo;

import java.util.List;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {


    @Query("SELECT p FROM Prestamo p " +
            "JOIN FETCH p.lector lec  " +
            "JOIN FETCH p.copiaLibro c " +
            "JOIN FETCH c.libro l " +
            "LEFT JOIN FETCH lec.multas m  " +
            "WHERE  p.lector = :lector")
    List<Prestamo> findPrestamoBy(@Param("lector") Lector lector);
}
