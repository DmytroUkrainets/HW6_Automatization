package ukma.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Task 1.1.2
 * Parameterized tests using JUnit 5
 *
 * @since 26.06.2024
 * @author Dmytro Ukrainets
 * @version 1.0
 */
public class ParameterizedTests {

    /**
     * Test addition, where parameter a and b should be more than 0.
     */
    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "2, 3, 5",
            "3, 4, 7"
    })
    void testAddition(int a, int b, int expected) {
        assumeTrue(a > 0 && b > 0, "a and b should be more than 0");
        assertEquals(expected, a + b);
    }

    /**
     * Test subtraction, where parameter a and b should be more than 0.
     */
    @ParameterizedTest
    @CsvSource({
            "1, 2, -1",
            "3, 3, 0",
            "7, 4, 3"
    })
    void testSubtraction(int a, int b, int expected) {
        assumeTrue(a > 0 && b > 0, "a and b should be more than 0");
        assertEquals(expected, a - b);
    }

    /**
     * Test multiplication, where a should be more or equals to b.
     */
    @ParameterizedTest
    @CsvSource({
            "1, -2, -2",
            "3, 3, 9",
            "7, 0, 0"
    })
    void testMultiplication(int a, int b, int expected) {
        assumeTrue(a >= b, "a should be more or equals to b");
        assertEquals(expected, a * b);
    }

    /**
     * Test dividing, where divisor (b) should not be zero.
     */
    @ParameterizedTest
    @CsvSource({
            "4, 2, 2",
            "3, 3, 1",
            "0, 7, 0"
    })
    void testDividing(int a, int b, int expected) {
        assumeTrue(b != 0, "The divisor (b) should not be zero");
        assertEquals(expected, a / b);
    }
}
