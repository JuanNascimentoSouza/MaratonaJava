package academy.devdojo.maratonajava.javacore.JDBC.test;

import academy.devdojo.maratonajava.javacore.JDBC.dominio.Producer;
import academy.devdojo.maratonajava.javacore.JDBC.repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        ProducerRepository.save(producer);


    }
}
