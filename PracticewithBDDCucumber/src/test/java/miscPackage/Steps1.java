package miscPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Steps1 {
	

	public WebDriver driver;

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		driver = new ChromeDriver();
	}

	@When("User opens a URL {string}")
	public void user_opens_a_url(String url) {
		driver.get(url);
	}

	@When("User enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
	}

	@When("Click on Login Button")
	public void click_on_login_button() {
		driver.findElement(By.id("submitButton")).click();
	}

	
	

}
