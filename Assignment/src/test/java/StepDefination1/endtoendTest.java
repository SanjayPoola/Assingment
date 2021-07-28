package StepDefination1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class endtoendTest {
	WebDriver driver;
	
	@Given("login page of upskill application should be  open")
	public void login_page_of_upskill_application_should_be_open() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PoolaSanjay\\Desktop\\SDET\\Software\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    
	    driver.navigate().to("http://elearningm1.upskills.in/");
	}


	

	@When("verify the home page language is English")
	public void verify_the_home_page_language_is_english() {
		String Actual= driver.findElement(By.xpath("//button[@data-toggle='dropdown']")).getText();
		System.out.println("Acutual" +Actual);
		String Expected= "English";
		Assert.assertEquals(Actual, Expected);
		System.out.println("Home page language is English");
	   
	}
	@When("Click on Signup link")
	public void click_on_signup_link() {
		driver.findElement(By.xpath("//*[@class='nav nav-pills nav-stacked']/li[1]")).click();
	    
	}
	@Then("Registration page\\/form gets displayed")
	public void registration_page_form_gets_displayed() throws InterruptedException {
		
		String regis= driver.findElement(By.xpath("//*[@class='container']/ul/li")).getText();
		System.out.println("Registration form gets displayed as "+regis);
		Thread.sleep(3000);
	    
	}
	
	
	    
		@Given("login to registration page form")
		public void login_to_registration_page_form() throws InterruptedException {
			Thread.sleep(5000);
			//System.out.println("second given method");
			//String regis= driver.findElement(By.xpath("//*[@class='container']/ul/li")).getText();
			//System.out.println("User should be in Registration form page "+regis);
			//driver.get("http://elearningm1.upskills.in/main/auth/inscription.php");
			//Thread.sleep(3000);
		}


		@When("Enter the firstname {string}")
		public void enter_the_firstname(String string) {
			System.out.println(string);
			driver.findElement(By.xpath("//*[@name='firstname']")).click();
			driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(string);
			
		    
		}
		@When("Enter the lastname {string}")
		public void enter_the_lastname(String string) {
			driver.findElement(By.id("registration_lastname")).sendKeys(string);
		}
		@When("Enter email id {string}")
		public void enter_email_id(String string) {
		    driver.findElement(By.id("registration_email")).sendKeys(string);
		}
		@When("Enter username {string}")
		public void enter_username(String string) {
		    driver.findElement(By.id("username")).sendKeys(string);
		}
		@When("Enter password {string}")
		public void enter_password(String string) {
			driver.findElement(By.id("pass1")).sendKeys(string);
		    
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
			System.out.println("Confiramtion");
		   /* System.out.println("Dear" +firstname +lastname+ "Your personal settings have been registered.\r\n"
		    		+ "\r\n"
		    		+ "			An e-mail has been sent to remind you of your login and password.\r\n"
		    		+ "\r\n"
		    		+ "			You can now select, in the list, the course you want access to");*/
		}



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
