package utn.dds.ejercicio34.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import utn.dds.ejercicio34.db.entity.CopiaLibro;
import utn.dds.ejercicio34.db.entity.estados.EstadoEnum;
import utn.dds.ejercicio34.db.repository.CopiaLibroRepository;

import java.util.List;

@Service
public class CopiaLibroService extends CustomJPAService<CopiaLibro> {

    @Autowired
    private CopiaLibroRepository copiaLibroRepository;

    @Override
    public JpaRepository<CopiaLibro, Long> getRepository() {
        return copiaLibroRepository;
    }

    public List<CopiaLibro> getCopiasDisponibles() {
        return copiaLibroRepository.findAllByEstado(EstadoEnum.DISPONIBLE);
    }
}
