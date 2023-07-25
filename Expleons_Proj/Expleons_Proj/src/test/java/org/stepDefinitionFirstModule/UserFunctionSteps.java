package org.stepDefinitionFirstModule;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.repo.UserFunctionRepo;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class UserFunctionSteps {

	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@Given("User Should go to the login pages")
	public void user_should_go_to_the_login_pages() {		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/login");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,10);	
		PageFactory.initElements(driver,UserFunctionRepo.class);
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Initiate Browser");
	}

	@When("User should submit username and password and login to the application")
	public void user_should_submit_username_and_password_and_login_to_the_application(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<String> list = dataTable.asList();
		String user=list.get(0);
		String pass=list.get(1);
		  wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.loginbutton)).click();;
		WebElement a=  wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.username));
				a.sendKeys(user);
		WebElement b=  wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.username));
		       b.sendKeys(Keys.ENTER);
	    WebElement c= wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.password));
		       c.sendKeys(pass);
		 wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.submitbutton)).click();
			ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Login Compeleted");


	}

	@When("User click on profile icon and then edit button")
	public void user_click_on_profile_icon_and_then_edit_button() {
		 wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.clickprofile)).click();
		 wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.edit)).click();
			ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Edit Clicked");


	}

	@When("User should upload a profile image")
	public void user_should_upload_a_profile_image() throws InterruptedException, AWTException {
		wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.uploadimage)).click();
		String im="C:\\Users\\pmurugesan\\Pictures\\Screenshots\\download.jpg";
		StringSelection sel=new StringSelection(im);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		Robot ro=new Robot();
		Thread.sleep(2000);
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);
		ro.keyRelease(KeyEvent.VK_V);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Profile image imported");

	}

	@When("User should click name text field & email text field and enter valid detailss")
	public void user_should_click_name_text_field_email_text_field_and_enter_valid_detailss() throws InterruptedException {		
		WebElement s=wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.email));
		s.clear();
		s.sendKeys("sachin123@gmail.com");
	}

	@Then("User Should click name field in addresses & enter valid name")
	public void user_should_click_name_field_in_addresses_enter_valid_name() throws InterruptedException {						
		WebElement s=wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.name1));
		s.clear();
		s.sendKeys("ram");	
	}

	@Then("User Should click address line1 field in addresses & enter valid details")
	public void user_should_click_address_line1_field_in_addresses_enter_valid_details() {
		
		WebElement s=wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.address));
		s.clear();
		s.sendKeys("Tambaram,Mep");
	}

	@When("User Should click city field & enter city name")
	public void user_should_click_city_field_enter_city_name() throws InterruptedException {
		WebElement cty=wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.city));
		cty.clear();
		cty.sendKeys("chennai");		
	}

	@When("User Should click region\\/state field in addresses & enter valid details")
	public void user_should_click_region_state_field_in_addresses_enter_valid_details() throws InterruptedException {
		WebElement R=wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.region));
		R.sendKeys("Trichy/tamilnaduu");
		
		//UserFunctionRepo.save.click();	
	}

	@Given("User Should click Add address button")
	public void user_should_click_add_address_button() throws InterruptedException {
		WebElement cl= wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.addaddress2));
		cl.click();

	}

	@Then("User Should click name text field & enter {string}")
	public void user_should_click_name_text_field_enter(String string) { 
		WebElement n= wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.name2));
		n.sendKeys(string);		
	}

	@Then("User Should click Address line1 text field and enter {string}")
	public void user_should_click_address_line1_text_field_and_enter(String string) {
		WebElement ad= wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.address2));
		ad.sendKeys(string);    
	}

	@Then("User Should click city text field and enter {string}")
	public void user_should_click_city_text_field_and_enter(String string) {
		WebElement ct= wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.city2));
		ct.sendKeys(string);
		   
	}

	@Then("User Should click Zipcode text field and enter {string}")
	public void user_should_click_zipcode_text_field_and_enter(String string) {
		WebElement zp= wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.zipcode2));
		zp.sendKeys(string);    
	}

	@Then("User Should click country text field & enter valid country")
	public void user_should_click_country_text_field_enter_valid_country() throws InterruptedException {
		WebElement cn=wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.country2));
		cn.click(); 
		cn.sendKeys(Keys.ENTER);
	}

	@Given("User Should click edit button")
	public void user_should_click_edit_button() {	
		//UserFunctionRepo.save.click();
	}

	@Given("User Should click Add mobile button")
	public void user_should_click_add_mobile_button() throws InterruptedException {
		Actions act=new Actions(driver)	;
		WebElement am= wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.addmobiles3));
		act.moveToElement(am).click().build().perform();
		ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Login Clicked");
	}

	@When("User Should enter the valid mobile phone name in mobile phone name text field")
	public void user_should_enter_the_valid_mobile_phone_name_in_mobile_phone_name_text_field() {
		WebElement ph= wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.mobilename3));
		ph.sendKeys("Realme7");
	}

	@Then("User Should enter the valid mobile phone number in mobile phone number text field")
	public void user_should_enter_the_valid_mobile_phone_number_in_mobile_phone_number_text_field() {
		WebElement phn= wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.phonenumber3));
		phn.sendKeys("(210) 555-0122");
	}

	@Then("click on save button")
	public void click_on_save_button() throws InterruptedException {			
		//UserFunctionRepo.save.click();
	}

	@Given("User Should click the Profile button")
	public void user_should_click_the_profile_button() {
		 wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.clickprofile)).click();
	}

	@Given("User Should Navigate to Setting")
	public void user_should_navigate_to_setting() {
		 wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.clicksetting)).click();

	}

	@Given("User Should click Dark button")
	public void user_should_click_dark_button() {  
		 wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.darkbutton)).click();

	}

	@Given("User Should contacts")
	public void user_should_contacts() {
		 wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.contact6)).click();
	}

	@Given("Click on list view")
	public void click_on_list_view() throws InterruptedException {
		Thread.sleep(3000);
	  wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.listview)).click();;
	}

	@Given("User Should click password and change button")
	public void user_should_click_password_and_change_button() {
		  wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.password4)).click();;
		  wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.change4)).click();;
	}

	@Given("User Should enter the valid password in old password text field")
	public void user_should_enter_the_valid_password_in_old_password_text_field() {
		UserFunctionRepo.oldpassword4.sendKeys("prakash@123");
	}

	@Given("User Should enter the valid password in new password text field")
	public void user_should_enter_the_valid_password_in_new_password_text_field() {
		UserFunctionRepo.newpassword4.sendKeys("prakash@123");
	}

	@Then("User Should enter the valid password in password confirmation text field")
	public void user_should_enter_the_valid_password_in_password_confirmation_text_field() {
		UserFunctionRepo.confirmationpassword4.sendKeys("prakash@123");
	}

	@Then("Click on Submit button")
	public void click_on_submit_button() {
		  wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.submit4)).click();;

	}

	@Given("User should Click  Document")
	public void user_should_click_document() throws InterruptedException {
		Thread.sleep(3000);
		 wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.document)).click();;
	}

	@Given("User should click download button and verify")
	public void user_should_click_download_button_and_verify() throws InterruptedException {
		Thread.sleep(3000);
		WebElement dnlod=UserFunctionRepo.docdown;
		dnlod.click();
		Thread.sleep(3000);
		File f=new File("C:\\Users\\pmurugesan\\Downloads");
		File[] g=f.listFiles();		
		for (File allFiles : g) {
			if(allFiles.getName().equalsIgnoreCase("Innovative Approaches to Development"))
				System.out.println(allFiles.length());
				System.out.println("files downloaded");
			break;
		}
	}

	@Given("Click on notification")
	public void click_on_notification() throws InterruptedException {
		  wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.notifications5)).click();;

	}

	@Given("Click on unread checkbox")
	public void click_on_unread_checkbox() throws InterruptedException {
		Thread.sleep(2000);
		  wait.until(ExpectedConditions.elementToBeClickable(UserFunctionRepo.unreadonly5)).click();;
	}

	@Given("Click on References")
	public void click_on_references() throws InterruptedException {
		  wait.until(ExpectedConditions.elementToBeClickable( UserFunctionRepo.Reference7)).click();;
		 
	}

	@Given("user should take Screenshot")
	public void user_should_take_screenshot() throws AWTException, IOException, InterruptedException {
		 Thread.sleep(2000);
		 Robot robot=new Robot();
		    Dimension screensize =Toolkit.getDefaultToolkit().getScreenSize();
		    Rectangle rect=new Rectangle(screensize);
		    BufferedImage scrnshot=robot.createScreenCapture(rect);
		    File destiny=new File("C:\\Users\\pmurugesan\\Pictures\\Screenshots\\m.png");
		    ImageIO.write(scrnshot,"png",destiny);
	}



}
