package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signup {
	
	WebDriver driver;
		@Given("login page of upskill application should be  open")
		public void login_page_of_upskill_application_should_be_open() {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\PoolaSanjay\\Desktop\\SDET\\Software\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		    driver=new FirefoxDriver();
		    
		    driver.get("http://elearningm1.upskills.in/");
		}


		

		@When("verify the home page language is English")
		public void verify_the_home_page_language_is_english() {
			String Actual= driver.findElement(By.xpath("//button[@data-toggle='dropdown']")).getText();
			System.out.println("Acutual" +Actual);
			String Expected= "English";
			Assert.assertEquals(Actual, Expected);
			System.out.println("Home page panguage is English");
		   
		}
		@When("Click on Signup link")
		public void click_on_signup_link() {
			driver.findElement(By.xpath("//*[@class='nav nav-pills nav-stacked']/li[1]")).click();
		    
		}
		@Then("Registration page\\/form gets displayed")
		public void registration_page_form_gets_displayed() {
			String regis= driver.findElement(By.xpath("//*[@class='container']/ul/li")).getText();
			System.out.println("Registration form gets displayed as "+regis);
		    
		}




}
