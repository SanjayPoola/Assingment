package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registration {
	WebDriver driver;
	String firstname;
	String lastname;
		@Given("login to registration page form")
		public void login_to_registration_page_form() {
			String regis= driver.findElement(By.xpath("//*[@class='container']/ul/li")).getText();
			System.out.println("User should be in Registration form page "+regis);
		}


		

		@When("Enter the firstname {string}")
		public void enter_the_firstname(String firstname) {
			driver.findElement(By.id("registration_firstname")).sendKeys(firstname);
		    
		}
		@When("Enter the lastname {string}")
		public void enter_the_lastname(String lastname) {
			driver.findElement(By.id("registration_lastname")).sendKeys(lastname);
		}
		@When("Enter email id {string}")
		public void enter_email_id(String email) {
		    driver.findElement(By.id("registration_email")).sendKeys(email);
		}
		@When("Enter username {string}")
		public void enter_username(String username) {
		    driver.findElement(By.id("username")).sendKeys(username);
		}
		@When("Enter password {string}")
		public void enter_password(String password) {
			driver.findElement(By.id("pass1")).sendKeys(password);
		    
		}
		@When("Enter confirm password")
		public void enter_confirm_password() {
			driver.findElement(By.id("pass2")).sendKeys("Testing");
		    
		}
		@When("Click on Registration button")
		public void click_on_registration_button() {
			driver.findElement(By.id("registration_submit")).click();
		   
		}
		@Then("Confirmation message gets displayed")
		public void confirmation_message_gets_displayed() {
		    System.out.println("Dear" +firstname +lastname+ "Your personal settings have been registered.\r\n"
		    		+ "\r\n"
		    		+ "			An e-mail has been sent to remind you of your login and password.\r\n"
		    		+ "\r\n"
		    		+ "			You can now select, in the list, the course you want access to");
		}




}
