package ukma.cucumber;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Task 1.2
 * Script and its validation through a set of tabular values using Cucumber
 *
 * @since 26.06.2024
 * @author Dmytro Ukrainets
 * @version 1.0
 */
public class CalculatorSteps {

    private int result; // Result of calculating

    /**
     * Initializing of calculator.
     */
    @Given("I have a calculator")
    public void iHaveACalculator() {
    }

    /**
     * Add one number to another.
     */
    @When("I add {int} and {int}")
    public void iAddAnd(int a, int b) {
        this.result = a + b;
    }

    /**
     * Subtract one number from another.
     */
    @When("I subtract {int} from {int}")
    public void iSubtractBFromA(int b, int a) {
        this.result = a - b;
    }

    /**
     * Check actual result with expected one.
     */
    @Then("the result should be {int}")
    public void theResultShouldBe(int expected) {
        assertEquals(expected, result);
    }
}
