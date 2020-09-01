package utn.dds.ejercicio34.db.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestEntityServiceTest {

    @Autowired
    private TestEntityService entityService;

    @Autowired
    private TestEntityRepository testEntityRepository;

    @Test
    public void persistenceTest() {
        TestEntity testEntity = new TestEntity("Test", "Test");
        testEntityRepository.save(testEntity);
        TestEntity resultEntity = entityService.getFirstEntityByName("Test");
        assertEquals(testEntity.getEmployeeId(), resultEntity.getEmployeeId());
    }

}