package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginWithDataStepDef {
	
	WebDriver dr;
	
	@Given("^user is on  login page$")
	public void user_is_on_login_page() throws Throwable {
		
		dr = new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^the user enters the valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_the_valid_credentials_and(String username, String password) throws Throwable {
		
		dr.findElement(By.id("txtUsername")).sendKeys(username);
		dr.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^clicks on  login button$")
	public void clicks_on_login_button() throws Throwable {
		
		dr.findElement(By.id("btnLogin")).click();
	}

	@Then("^the user should come to the home page$")
	public void the_user_should_come_to_the_home_page() throws Throwable {
		
		boolean status = dr.findElement(By.linkText("Welcome Admin")).isDisplayed();
		Assert.assertTrue(status);
	}



}
