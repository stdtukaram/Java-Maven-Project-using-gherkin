package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTest {
	
	WebDriver driver; 
	
	@Given("^Open the chrome and start the application$")
	public void open_the_chrome_and_start_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Drive_DtoE_copy\\SeleniumBala\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/login/");
	   
	}

	@When("^I enter valid username and password$")
	public void i_enter_valid_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("email")).sendKeys("stdtukaram@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Saisamarth@123");
		
	    
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	    
	}
	

}
