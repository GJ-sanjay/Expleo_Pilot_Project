package org.stepDefinitionFifthModule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.repo.AlertsAndLoggingRepo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AlertsAndLogging {

	WebDriver driver=new ChromeDriver();
	
	@Given("Launch the given url {string}")
	public void launch_the_given_url(String string) {

		driver.get(string); 
		driver.manage().window().maximize();
		PageFactory.initElements(driver,AlertsAndLoggingRepo.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@When("Click on the login button")
	public void click_on_the_login_button() throws InterruptedException {
		
		AlertsAndLoggingRepo.login.click();

	}

	@When("Login with the username {string} and password {string}")
	public void login_with_the_username_and_password(String user, String password) { 
		AlertsAndLoggingRepo.uname.sendKeys(user);
		AlertsAndLoggingRepo.pwd.sendKeys(password);

	}

	@When("Click  submit button with valid credentials")
	public void click_submit_button_with_valid_credentials() {
		AlertsAndLoggingRepo.submit.click();

	}

	@Then("Click Marketplace button")
	public void click_marketplace_button() throws InterruptedException {
		Thread.sleep(4000);
		AlertsAndLoggingRepo.marketPlace.click();
	}

	@Given("Click on the Advertisements button")
	public void click_on_the_advertisements_button() {
		AlertsAndLoggingRepo.advertisements.click();
	}

	@Given("Click on show advertisements")
	public void click_on_show_advertisements() {
		AlertsAndLoggingRepo.show_adv.click();

	}

	@When("Select the required product")
	public void select_the_required_product() {
		AlertsAndLoggingRepo.select_adv.click();
	}

	@When("Click on ask a question")
	public void click_on_ask_a_question() {
		AlertsAndLoggingRepo.ask_qsn.click();

	}

	@When("Enter the question on the alert box as {string}")
	public void enter_the_question_on_the_alert_box_as(String string) {
		AlertsAndLoggingRepo.question.sendKeys(string);

	}

	@Then("Click submit button")
	public void click_submit_button() {
		AlertsAndLoggingRepo.submit1.click();

	}

}
