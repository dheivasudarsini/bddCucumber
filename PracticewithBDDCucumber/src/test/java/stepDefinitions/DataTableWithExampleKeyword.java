package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithExampleKeyword {
	
	WebDriver dr;

	
	@Given("^login page will be displayed$")
	public void login_page_will_be_displayed() throws Throwable {
		
		dr = new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}

	@When("^enter the  credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_credentials_and(String uName, String pWord) throws Throwable {
		
		dr.findElement(By.id("txtUsername")).sendKeys(uName);
		dr.findElement(By.id("txtPassword")).sendKeys(pWord);
	}

	@When("^click the login button$")
	public void click_the_login_button() throws Throwable {
		
		dr.findElement(By.id("btnLogin")).click();
	}


}
