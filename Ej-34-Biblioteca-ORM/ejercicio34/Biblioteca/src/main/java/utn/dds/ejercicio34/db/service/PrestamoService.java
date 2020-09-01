package utn.dds.ejercicio34.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import utn.dds.ejercicio34.db.entity.CopiaLibro;
import utn.dds.ejercicio34.db.entity.Lector;
import utn.dds.ejercicio34.db.entity.Prestamo;
import utn.dds.ejercicio34.db.repository.CopiaLibroRepository;
import utn.dds.ejercicio34.db.repository.PrestamoRepository;

import java.util.List;

@Service
public class PrestamoService extends CustomJPAService<Prestamo> {

    @Autowired
    private PrestamoRepository prestamoRepository;

    @Override
    public JpaRepository<Prestamo, Long> getRepository() {
        return prestamoRepository;
    }

    public List<Prestamo> findPrestamoBy(Lector lector) {
        return prestamoRepository.findPrestamoBy(lector);
    }
}
