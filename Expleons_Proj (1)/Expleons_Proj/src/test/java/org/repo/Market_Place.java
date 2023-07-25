package org.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Market_Place {
	
	// Rich text for advertisement editing
    
	//click login
	@FindBy(css="a[aria-label='Login']")
	public static WebElement login;
	
	//username
	@FindBy(xpath="//input[@type='text']")
	public static WebElement user;
	
	//password
	@FindBy(xpath="//input[@type='password']")
	public static WebElement pwd;
	
	//submit1
	@FindBy(xpath="//span[text()='submit']")
	public static WebElement submit;
	
	@FindBy(xpath = "(//div[@class='menu-text'])[3]")
	public static WebElement marketplace;

	@FindBy(xpath = "//div[text()='My advertisements']")
	public static WebElement my_adv;
	
	@FindBy(xpath = "//button[@class='btn']//div[1]")
	public static WebElement add_new;

	@FindBy(css = "input.form-control.w-100")
	public static WebElement name;

	@FindBy(xpath = "(//div[@class='w-100']//button)[1]")
	public static WebElement category;
	
	@FindBy(linkText = "Musicians")
	public static WebElement musicians;

	@FindBy(xpath = "//div[@class='input-group']//input[1]")
	public static WebElement price;

	@FindBy(xpath = "(//input[@type='date'])[1]")
	public static WebElement Begin_Date;

	@FindBy(xpath = "(//input[@type='date'])[2]")
	public static WebElement End_Date;

	@FindBy(className = "editor")
	public static WebElement description;

	@FindBy(xpath = "//span[text()='Save']")
	public static WebElement save;

	// To schedule an address per advertisement
	@FindBy(xpath = "//div[@class='dropdown-menu show']")
	public static WebElement address;

	// To customise the search filters according to the given parameters
	@FindBy(xpath = "(//div[@class='nav-item-text'])[2]")
	public static WebElement Advertisement;

	@FindBy(xpath = "//button[@type='button']//div[1]")
	public static WebElement more_filter;

	@FindBy(xpath = "(//span[text()='Keywords']/following::input)[1]")
	public static WebElement Keyword;

	@FindBy(xpath = "(//input[@type='checkbox']/following-sibling::label)[1]")
	public static WebElement favarite;

	@FindBy(xpath = "(//div[@class='input-group']//input)[1]")
	public static WebElement min_price;

	@FindBy(xpath = "(//span[text()='Max. price']/following::input)[1]")
	public static WebElement max_price;

	@FindBy(xpath = "//span[text()='Show advertisements']")
	public static WebElement show_adv;

	// To customise the list of new advertisement field
	@FindBy(xpath = "//div[text()='Order by']")
	public static WebElement order_by;

	@FindBy(linkText = "Lowest price")
	public static WebElement lowest_price;

	// To automate the category browsing
	@FindBy(xpath = "(//span[text()='Keywords']/following::input)[1]")
	public static WebElement keyword_search;

	// Multiple advertisement categories
	@FindBy(linkText = "Community")
	public static WebElement community;

	// To customise the advertising field according to the user needs
	@FindBy(linkText = "Activities")
	public static WebElement activity;

	@FindBy(css = "div.avatar-container.full-size")
	public static WebElement cupcake;
	
	@FindBy(xpath = "//input[@formcontrolname='principal']")
    public static WebElement username;

 

    @FindBy(xpath = "//input[@placeholder='Password']")
    public static WebElement password;

 

    @FindBy(css = "button.btn.d-flex")
    public static WebElement submit1;
/////////
    @FindBy(xpath = "//div[text()='Marketplace']")
    public static WebElement marketplace1;
//////////
 

    @FindBy(xpath = "//div[text()='Advertisements']")
    public static WebElement advertisements;

 

    @FindBy(xpath = "//button[contains(@class,'btn d-flex')]")
    public static WebElement showAdvertisements;

 

    @FindBy(xpath = "//*[@title='Order by']")
    public static WebElement orderBy;

 

    @FindBy(xpath = "//a[@class='select-option undefined level0 mt-1 selected']")
    public static WebElement lastPablished;

 

    @FindBy(xpath = "//input[contains(@class,'form-control w-100')]")
    public static WebElement Keyword1;
/////////////////
 

    @FindBy(xpath = "//a[contains(text(),'Community')]")
    public static WebElement community1;
//////////////
 

    @FindBy(xpath = "(//a[@class='category-footer'])[1]")
    public static WebElement showAll;

 

    @FindBy(xpath = "(//*[@class='d-block mb-1 undecorated category-level-0'])[1]")
    public static WebElement activities;

 

//    @FindBy(xpath = "(//div[@class='card-text'])[1]")
//    public static WebElement firstAd;
//    
//    @FindBy(xpath = "//div[contains(@class,'title-text flex-grow-1')]")
//    public static WebElement title;

    @FindBy(xpath = "(//div[@class='card-body'])[1]")
    public static WebElement actAd;


}
