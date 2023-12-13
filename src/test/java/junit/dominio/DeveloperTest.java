package junit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    @Test
    public void instanceOF_ExecutesChildClassMethod_WhenObjectIsOfChildType() {
        //Employee employeeDeveloper = new Developer("1","Java");
        Employee employeeDeveloper = new Employee("1");
        if(employeeDeveloper instanceof Developer){
            Developer developer = (Developer) employeeDeveloper;
            Assertions.assertEquals("Java",developer.getMainLanguage());
        }

        if (employeeDeveloper instanceof Developer developer){
            Assertions.assertEquals("Java",developer.getMainLanguage());
        }

    }

}