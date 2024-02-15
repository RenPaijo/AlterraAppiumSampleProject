package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class MathsStepDefinitions extends BaseTest {

    @Given("a is {string}")
    public void givenAIs(String value) {
        calculatorPage.inputNumbers(value);
    }

    @Given("b is {string}")
    public void givenBIs(String value) {
        calculatorPage.inputNumbers2(value);
    }

    @When("I run the operation a and b")
    public void iAddAAndB() {
        calculatorPage.calculate();
    }

    @Then("the total should be {string}")
    public void theTotalShouldBe(String expectedTotal) throws InterruptedException {
        assertThat(calculatorPage.total()).isEqualTo(expectedTotal);
        Thread.sleep(500);
    }

    @When("converts the operation to division")
    public void convertsTheOperationToDivision() {
        calculatorPage.dropDown();
        calculatorPage.divide();
    }

    @When("converts the operation to multiply")
    public void convertsTheOperationToMultiply() {
        calculatorPage.dropDown();
        calculatorPage.multiply();
    }

    @When("converts the operation to subtract")
    public void convertsTheOperationToSubtracts() {
        calculatorPage.dropDown();
        calculatorPage.subtraction();
    }
}
