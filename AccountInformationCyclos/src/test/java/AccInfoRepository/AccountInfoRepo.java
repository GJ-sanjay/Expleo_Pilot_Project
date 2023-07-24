package AccInfoRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountInfoRepo {

	@FindBy(xpath = "//input[@formcontrolname='principal']")
	public static WebElement username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public static WebElement password;

	@FindBy(css = "button.btn.d-flex")
	public static WebElement submit;

	@FindBy(id = "menu_banking")
	public static WebElement banking;

	@FindBy(xpath = "//div[text()='Member account']")
	public static WebElement memberAccount;

	@FindBy(xpath = "//div[@class='row no-gutters']/div[4]")
	public static WebElement availabeBalance;

	@FindBy(id = "notifications-link")
	public static WebElement notification;

	@FindBy(xpath = "//table[@class='table table-hover cursor-pointer']/tbody/tr[5]")
	public static WebElement recentTransaction;

	@FindBy(className = "bi bi-printer")
	public static WebElement print;

	@FindBy(xpath = "//*[@class='bi bi-funnel']")
	public static WebElement showFilter;

	@FindBy(xpath = "//button[contains(@class,'btn btn-icon ml-2')]")
	public static WebElement userTOSearch;

	@FindBy(xpath = "//a[contains(text(),'Emma')]")
	public static WebElement selectContact;

	@FindBy(xpath = "(//div[contains(@class,'w-100 mw-100')])[1]")
	public static WebElement periodDropDrown;

	// list of elements in dropdown
	@FindBy(linkText = "Last month")
	public static WebElement listOfPeriod;

	@FindBy(xpath = "//*[@id=\"id_4\"]")
	public static WebElement filter;

	@FindBy(xpath = "//*[@id=\"dropdown-menu-id_4\"]/div[1]/label")
	public static WebElement memberPayment;

	@FindBy(xpath = "(//input[contains(@class,'form-control w-100')])[1]")
	public static WebElement description;

	@FindBy(xpath = "(//button[contains(@class,'form-control text-left')]//div)[3]")
	public static WebElement direction;

	@FindBy(linkText = "Outgoing")
	public static WebElement outGoing;

	@FindBy(xpath = "//span[text()='Transaction number']/following::input")
	public static WebElement transactionNumber;

	@FindBy(xpath = "//div[text()='Date (newest first)']")
	public static WebElement orderBy;

	@FindBy(xpath = "//a[contains(text(),'Amount (lowest first)')]")
	public static WebElement listOfOrderBy;

	@FindBy(xpath = "(//div[@class='input-group']//input)[2]")
	public static WebElement enterToAmount;
	
	@FindBy(xpath = "//div[@class='title-text flex-grow-1 d-flex align-items-center']")
	public static WebElement transferDetails;
	
	@FindBy(xpath = "(//td[@class='avatar']/following-sibling::td)[1]")
	public static WebElement AnyOneAccountSummery;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	public static WebElement PrintButton;
}
