package StepDefination;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sendemail {
	
	WebDriver driver;
	String email;
		@Given("Click on Home page")
		public void click_on_home_page() {
	 driver.findElement(By.xpath("//a[@title='Homepage']")).click();
		    
		}


		

		@When("Click on Compose link from left side menu")
		public void click_on_compose_link_from_left_side_menu() {
			driver.findElement(By.xpath("//a[contains (text(), 'Compose')]")).click();
					
		    
		}
		@When("Enter email id as {string}")
		public void enter_email_id_as(String email) {
			driver.findElement(By.xpath("//input[@placeholder= 'Please select an option']")).sendKeys(email);
		   
		}
		@When("Enter subject as {string}")
		public void enter_subject_as(String subject) {
			driver.findElement(By.id("compose_message_title")).sendKeys(subject);
		    
		}
		@When("Enter message as {string}")
		public void enter_message_as(String message) {
			driver.findElement(By.xpath("//html/body/p")).sendKeys(message);
		    
		}
		@When("Click on Send Message")
		public void click_on_send_message() {
			driver.findElement(By.id("compose_message_compose")).click();


		}
		@Then("Acknowledge message gets displayed {string}")
		public void acknowledge_message_gets_displayed(String string) {
			String text1= driver.findElement(By.xpath("//div[@class ='alert alert-success']")).getText();
			System.out.println("The message has been sent to "+email);
		    
		}




}
