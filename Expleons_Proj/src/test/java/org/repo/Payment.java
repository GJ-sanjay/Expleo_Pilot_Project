package org.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment {

	@FindBy(xpath="//a[contains(text(),'Products')]")
	public static WebElement product;
	
	@FindBy(xpath="//a[text()='Visit Online Demo']")
	public static WebElement vod;
	
	@FindBy(xpath="//div[text()=' Login '] ")
	public static WebElement login;
	
	@FindBy(xpath="//input[@placeholder=\"User\"]")
	public static WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public static WebElement password; 
	
	@FindBy(xpath="//span[text()='Submit']")
	public static WebElement submit;
	
	@FindBy(xpath="//div[text()='Banking']")
	public static WebElement bank;
	
	@FindBy(xpath="//div[text()='Payment to user']")
	public static WebElement pts;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	public static WebElement contact_book;
	
	@FindBy(linkText="Active Walking")
	public static WebElement user;
	
	@FindBy(xpath="//input[@placeholder='0,00']")
	public static WebElement amount;
	
	@FindBy(tagName="textarea")
	public static WebElement desc;
	
	@FindBy(xpath="//span[text()='Next']")
	public static WebElement next;
	
	@FindBy(xpath="//span[text()='Confirm']")
	public static WebElement confirm;
	
	@FindBy(xpath="//div[text()='The payment was successfully processed']")
	public static WebElement success;
	
	@FindBy(xpath="//div[text()='You have exceeded the maximum of payments per day for the demo network']")
	public static WebElement failure;
	
	@FindBy(xpath="//div[text()='Payment to system']")
	public static WebElement ptsys;
	
	@FindBy(xpath="//div[text()='Pay now']")
	public static WebElement pay_now;
	
	@FindBy(xpath="//a[contains(text(),'Scheduled')]")
	public static WebElement scheduled;
	
	@FindBy(xpath="//a[contains(text(),'Monthly installments')]")
	public static WebElement mi;
	
	@FindBy(xpath="//input[@type='date']")
	public static WebElement date;
	
	@FindBy(xpath="//input[@type='number']")
	public static WebElement noi;
	
	@FindBy(xpath="//label[text()=' Now ']")
	public static WebElement first_installment;
	
	@FindBy(xpath="//div[text()='Payment requests']")
	public static WebElement preq;
	
	@FindBy(xpath="//div[text()='Send a new request']")
	public static WebElement send_new_req;
	
	@FindBy(xpath="(//button[@type='button']//icon)[2]")
	public static WebElement cb_pr;
	
	@FindBy(xpath="//a[contains(text(),'Recurring payments')]")
	public static WebElement rec_pay;
	
	@FindBy(xpath="//label[text()=' First payment when accepting the request ']")
	public static WebElement first_occur;
	
	@FindBy(xpath="(//span[text()='Confirm'])[2]")
	public static WebElement confirm2;
	
	
	@FindBy(xpath="//div[text()='The payment request was successfully sent']")
	public static WebElement suc_sent;
	/*
	@FindBy()
	public static WebElement ;
	
	@FindBy()
	public static WebElement ;
	*/
}
