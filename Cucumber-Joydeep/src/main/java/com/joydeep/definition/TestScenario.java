package com.joydeep.definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestScenario {

	@Given("^I gave (\\d+) as input$")
	public void i_gave_as_input(int arg1) throws Throwable {
	    System.out.println("1st input " + arg1);
	}

	@When("^I give (\\d+) as input$")
	public void i_give_as_input(int arg1) throws Throwable {
		 System.out.println("2nd input " + arg1);
	}

	@Then("^my result will be (\\d+)$")
	public void my_result_will_be(int arg1) throws Throwable {
		System.out.println("output " + arg1);
	}
}
