package com.joydeep.definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppScenario {
	
	WebDriver driver;
	
	@Given("^Open the Chrome and launch the application$")
	public void open_the_Chrome_and_launch_the_application() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/");
	}

	@Given("^Welcome page will be displayed$")
	public void welcome_page_will_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User visit student list$")
	public void user_visit_student_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User input and submit student form$")
	public void user_input_and_submit_student_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User will see student list page$")
	public void user_will_see_student_list_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
