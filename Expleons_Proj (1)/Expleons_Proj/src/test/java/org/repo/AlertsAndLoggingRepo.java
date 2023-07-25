package org.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsAndLoggingRepo {
	
	//Alerts and Logging
	
		//click login
		@FindBy(linkText="Login")
		public static WebElement login;
		
		//username
		@FindBy(xpath="//input[@placeholder='User']")
		public static WebElement uname;
		
		//password
		@FindBy(xpath="//input[@type='password']")
		public static WebElement pwd;
		
		//submit
		@FindBy(xpath="//span[text()='Submit']")
		public static WebElement submit;
		
		@FindBy(xpath="(//div[@class='menu-text'])[3]")
		public static WebElement marketPlace;
		
		@FindBy(xpath="//div[text()='Advertisements']")
		public static WebElement advertisements;
		
		@FindBy(xpath="//button[@type='button']//span[1]")
		public static WebElement show_adv;
		
		@FindBy(xpath="//div[text()=' donuts ']")
		public static WebElement select_adv;
		
		@FindBy(xpath="(//button[@type='button']//div)[3]")
		public static WebElement ask_qsn;
		
		@FindBy(tagName="textarea")
		public static WebElement question;
		
		@FindBy(xpath="(//button[@type='button']//span)[1]")
		public static WebElement submit1;



}
