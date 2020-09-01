package utn.dds.ejercicio34.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import utn.dds.ejercicio34.db.entity.CopiaLibro;
import utn.dds.ejercicio34.db.entity.Lector;
import utn.dds.ejercicio34.db.repository.CopiaLibroRepository;
import utn.dds.ejercicio34.db.repository.LectorRepository;

import java.util.List;

@Service
public class LectorService extends CustomJPAService<Lector> {

    @Autowired
    private LectorRepository lectorRepository;

    @Override
    public JpaRepository<Lector, Long> getRepository() {
        return lectorRepository;
    }

    public Lector getByNombre(String nombreLector) {
        List<Lector> lectorList = lectorRepository.getByNombre(nombreLector);
        return lectorList.isEmpty() ? null : lectorList.get(0);
    }
}
