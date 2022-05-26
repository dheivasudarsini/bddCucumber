package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithoutHeaderDef {
	
	WebDriver dr;
	
	@Given("^You are on  login page$")
	public void you_are_on_login_page() throws Throwable {
		
		dr = new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
	}

	@When("^you enter the valid credentials$")
	public void you_enter_the_valid_credentials(DataTable dataTable) throws Throwable {
		
		List<String> cre = dataTable.asList(String.class);
		String userName = cre.get(0);
		String passWord = cre.get(1);
		
		dr.findElement(By.id("txtUsername")).sendKeys(userName);
		dr.findElement(By.id("txtPassword")).sendKeys(passWord);
	}

	@When("^click on the login button$")
	public void click_on_the_login_button() throws Throwable {
		
		dr.findElement(By.id("btnLogin")).click();
		
		
	}



}
