package org.stepDefinitionFirstModule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.repo.Payment;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PaymentToSystem {
	public static WebDriver driver;
	@When("The user launches the url")
	public void the_user_launches_the_url() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
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
		wait.until(ExpectedConditions.visibilityOf(Payment.bank));

		
	}

	@When("login to the website")
	public void login_to_the_website() {
	    
		
		
	}

	@When("goes into banking tab")
	public void goes_into_banking_tab() throws InterruptedException {
		Thread.sleep(5000);
		Payment.bank.click();
	}

	@When("clicks on Payment to System")
	public void clicks_on_payment_to_system() throws InterruptedException {
	    Thread.sleep(7000);
	    Payment.ptsys.click();
	}

	@When("User enter the amount")
	public void user_enter_the_amount() throws InterruptedException {
		Thread.sleep(2000);
		Payment.amount.sendKeys("1");
	}

	@When("user selects the scheduled option")
	public void user_selects_the_scheduled_option() throws InterruptedException {
		Thread.sleep(5000);
		Payment.pay_now.click();
		Thread.sleep(1000);
		Payment.scheduled.click();
	    
	}

	@When("Enter the date")
	public void enter_the_date() throws InterruptedException {
		Payment.date.sendKeys("07/31/2023");
		Payment.next.click();
		Thread.sleep(2000);
		Payment.confirm.click();
		Thread.sleep(5000);
		boolean displayed = Payment.failure.isDisplayed();
		if(displayed) {
			System.out.println(Payment.failure.getText());
		}
		else {
			String text = Payment.success.getText();
			System.out.println(text);
		}
	    
	}

	@When("user selects the Monthly Installment option")
	public void user_selects_the_monthly_installment_option() throws InterruptedException {
		Thread.sleep(5000);
		Payment.pay_now.click();
		Thread.sleep(1000);
		Payment.mi.click();
	}

	@When("user enters the number of installments")
	public void user_enters_the_number_of_installments() throws InterruptedException {
	   Thread.sleep(1000);
	   Payment.noi.sendKeys("2");
	   
	}

	@When("clicks on now")
	public void clicks_on_now() throws InterruptedException {
	    
		Payment.first_installment.click();
		Payment.next.click();
		Thread.sleep(2000);
		Payment.confirm.click();
		Thread.sleep(5000);
		boolean displayed = Payment.failure.isDisplayed();
		if(displayed) {
			System.out.println(Payment.failure.getText());
		}
		else {
			String text = Payment.success.getText();
			System.out.println(text);
		}
	    
	}



}
