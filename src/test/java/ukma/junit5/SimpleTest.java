package ukma.junit5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Task 1.1.2
 * Simple tests using JUnit 5
 *
 * @since 26.06.2024
 * @author Dmytro Ukrainets
 * @version 1.0
 */
class SimpleTest {

    /**
     * Test summing, where parameter a should be more than b.
     */
    @Test
    void testSum() {
        int a = 45;
        int b = 15;

        // Task 2. Use Assumptions
        assumeTrue(a > b, "a should be more than b");

        int result = a + b;

        assertEquals(60, result, "Sum should be 60");
    }

    /**
     * Test difference, where parameter a should be more than b.
     */
    @Test
    void testDifference() {
        int a = 45;
        int b = 15;

        // Task 2. Use Assumptions
        assumeTrue(a > b, "a should be more than b");

        int result = a - b;

        assertEquals(30, result, "Difference should be -30");
    }

    /**
     * Test multiplication, where parameter a should not equal to b.
     */
    @Test
    void testMultiplication() {
        int a = 2;
        int b = 5;

        // Task 2. Use Assumptions
        assumeTrue(a != b, "a should not equal to b");

        int result = a * b;

        assertEquals(10, result, "Multiplication should be 10");
    }

    /**
     * Test dividing, where parameter b should not equal to 0.
     */
    @Test
    void testDividing() {
        int a = 10;
        int b = 2;

        // Task 2. Use Assumptions
        assumeTrue(b != 0, "The divisor (b) should not be zero");

        int result = a / b;

        assertEquals(5, result, "Dividing should be 5");
    }

    /**
     * Task 3
     * Test start and end of a string.
     */
    @Test
    void testStartAndEnd() {
        String actual = "My name is Dmytro Ukrainets";
        assertThat(actual)
                .isNotEmpty()
                .startsWith("My")
                .endsWith("Ukrainets");
    }

    /**
     * Task 3
     * Test containing substring in a string.
     */
    @Test
    void testContains() {
        String actual = "My name is Dmytro Ukrainets";
        assertThat(actual)
                .isNotEmpty()
                .contains("Dmytro Ukrainets");
    }
}
