package Extra.Test_Exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    /* Аннотация метода, который должен быть выполнен
       перед каждым тестом.
    */
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void sum() {
        int sum = calculator.sum(10, 15);
        Assertions.assertEquals(25, sum);
    }

    @Test
    void evenOrOdd_evenNumber() {
        boolean even = calculator.evenOrOdd(10);
        Assertions.assertTrue(even);
    }

    @Test
    void evenOrOdd_oddNumber() {
        boolean odd = calculator.evenOrOdd(15);
        Assertions.assertFalse(odd);
    }

    @Test
    void divide(){
        double result = calculator.divide(10, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    void divideByZero(){
    Assertions.assertThrows(ArithmeticException.class, () ->
                            calculator.divide(10, 0));
    }

}
