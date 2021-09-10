package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps {
	
	WebDriver driver;
	
	@Given("I open the site {string}")
	public void i_open_the_site(String site) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\92\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
	
	}

	@Then("I validate the page")
	public void i_validate_the_page() {
		driver.quit();
	  
	}


}
