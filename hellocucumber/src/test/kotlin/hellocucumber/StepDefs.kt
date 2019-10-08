package hellocucumber

import cucumber.api.java.en.Then
import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import junit.framework.Assert.assertEquals


fun isItFriday(today: String) = "Nope"


class StepDefs {
    private lateinit var today: String
    private lateinit var actualAnswer: String

    @Given("^today is Sunday$")
    fun today_is_Sunday() {
        today = "Sunday"
    }

    @When("^I ask whether it's Friday yet$")
    fun i_ask_whether_it_s_Friday_yet() {
        actualAnswer = isItFriday(today)
    }

    @Then("^I should be told \"([^\"]*)\"$")
    fun i_should_be_told(expectedAnswer: String) {
        assertEquals(expectedAnswer, actualAnswer)
    }
}