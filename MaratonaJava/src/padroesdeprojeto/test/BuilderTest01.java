package padroesdeprojeto.test;

import padroesdeprojeto.dominio.Person;

public class BuilderTest01 {

    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("William")
                .lastName("Suane")
                .username("ViradoNoJiraya")
                .email("william.suane@devdojo.academy")
                .build();

        System.out.println(build);


    }
}
