package org.stepDefinitionSixthModule;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.repo.Market_Place;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import tech.grasshopper.pdf.pojo.cucumber.Row;

public class marketplace {

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
		WebDriverWait wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, Market_Place.class);
		FileInputStream fix = new FileInputStream("C:\\Users\\User\\Downloads\\Cyclos.xlxs");
		XSSFWorkbook wb = new XSSFWorkbook(fix);
		XSSFSheet sht = wb.getSheetAt(0);
		Row row1 = sht.getRow(1);
		Cell cl1 = row1.getCell(0);
		Cell cl2 = row1.getCell(1);

		int pwd = (int) cl2.getNumericCellValue();
		String password = Integer.toString(pwd);
		wait.until(ExpectedConditions.visibilityOf(Market_Place.username)).sendKeys(cl1.toString());
		driver.findElement(By.xpath("(//span[@class='input-group-text input-group-icon']//icon)[3]")).click();
		wait.until(ExpectedConditions.visibilityOf(Market_Place.password)).sendKeys(password);

	}

	@Given("user should click submit")
	public void user_should_click_submit() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, Market_Place.class);
		wait.until(ExpectedConditions.visibilityOf(Market_Place.submit)).sendKeys(Keys.ENTER);
	}

	@Given("user click the Market_Place menu")
	public void user_click_the_market_place_menu() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, Market_Place.class);
		wait.until(ExpectedConditions.visibilityOf(Market_Place.marketplace1)).click();
	}

	@Then("user click the Advertisements")
	public void user_click_the_advertisements() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, Market_Place.class);
		wait.until(ExpectedConditions.visibilityOf(Market_Place.advertisements)).click();
	}

	@Then("user should click on showadveritisements")
	public void user_should_click_on_showadveritisements() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, Market_Place.class);
		wait.until(ExpectedConditions.visibilityOf(Market_Place.showAdvertisements)).click();
	}

	@Then("User click on Order by")
	public void user_click_on_order_by() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, Market_Place.class);
		wait.until(ExpectedConditions.visibilityOf(Market_Place.orderBy));
		//wait.until(ExpectedConditions.visibilityOf(Market_Place.orderBy)).click();

	}

	@Then("select the last published")
	public void select_the_last_published() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, Market_Place.class);
		wait.until(ExpectedConditions.visibilityOf(Market_Place.lastPablished)).click();
	}

	@Given("I want to click on the keywords search field")
	public void i_want_to_click_on_the_keywords_search_field() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, Market_Place.class);
		wait.until(ExpectedConditions.visibilityOf(Market_Place.Keyword)).click();
	}

	@Given("user should pass the requiered information in keyword")
	public void user_should_pass_the_requiered_information_in_keyword() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, Market_Place.class);
		wait.until(ExpectedConditions.visibilityOf(Market_Place.Keyword)).sendKeys("food");
	}

	@Then("user should click on the community field")
	public void user_should_click_on_the_community_field() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, Market_Place.class);
		wait.until(ExpectedConditions.visibilityOf(Market_Place.community)).click();
	}

	@Then("user should click on activity in the community field")
	public void user_should_click_on_activity_in_the_community_field() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, Market_Place.class);
		wait.until(ExpectedConditions.visibilityOf(Market_Place.showAll)).click();
		wait.until(ExpectedConditions.visibilityOf(Market_Place.activities)).click();

	}

	@Then("select any one Ad")
	public void select_any_one_ad() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, Market_Place.class);
		wait.until(ExpectedConditions.visibilityOf(Market_Place.actAd)).click();
	}

}