package junit.service;

import junit.dominio.Person02;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    private Person02 adult = new Person02(18);
    private Person02 notAdult;
    private PersonService02 personService02;

    @BeforeEach

    public void setUp() {
        adult = new Person02(18);
        notAdult = new Person02(15);
        personService02 = new PersonService02();
    }

    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void isNotAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        assertFalse(personService02.isAdult(notAdult));

    }

    @Test
    @DisplayName("A person should be adult when age is greater or equal than 18")
    void isAdult_ReturnTrue_WhenAgeIsGreaterOrEqualsThan18() {
        assertTrue(personService02.isAdult(adult));

    }

    @Test
    @DisplayName("Should Throw NullPointerException with message when person is null")
    void isAdult_ShouldThrowException_WhenPersonIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> personService02.isAdult(null), "Person can't be null");

    }

    @Test
    @DisplayName("Should return list with only adults")
    void filterRemovingNotAdult_ReturnListWithAdultOnly_WhenListOfPersonWithAdultIsPassed() {
        Person02 person03 = new Person02(17);
        Person02 person04 = new Person02(18);
        Person02 person05 = new Person02(21);
        List<Person02> personList = List.of(person03, person04, person05);
        Assertions.assertEquals(2,personService02.filterRemovingNotAdult(personList).size());


    }
}