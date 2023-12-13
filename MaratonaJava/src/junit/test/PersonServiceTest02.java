package junit.test;

import junit.dominio.Person02;
import junit.service.PersonService02;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PersonServiceTest02 {
    public static void main(String[] args) {
        Person02 person02 = new Person02(18);
        PersonService02 personService02 = new PersonService02();
        log.info("is Adult? '{}'", personService02.isAdult(person02));
    }
}
