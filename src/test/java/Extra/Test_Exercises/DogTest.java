package Extra.Test_Exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    Dog dog;
    Dog dog1;

    @BeforeEach
    void prepareData(){
        dog = new Dog("Bob", 4);
        dog1 = new Dog("Marley", 3);
    }

    @Test
    void getName() {
       assertEquals("Bob", dog.getName());
    }

    @Test
    void setName() {
        dog1.setName("King");
        assertEquals("King", dog1.getName());
    }

    @Test
    void getAge() {
        assertEquals(3, dog1.getAge());
    }

    @Test
    void setAge() {
        dog.setAge(5);
        assertEquals(5, dog.getAge());
    }
}