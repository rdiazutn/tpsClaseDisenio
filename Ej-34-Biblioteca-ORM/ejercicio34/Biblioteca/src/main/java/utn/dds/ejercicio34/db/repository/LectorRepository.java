package utn.dds.ejercicio34.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import utn.dds.ejercicio34.db.entity.CopiaLibro;
import utn.dds.ejercicio34.db.entity.Lector;

import java.util.List;

@Repository
public interface LectorRepository extends JpaRepository<Lector, Long> {


    @Query("SELECT l FROM Lector l WHERE l.nombreApellido LIKE :nombre")
    List<Lector> getByNombre(@Param("nombre")String nombreLector);
}
