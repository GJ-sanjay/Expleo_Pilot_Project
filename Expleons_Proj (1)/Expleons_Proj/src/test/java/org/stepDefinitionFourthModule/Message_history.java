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

public class Message_history {

	WebDriver driver = new ChromeDriver();

	@Given("Launch the cyclos url {string}")
	public void launch_the_cyclos_url(String string) {
		driver.get(string);
		driver.manage().window().maximize();
		PageFactory.initElements(driver, Messaging.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@When("Click the login button")
	public void click_the_login_button() {
		//click login
		Messaging.login.click();
	}

	@When("Login with username as {string} and password as {string}")
	public void login_with_username_as_and_password_as(String user, String password) {
		//send username and password
		Messaging.username.sendKeys(user);
		Messaging.password.sendKeys(password);

	}

	@When("Click submit with valid username and password")
	public void click_submit_with_valid_username_and_password() {
		Messaging.submit.click();
	}

	@When("Click the messages icon")
	public void click_the_messages_icon() {
		Messaging.message_icon.click();

	}

	@Given("Click the inbox radio button")
	public void click_the_inbox_radio_button() {
		Messaging.inbox.click();

	}

	@When("Select the user from dropdown")
	public void select_the_user_from_dropdown() {
	  
	  Messaging.from.click();
	  Messaging.from_user.click();
	}

	@When("Enter the Keyword for index as {string}")
	public void enter_the_keyword_for_index_as(String string) {
		Messaging.keyword1.sendKeys(string);

	}

	@When("Enter the user as {string}")
	public void enter_the_user_as(String string) throws InterruptedException {
		Messaging.User.click();
		List<WebElement> list1=driver.findElements(By.xpath("//div[@role='listbox']//a"));
		Thread.sleep(3000);
		for (WebElement itr : list1) {
			if(itr.getText().equals("Active Walking")) {
				itr.click();
			}
		}
	}

	@Then("Click the inbox message history")
	public void click_the_inbox_message_history() {
		System.out.println(Messaging.inbox_result.getText());

	}

	@Given("Click the sent radio button")
	public void click_the_sent_radio_button() {
		Messaging.sent.click();

	}

	@When("Select sent to as user")
	public void select_sent_to_as_user() {
		Messaging.sent_user.click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@role='listbox']//a"));
	  	for (WebElement itr : list) { 
	  		if(itr.getText().equals("User")) { 
	  			itr.click(); 
	  			} 
	  		}
		}

	@When("Enter the Keyword for sent as {string}")
	public void enter_the_keyword_for_sent_as(String string) {
		Messaging.Keyword.sendKeys(string);

	}

	@When("Select the user as {string}")
	public void select_the_user_as(String string) throws InterruptedException {
		Messaging.User.sendKeys(string);
		Thread.sleep(2000);
		Messaging.CarRepair.click();

	}

	@Then("Click the sent message history")
	public void click_the_sent_message_history() {
		System.out.println(Messaging.sent_result.getText());
		Messaging.sent_result.click();

	}

	@Given("Click the trash radio button")
	public void click_the_trash_radio_button() {
		Messaging.trash.click();
	}

	@When("Select the sent to as administration")
	public void select_the_sent_to_as_administration() {
		List<WebElement> list = driver.findElements(By.xpath("//div[@role='listbox']//a"));
	  	for (WebElement itr : list) { 
	  		if(itr.getText().equals(" Administration ")) { 
	  			itr.click(); 
	  			} 
	  		}
		}

	@When("Enter the keyword of trash as {string}")
	public void enter_the_keyword_of_trash_as(String string) {
		Messaging.Keyword.sendKeys(string);

	}

	@Then("Click the trash message history")
	public void click_the_trash_message_history() {
		System.out.println(Messaging.trash_result.getText());
		Messaging.trash_result.click();

	}

}
