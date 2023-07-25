package org.stepDefinitionFourthModule;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.repo.Messaging;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class new_message {
	
	WebDriver driver=new ChromeDriver();
	
	@Given("Launch the url {string}")
	public void launch_the_url(String string) {
		
		driver.get(string); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver,Messaging.class);
	}

	@When("Click login button")
	public void click_login_button() throws InterruptedException {
		Actions act=new Actions(driver);
		act.click(Messaging.login).perform();
	    
	}

	@When("Login with username {string} and password {string}")
	public void login_with_username_and_password(String user, String password) throws InterruptedException {
		Messaging.username.sendKeys(user);
		Messaging.password.sendKeys(password);
	   
	}

	@When("Click submit with valid credentials")
	public void click_submit_with_valid_credentials() {
		Messaging.submit.click();
	    
	}

	@When("Click messages icon")
	public void click_messages_icon() throws InterruptedException {
		Actions act=new Actions(driver);
		act.click(Messaging.message_icon).perform();
		//Messaging.message_icon.click();
	    
	}

	@When("Click new messages button")
	public void click_new_messages_button() throws InterruptedException {
	    Messaging.new_message.click();
	}

	@When("Sent to {string} for rich text message")
	public void sent_to_for_rich_text_message(String string) throws InterruptedException {
	    Messaging.Sent_to.click();
	    List<WebElement> list = driver.findElements(By.xpath("//div[@role='listbox']//a"));
	    Thread.sleep(5000);
	    for (WebElement itr : list) {
	    	if(itr.getText().equals("User")) {
	    		itr.click();
	    	}	
	    }	
	}

	@When("Enter the To User name")
	public void enter_the_to_user_name() throws InterruptedException {
		Messaging.to_user.click();
		Messaging.hotel_oasis.click();
	}

	@When("Enter the subject of the message as {string}")
	public void enter_the_subject_of_the_message_as(String string) throws InterruptedException {
	    Messaging.subject.sendKeys("Banking");
	}

	@When("Enter the rich text message on the textbox")
	public void enter_the_rich_text_message_on_the_textbox() {
		Messaging.description.sendKeys("Request for loan");
	    
	}

	@Then("Click send button")
	public void click_send_button() {
	    Messaging.send.click();
	}


}
