package academy.devdojo.maratonajava.javacore.JDBC.test;

import academy.devdojo.maratonajava.javacore.JDBC.dominio.Producer;
import academy.devdojo.maratonajava.javacore.JDBC.service.ProducerService;
import academy.devdojo.maratonajava.javacore.JDBC.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(1).name("madhouse").build();
        ProducerServiceRowSet.updateCachedRowSet(producerToUpdate);
        //log.info("---------------------------");
        //List<Producer> producers = ProducerServiceRowSet.findByNameRowSet("");
        //log.info(producers);
    }
}
