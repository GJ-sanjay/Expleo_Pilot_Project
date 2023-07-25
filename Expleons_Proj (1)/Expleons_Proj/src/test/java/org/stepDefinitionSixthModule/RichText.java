package org.stepDefinitionSixthModule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.repo.Market_Place;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RichText {
	
	WebDriver driver = new ChromeDriver();

	@Given("Launch cyclos website url {string}")
	public void launch_cyclos_website_url(String string) {
		driver.get(string);
		driver.manage().window().maximize();
		PageFactory.initElements(driver, Market_Place.class);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("Click on login button")
	public void click_on_login_button() throws InterruptedException {
		Market_Place.login.click();
	    
	}

	@When("Login with username and password")
	public void login_with_username_and_password() throws InterruptedException {
	    Market_Place.user.sendKeys("rubann");
	    Market_Place.pwd.sendKeys("ruban@1234");
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
	    Market_Place.submit.click();
	}

	@Then("Click on the Marketplace button")
	public void click_on_the_marketplace_button() throws InterruptedException {
		Thread.sleep(3000);
		Market_Place.marketplace.click();
		
	}

	@Given("Click on My Advertisement button")
	public void click_on_my_advertisement_button() throws InterruptedException {
		Thread.sleep(3000);
		Market_Place.my_adv.click();
	    
	}

	@When("Click on add new button")
	public void click_on_add_new_button() throws InterruptedException {
		Thread.sleep(3000);
		Market_Place.add_new.click();
	    
	}

	@When("Enter the name for advertisement")
	public void enter_the_name_for_advertisement() {
	    Market_Place.name.sendKeys("Demo User");
	}

	@When("Enter the category of advertisement")
	public void enter_the_category_of_advertisement() {
		Market_Place.category.click();
		Market_Place.musicians.click();
	    
	}

	@When("Enter the price of the advertisement")
	public void enter_the_price_of_the_advertisement() {
		Market_Place.price.sendKeys("100");
	    
	}

	@When("Enter the publication period of the advertisement")
	public void enter_the_publication_period_of_the_advertisement() {
		Market_Place.Begin_Date.sendKeys("07/21/2023");
		Market_Place.End_Date.sendKeys("08/12/2023");
	    
	}

	@When("Enter the rich text message in the description")
	public void enter_the_rich_text_message_in_the_description() {
		Market_Place.description.sendKeys("Demo usage of category 'Musicians' ");
	    
	}

	@Then("Click on the save button")
	public void click_on_the_save_button() {
		Market_Place.save.click();
	    
	}

}
