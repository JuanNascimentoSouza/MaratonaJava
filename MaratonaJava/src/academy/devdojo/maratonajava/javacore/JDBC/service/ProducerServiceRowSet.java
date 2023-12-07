package academy.devdojo.maratonajava.javacore.JDBC.service;

import academy.devdojo.maratonajava.javacore.JDBC.dominio.Producer;
import academy.devdojo.maratonajava.javacore.JDBC.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.JDBC.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {

    public static List<Producer> findByNameRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

    public static void updateJdbcRowSet(Producer producer) {
    ProducerRepositoryRowSet.updateJdbcRowSet(producer);
    }

    public static void updateCachedRowSet(Producer producer) {
    ProducerRepositoryRowSet.updateCachedRowSet(producer);
    }
}


