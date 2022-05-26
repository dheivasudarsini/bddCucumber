package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithHeaderDef {
	
	WebDriver dr;
	
	@Given("^the  login page will be displayed$")
	public void the_login_page_will_be_displayed() throws Throwable {
		
		dr = new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}

	@When("^enter the valid below credentials$")
	public void enter_the_valid_below_credentials(DataTable dataTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<Map<String, String>> cre = dataTable.asMaps(String.class, String.class);
		
		String uName= cre.get(0).get("username");
		String pWord= cre.get(0).get("password");
			
		
		dr.findElement(By.id("txtUsername")).sendKeys(uName);
		dr.findElement(By.id("txtPassword")).sendKeys(pWord);

	}

	@When("^click on the login$")
	public void click_on_the_login() throws Throwable {
		
		dr.findElement(By.id("btnLogin")).click();

	}



}
