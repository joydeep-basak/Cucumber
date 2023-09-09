package com.joydeep.definition;

import java.io.IOException;

import org.junit.internal.runners.InitializationError;
import org.junit.runner.JUnitCore;

//import com.joydeep.service.App;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.ClassFinder;
import cucumber.runtime.RuntimeOptions;
import cucumber.runtime.io.ResourceLoader;
import cucumber.runtime.io.ResourceLoaderClassFinder;

public class ScenarioCuke {
    //private App app;
    private int waitingTime;

    @Given("^I have (\\d+) cukes in my belly$")
    public void i_have_cukes_in_my_belly(int cukes) throws Throwable {
    	System.out.println("I have " + cukes + " cukes in my belly");
       
    }
    
   

    @When("^I call (.*) from this step$")
    public void i_call_Plugin_from_this_step(String param) throws Throwable {
        System.out.println("-- Param Name ----" + param);
    }
    
    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int waitingTime) throws Throwable {
    	System.out.println("----------- I wait for " + waitingTime + "  ------------");
        this.waitingTime = waitingTime;
        System.out.println("--------- Going to call ------- another feature file ----");
    }

    @Then("^my belly should (.*)$")
    public void my_belly_should_growl(String expectedSound) throws Throwable {
    	//app.getStep3();
    	System.out.println("my belly should " + expectedSound);
    }
    
}