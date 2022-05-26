package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundStepDef {
	
	@Given("^the student completes the high school$")
	public void the_student_completes_the_high_school() throws Throwable {
		
		System.out.println("the student completes the high school");
	}

	@Given("^the student completes the higher secondary school$")
	public void the_student_completes_the_higher_secondary_school() throws Throwable {
		System.out.println("the student completes the higher secondary school");

	}


	
	@Given("^the student applies for the medical course$")
	public void the_student_applies_for_the_medical_course() throws Throwable {
		System.out.println("the student applies for the medical course");
	}

	@When("^the student clears the entrance exam$")
	public void the_student_clears_the_entrance_exam() throws Throwable {
		System.out.println("the student clears the entrance exam");
	}

	@Then("^the student is eligible for joining any medical colleges$")
	public void the_student_is_eligible_for_joining_any_medical_colleges() throws Throwable {
		System.out.println("the student is eligible for joining any medical colleges");
	}

	@Given("^the student applies for the engineering course$")
	public void the_student_applies_for_the_engineering_course() throws Throwable {
		System.out.println("the student applies for the engineering course");
	}

	@When("^the student has the eligible cut off$")
	public void the_student_has_the_eligible_cut_off() throws Throwable {
		System.out.println("the student has the eligible cut off");
	}

	@Then("^the student is eligible for joining in any engineering colleges$")
	public void the_student_is_eligible_for_joining_in_any_engineering_colleges() throws Throwable {
		System.out.println("the student is eligible for joining in any engineering colleges");
	}



}
