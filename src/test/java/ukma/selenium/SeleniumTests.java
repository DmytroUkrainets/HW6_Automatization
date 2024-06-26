package ukma.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.*;

/**
 * Task 1.3
 * Working with a web page and checking parameters on it (you cannot take the name of the page.
 * The web page of your choice, at least 3 different checks in 3 different tests) using Selenium
 *
 * @since 26.06.2024
 * @author Dmytro Ukrainets
 * @version 1.0
 */
class SeleniumTests {

    private WebDriver driver; // Web driver to search the Internet

    /**
     * Set up web driver with Chrome.
     */
    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    /**
     * Turn off web driver.
     */
    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * Checking the presence of an element with a certain ID.
     */
    @Test
    void testElementPresence() {
        driver.get("https://www.coursera.org/");
        WebElement element = driver.findElement(By.id("fb-root"));
        assertThat(element).isNotNull();
    }

    /**
     * Checking the attribute of an element with a certain ID.
     */
    @Test
    void testElementAttribute() {
        driver.get("https://www.coursera.org/specializations");
        WebElement element = driver.findElement(By.id("cds-react-aria-64"));
        String attributeValue = element.getAttribute("width");
        assertThat(attributeValue).isEqualTo("20");
    }

    /**
     * Checking the CSS property of an element with a specific class.
     */
    @Test
    void testElementCSSValue() {
        driver.get("https://www.coursera.org/campus");
        WebElement element = driver.findElement(By.className("css-uaseqi"));
        String cssValue = element.getCssValue("border");
        assertThat(cssValue).isEqualTo("0px none rgb(55, 58, 60)");
    }

    /**
     * Checking whether an element is displayed with a specific class.
     */
    @Test
    void testElementDisplayed() {
        driver.get("https://www.coursera.org/campus");
        WebElement element = driver.findElement(By.className("rc-MetatagsWrapper"));
        assertThat(element.isDisplayed()).isTrue();
    }
}
