package org.stepDefinitionFirstModule;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.repo.Payment;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PaymentRequest {
	public static WebDriver driver;
	@Given("The user logs in and switches to banking and clicks on payment request and selects send a new request")
	public void the_user_logs_in_and_switches_to_banking_and_clicks_on_payment_request_and_selects_send_a_new_request() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.cyclos.org/ui/home");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(driver, Payment.class);
		wait.until(ExpectedConditions.visibilityOf(Payment.login));
		Payment.login.click();
		wait.until(ExpectedConditions.visibilityOf(Payment.username));
		Payment.username.sendKeys("Demo");
		wait.until(ExpectedConditions.visibilityOf(Payment.password));
		Payment.password.sendKeys("1234");
		wait.until(ExpectedConditions.visibilityOf(Payment.submit));
		Payment.submit.click();
		Thread.sleep(5000);
		Payment.bank.click();
		Thread.sleep(5000);
		Payment.preq.click();
		Thread.sleep(5000);
		Payment.send_new_req.click();
		}

	@Given("selects user from contact book")
	public void selects_user_from_contact_book() throws InterruptedException {
		Thread.sleep(2000);
		Payment.cb_pr.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(Payment.user));
		Payment.user.click();

	    
	}

	@Given("enters amount then sends date")
	public void enters_amount_then_sends_date() throws InterruptedException {
		Payment.amount.sendKeys("1");
		Thread.sleep(1000);
		Payment.date.sendKeys("07/31/2023");
		Payment.pay_now.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(Payment.rec_pay));
		Payment.rec_pay.click();
		
	    
	}

	@Given("clicks on Recurring payment")
	public void clicks_on_recurring_payment() throws InterruptedException {
		Thread.sleep(2000);
		Payment.first_occur.click();
		Payment.desc.sendKeys("Tips");
		
	    
	}

	@Given("clicks on first occurence")
	public void clicks_on_first_occurence() throws InterruptedException {
		
	    
	}

	@Given("sends Description for the payment")
	public void sends_description_for_the_payment() {
	    
	}

	@Given("clicks on confirm")
	public void clicks_on_confirm() {
		Payment.confirm.click();
	    
	}

	@Given("clicks on confirm again")
	public void clicks_on_confirm_again() throws InterruptedException {
		Thread.sleep(5000);
	    Payment.confirm2.click();
	}

	@Then("Checks if it is successfully sent")
	public void checks_if_it_is_successfully_sent() throws InterruptedException {
	    Thread.sleep(5000);
	    boolean displayed = Payment.suc_sent.isDisplayed();
	    if(displayed) {
	    	System.out.println("Status : "+Payment.suc_sent.getText());
	    	
	    }
	}



}
