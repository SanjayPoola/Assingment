package StepDefination;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class user_details {
	  WebDriver driver;
		@Given("validate user details in home page")
		public void validate_user_details_in_home_page() {
						
		   
		}



		@When("verify user entered email is correct")
		public void verify_user_entered_email_is_correct() {
			driver.findElement(By.className("dropdown-toggle")).click(); //Click on drop down
			
			String mail = driver.findElement(By.xpath("//p[contains (text(), '@gmail')]")).getText();
			System.out.println("Entered user email id is "+mail);
			//Select s= new Select(driver.findElement(By.xpath("//p[contains (text(), '@gmail')]")));
			//s.selectByVisibleText("@gmail");
			
			
		    
		}
		@Then("confirm user details")
		public void confirm_user_details() {
			System.out.println("User is logged in successfully");
		  
		}




}
