package utn.dds.ejercicio34.db.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import utn.dds.ejercicio34.db.repository.TestEntityRepository;

@SpringBootApplication
@Configuration
@EnableTransactionManagement
@EnableScheduling
@ComponentScan(basePackages = {"utn.dds.ejercicio34.db.service"})
@EntityScan(basePackages = "utn.dds.ejercicio34.db.entity")
@EnableJpaRepositories("utn.dds.ejercicio34.db.repository")
public class TestHibernateSpring {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TestEntityRepository repository;

    @Autowired
    private TestEntityService entityService;

    public static void main(String[] args) {
        SpringApplication.run(TestHibernateSpring.class, args);
    }
}