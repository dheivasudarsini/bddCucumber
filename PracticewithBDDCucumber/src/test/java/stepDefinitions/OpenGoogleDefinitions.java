package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleDefinitions {
	
	
	WebDriver dr;
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
		
		dr = new ChromeDriver();
		dr.get("http://www.google.co.in");
	}

	@When("^user is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String searchTerm) throws Throwable {
	 
		
		dr.findElement(By.name("q")).sendKeys(searchTerm);
	}

	@When("^enters the return key$")
	public void enters_the_return_key() throws Throwable {
		
		dr.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("^the user sould see the search results$")
	public void the_user_sould_see_the_search_results() throws Throwable {
		
		boolean status = dr.findElement(By.partialLinkText("rose")).isDisplayed();
		if(status) {
			System.out.println("flower is found");
		}
	}



}
