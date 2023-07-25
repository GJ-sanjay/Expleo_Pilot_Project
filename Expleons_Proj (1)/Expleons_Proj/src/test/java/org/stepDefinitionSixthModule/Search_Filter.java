package org.stepDefinitionSixthModule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.repo.Market_Place;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_Filter {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("Launch the url of cyclos application {string}")
	public void launch_the_url_of_cyclos_application(String string) {
		
		  driver.get(string); 
		  driver.manage().window().maximize();
		  PageFactory.initElements(driver, Market_Place.class);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
	    
	}

	@When("Click on the login icon")
	public void click_on_the_login_icon() {
		Market_Place.login.click();
	}

	@When("Login with the username and password")
	public void login_with_the_username_and_password() {
	    Market_Place.user.sendKeys("rubann");
	    Market_Place.pwd.sendKeys("ruban@1234");
	}

	@When("User should click on submit")
	public void user_should_click_on_submit() {
		Market_Place.submit.click();
	    
	}

	@Then("User should click on the Marketplace button")
	public void user_should_click_on_the_marketplace_button() throws InterruptedException {
		Thread.sleep(5000);
		Market_Place.marketplace.click();
	    
	}

	@Given("Click on the advertisements")
	public void click_on_the_advertisements() throws InterruptedException {
		Thread.sleep(3000);
		Market_Place.Advertisement.click();
	    
	}

	@Given("Click on show more filter")
	public void click_on_show_more_filter() throws InterruptedException {
		Thread.sleep(5000);
		Market_Place.more_filter.click();
	    
	}

	@When("Enter {string} in the keyword textbox")
	public void enter_in_the_keyword_textbox(String string) {
		Market_Place.Keyword.sendKeys(string);
	    
	}

	@When("Click Favarites only checkbox")
	public void click_favarites_only_checkbox() {
		Market_Place.favarite.click();
	    
	}

	@When("Enter the minimum price as {string}")
	public void enter_the_minimum_price_as(String string) {
		Market_Place.min_price.sendKeys(string);
	    
	}

	@When("Enter the maximum price as {string}")
	public void enter_the_maximum_price_as(String string) {
		Market_Place.max_price.sendKeys(string);
	    
	}

	@Then("Click the advertisement under the filter")
	public void click_the_advertisement_under_the_filter() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println(Market_Place.cupcake.getText());
		Market_Place.cupcake.click();
		
	    
	}
	
}
