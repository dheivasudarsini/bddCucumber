package stepDefinitions;

import cucumber.api.java.en.Given;

public class ExpressionsStepDefinitions {
	
	@Given("^I have (\\d+) Eyes$")
	public void i_have_Eyes(int count) throws Throwable {
		System.out.println("Eyes count" +count);
	    
	}

	@Given("^I have (\\d+\\.\\d+) hours to go$")
	public void i_have_hours_to_go(float count) throws Throwable {
		System.out.println("Hours count" + count);
	   
	}

	@Given("^\"(.*?)\" is younger to \"(.*?)\"$")
	public void is_younger_to(String name1, String name2) throws Throwable {
		System.out.println(name1 + "is younger to" + name2);
	    
	}



}
