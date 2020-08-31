package utn.dds.ejercicio34.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import utn.dds.ejercicio34.db.entity.CopiaLibro;
import utn.dds.ejercicio34.db.entity.TestEntity;
import utn.dds.ejercicio34.db.repository.CopiaLibroRepository;
import utn.dds.ejercicio34.db.repository.TestEntityRepository;

import java.util.List;

@Service
public class CopiaLibroService extends CustomJPAService<CopiaLibro> {

    @Autowired
    private CopiaLibroRepository copiaLibroRepository;

    @Override
    public JpaRepository<CopiaLibro, Long> getRepository() {
        return copiaLibroRepository;
    }
}
