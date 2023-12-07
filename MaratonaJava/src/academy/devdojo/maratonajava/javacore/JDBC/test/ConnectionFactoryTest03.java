package academy.devdojo.maratonajava.javacore.JDBC.test;

import academy.devdojo.maratonajava.javacore.JDBC.dominio.Producer;
import academy.devdojo.maratonajava.javacore.JDBC.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTest03 {
    public static void main(String[] args) {

        Producer producer1 = Producer.builder().name("Toei Animation").build();
        Producer producer2 = Producer.builder().name("While fox").build();
        Producer producer3 = Producer.builder().name("Studio Ghibli").build();
        ProducerService.saveTransactions(List.of(producer1,producer2,producer3));

    }
}
