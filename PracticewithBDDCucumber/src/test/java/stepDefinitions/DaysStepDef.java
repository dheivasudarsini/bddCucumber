package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DaysStepDef {
	
	@Given("^today is sunday$")
	public void today_is_sunday() throws Throwable {
		System.out.println("today is sunday");

	}

	@When("^tomorrow is monday$")
	public void tomorrow_is_monday() throws Throwable {
		System.out.println("tomorrow is monday");
	}

	
	@Then("^day after tomorrow is tuesday$")
	public void day_after_tomorrow_is_tuesday() throws Throwable {
		System.out.println("day after tomorrow is tuesday");
	}



}
