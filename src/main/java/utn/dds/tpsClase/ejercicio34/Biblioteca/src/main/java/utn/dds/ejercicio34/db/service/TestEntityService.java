package utn.dds.ejercicio34.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.dds.ejercicio34.db.entity.TestEntity;
import utn.dds.ejercicio34.db.repository.TestEntityRepository;

import java.util.List;

@Service
public class TestEntityService {

    @Autowired
    private TestEntityRepository testEntityRepository;

    public TestEntity getFirstEntityByName (String name){
        List<TestEntity> testEntityList = testEntityRepository.getTestEntitiesByName(name);
        return testEntityList.isEmpty() ? null : testEntityList.get(0);
    }

}
