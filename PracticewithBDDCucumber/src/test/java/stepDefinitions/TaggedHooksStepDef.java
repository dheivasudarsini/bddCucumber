package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDef {

	
	@Given("^this is the first step$")
	public void this_is_the_first_step() throws Throwable {
		
		System.out.println("this is the first step");
	}

	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable {
		
		System.out.println("this is the second step");
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable {
		
		System.out.println("this is the third step");
	}


}
