package academy.devdojo.maratonajava.javacore.JDBC.service;

import academy.devdojo.maratonajava.javacore.JDBC.dominio.Producer;
import academy.devdojo.maratonajava.javacore.JDBC.repository.ProducerRepository;

import java.util.List;

public class ProducerService {

    public static void saveTransaction(List<Producer> producers) {
        ProducerRepository.saveTransaction(producers);
    }
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        if (producer.getId() == null || producer.getId() <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
        ProducerRepository.update(producer);
    }

    public static void updatePrepareStatement(Producer producer) {
        if (producer.getId() == null || producer.getId() <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
        ProducerRepository.updatePrepareStatement(producer);
    }

    public static List<Producer> findAll() {
        return ProducerRepository.findAll();
    }

    public static List<Producer> findByName(String name) {
        return ProducerRepository.findByName(name);
    }

    public static List<Producer> findByNamePreparedStatement(String name) {
        return ProducerRepository.findByNamePreparedStatement(name);
    }
    public static List<Producer> findByNameCallableStatement(String name) {
        return ProducerRepository.findByNameCallableStatement(name);
    }

    public static void showProducerMetaData() {
        ProducerRepository.showProducerMetaData();
    }
    public static void showDriverMetadata() {
        ProducerRepository.showDriverMetadata();
    }

    public static void showTypeScrollWorking() {
        ProducerRepository.showTypeScrollWorking();
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        return ProducerRepository.findByNameAndUpdateToUpperCase(name);
    }

    public static List<Producer> findByNameandInsertWhenNotFound(String name) {
        return ProducerRepository.findByNameandInsertWhenNotFound(name);
    }

    public static void findByNameAndDelete(String name) {
        ProducerRepository.findByNameAndDelete(name);
    }

}
