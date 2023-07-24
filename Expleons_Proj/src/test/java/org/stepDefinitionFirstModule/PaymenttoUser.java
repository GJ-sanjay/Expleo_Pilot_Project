package org.stepDefinitionFirstModule;

import java.time.Duration;
//import java.util.Iterator;
//import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.repo.Payment;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PaymenttoUser {
	public static WebDriver driver;

	@Given("User should be able to launch the cyclos website and login with the valid credentials")
	public void user_should_be_able_to_launch_the_cyclos_website_and_login_with_the_valid_credentials() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.cyclos.org/ui/home");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(driver, Payment.class);
		// explicit wait
		/*
		 * 
		 * 
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(Payment.product));
		 * Payment.product.click(); String parent=driver.getWindowHandle();
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(Payment.vod));
		 * Payment.vod.click(); Set<String>s=driver.getWindowHandles(); Iterator<String>
		 * I= s.iterator(); while(I.hasNext()) { String child_window=I.next();
		 * if(!parent.equals(child_window)) { driver.switchTo().window(child_window); }
		 * }
		 */
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

	@Given("user should click on banking tab")
	public void user_should_click_on_banking_tab() throws InterruptedException {
		Thread.sleep(5000);

		Payment.bank.click();

	}

	@Given("user should click on payment to user tab")
	public void user_should_click_on_payment_to_user_tab() throws InterruptedException {
		Thread.sleep(7000);
		Payment.pts.click();

	}

	@When("user selects the list of user and selects the particular user")
	public void user_selects_the_list_of_user_and_selects_the_particular_user() throws InterruptedException {
		Thread.sleep(6000);
		Payment.contact_book.click();
		Thread.sleep(5000);		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOf(Payment.user));
		Payment.user.click();


	}

	@When("click on amount field and enter amount to transfer")
	public void click_on_amount_field_and_enter_amount_to_transfer() throws InterruptedException {
		Thread.sleep(2000);
		Payment.amount.sendKeys("1");
		
		

	}

	@When("enter some description in the textbox")
	public void enter_some_description_in_the_textbox() {
		Payment.desc.sendKeys("Money for free");
		
	}

	@When("click next")
	public void click_next() {
		Payment.next.click();
	}

	@When("confirm the payment and click confirm")
	public void confirm_the_payment_and_click_confirm() throws InterruptedException {
		Thread.sleep(2000);
		Payment.confirm.click();

		
	}

	@Then("Check if the transaction is successfull")
	public void check_if_the_transaction_is_successfull() throws InterruptedException {
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
