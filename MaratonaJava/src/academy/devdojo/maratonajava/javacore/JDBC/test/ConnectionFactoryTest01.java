package academy.devdojo.maratonajava.javacore.JDBC.test;

import academy.devdojo.maratonajava.javacore.JDBC.dominio.Producer;
import academy.devdojo.maratonajava.javacore.JDBC.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
        //ProducerRepository.save(producer);
        //ProducerService.delete(9);
        //ProducerService.update(producerToUpdate);
        //List<Producer> producers = ProducerService.findAll();
        //List<Producer> producers = ProducerService.findByName("Mad");
        //log.info("Producers found '{}'", producers);
        //ProducerService.showProducerMetaData();
        //ProducerService.showDriverMetaData();
        //ProducerService.showTypeScrollWorking();
        //List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
        //List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("Bones");
        //log.info("Producers found '{}'", producers);
        //ProducerService.findByNameAndDelete("A-1 pictures");
        //List<Producer> producers = ProducerService.findByNamePreparedStatement("Bones");
        //log.info("Producers found '{}'", producers);
        ProducerService.updatePreparedStatement(producerToUpdate);


    }
}
