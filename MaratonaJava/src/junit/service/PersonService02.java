package junit.service;

import junit.dominio.Person02;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PersonService02 {
    public boolean isAdult(Person02 person02) {
        //Objects.requireNonNull(person02,"Person can't be null");

        if(person02 == null){
            throw new IllegalArgumentException();
        }
        return person02.getAge() >= 18;
    }

    public List<Person02> filterRemovingNotAdult(List<Person02>person02List){
        return person02List.stream().filter(this::isAdult).collect(Collectors.toList());
    }

}
