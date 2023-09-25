import static org.junit.jupiter.api.Assertions.*;

import Day1.example1;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {

    @Test
    public void testCalculateFactorialForZero() {

        assertEquals(1, example1.calculateFactorial(0));
    }

    @Test
    public void testCalculateFactorialForOne() {
        assertEquals(1, example1.calculateFactorial(1));
    }

    @Test
    public void testCalculateFactorialForPositiveNumber() {
        assertEquals(120, example1.calculateFactorial(5));
    }

    @Test
    public void testCalculateFactorialForNegativeNumber() {
        assertEquals(-1, example1.calculateFactorial(-5));
    }
}
