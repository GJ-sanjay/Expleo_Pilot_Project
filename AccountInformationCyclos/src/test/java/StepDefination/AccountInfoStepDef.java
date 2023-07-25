package StepDefination;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import AccInfoRepository.AccountInfoRepo;
import executor.JavaScriptExecutor;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountInfoStepDef {
	public static WebDriver driver;

	@Before
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.cyclos.org/ui/login");

	}

	@Given("user should give valid username and password")
	public void user_should_give_valid_username_and_password() throws IOException {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		FileInputStream king = new FileInputStream("C:\\Users\\sambati\\Downloads\\Cyclos.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(king);
		XSSFSheet sht = wb.getSheetAt(0);
		Row row1 = sht.getRow(1);
		Cell cl1 = row1.getCell(0);
		Cell cl2 = row1.getCell(1);

		int pwd = (int) cl2.getNumericCellValue();
		String password = Integer.toString(pwd);
		System.out.println(cl1.toString());
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.username)).sendKeys("demo");
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.password)).sendKeys("1234");
	}

	@Given("user should click submit")
	public void user_should_click_submit() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.submit)).click();

	}

	@Then("user click the banking menu")
	public void user_click_the_banking_menu() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.banking)).click();

	}

	@Then("click the Member Account")
	public void click_the_member_account() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.memberAccount)).click();
	}

	@Then("check member account balance")
	public void check_member_account_balance() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String balance = wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.availabeBalance)).getText();
		System.out.println(balance);
	}

	@Then("click on notifications")
	public void click_on_notifications() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.notification)).click();
	}
//------------------------------------------------------------------
	@When("clicking on payment to user tab in banking")
	public void clicking_on_payment_to_user_tab_in_banking() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.paymentTOUser)).click();
	}

	@Then("click on the pickfromyourcontactlist in touser")
	public void click_on_the_pickfromyourcontactlist_in_touser() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.pickFromYourContact)).click();
	}

	@Then("click anyone from the select a contact")
	public void click_anyone_from_the_select_a_contact() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.anyoneFromContact)).click();
	}

	@Then("Enter the Amount")
	public void enter_the_amount() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.enterAmount)).sendKeys("100");
	}

	@Then("click on next button")
	public void click_on_next_button() throws InterruptedException {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.next1));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
		AccountInfoRepo.next1.click();
		
//		driver.findElement(By.xpath("//*[@class='d-inline-block button']")).click();
		
	}

	@When("click on confirm")
	public void click_on_confirm() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.confirm)).click();
	}

	@Then("click the print to confirm the payment details downloaded")
	public void click_the_print_to_confirm_the_payment_details_downloaded() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.exportPayment)).click();
	}
//--------------------------------------------------------
	//5
	@Then("click on the Showfilter button")
	public void click_on_the_showfilter_button() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.showFilter)).click();
	}

	@Then("Select the pickfromyourcontactlist on book icon")
	public void select_the_pickfromyourcontactlist_on_book_icon() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.userTOSearch)).click();
	}

	@Then("user click anyone from the select a contact")
	public void user_click_anyone_from_the_select_a_contact() throws InterruptedException {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.selectContact));
		
		Thread.sleep(5000);
		AccountInfoRepo.selectContact.click();
	}

	@Then("click on the period menu")
	public void click_on_the_period_menu() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.periodDropDrown)).click();

	}

	@Then("Select any oneoption")
	public void select_any_oneoption() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.listOfPeriod)).click();
	}

	@Then("select the description enter the content")
	public void select_the_description_enter_the_content() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.description)).sendKeys("test");
	}

	@Then("click on the From amount Enter the amount")
	public void click_on_the_from_amount_enter_the_amount() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.enterToAmount)).sendKeys("100");
	}

	@Then("click the filter option")
	public void click_the_filter_option() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.filter)).click();

	}

	@Then("Select anyone Option")
	public void select_anyone_option() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.memberPayment)).click();
	}

	@Then("click the Direction option")
	public void click_the_direction_option() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.direction)).click();
	}

	@Then("Select anyone Option in direction")
	public void select_anyone_option_in_direction() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.outGoing)).click();
	}

	@Then("click the orderBy option")
	public void click_the_order_by_option() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.orderBy)).click();
	}

	@Then("Select anyone from orderby")
	public void select_anyone_from_orderby() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.listOfOrderBy)).click();
	}
	
	//6
	@When("click anyone from the Account Summary")
	public void click_anyone_from_the_account_summary() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.AnyOneAccountSummery)).click();
	}

	@Then("payment Details will be Appear to User")
	public void payment_details_will_be_appear_to_user() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.transferDetails)).click();
	}
	
	//7
	@When("click anyone from  Account Summary")
	public void click_anyone_from_account_summary() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.AnyOneAccountSummery)).click();
	}

	@Then("click on the print button in the transferDetails")
	public void click_on_the_print_button_in_the_transfer_details() {
		PageFactory.initElements(driver, AccountInfoRepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(AccountInfoRepo.PrintButton)).click();
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Account Information details ");
	}
}
