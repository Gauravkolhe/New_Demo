package StepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	
	WebDriver driver;
	
	@Given("the user is on the nopcommerce login page")
	public void the_user_is_on_the_nopcommerce_login_page() {

	driver=new ChromeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	System.out.println("the user is on the nopcommerce login page");
	
	}

	@When("the user enters valid credentials \\(username:{string}, password:{string})")
	public void the_user_enters_valid_credentials_username_password(String email, String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pwd);
   
		System.out.println("the user enters valid credentials");

	}

	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
		
		System.out.println("the user clicks on the Login button");


		
	}

	@Then("the user should be redirected to the My Account Page")
	public void the_user_should_be_redirected_to_the_my_account_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		boolean status=driver.findElement(By.xpath("//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-home menu-item-43\"]")).isDisplayed();
		
	      Assert.assertEquals(status, true);
	      
	      
			System.out.println("the user should be redirected to the My Account Page");


		
	    }

	@Then("the user should see a welcome message")
	public void the_user_should_see_a_welcome_message() {
	    // Write code here that turns the phrase above into concrete actions
		
		
		boolean Second_status=driver.findElement(By.xpath("//h1[@class=\"post-title\"]")).isDisplayed();
		
		System.out.println("the user should see a welcome message");

		
	      Assert.assertEquals(Second_status, true);
		  driver.close();
		
	   
	}

}
