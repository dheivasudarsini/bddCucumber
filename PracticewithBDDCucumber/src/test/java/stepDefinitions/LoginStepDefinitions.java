package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinitions {
	
	WebDriver dr;
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		
		dr = new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^the user enters the valid username and password$")
	public void the_user_enters_the_valid_username_and_password() throws Throwable {
		
		dr.findElement(By.id("txtUsername")).sendKeys("Admin");
		dr.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("^clicks on the login button$")
	public void clicks_on_the_login_button() throws Throwable {
		
		dr.findElement(By.id("btnLogin")).click();
	}

	@Then("^the user should be navigates to the home page$")
	public void the_user_should_be_navigates_to_the_home_page() throws Throwable {
		
		boolean status = dr.findElement(By.linkText("Welcome fname-620801130")).isDisplayed();
		Assert.assertTrue(status);
	}



}
