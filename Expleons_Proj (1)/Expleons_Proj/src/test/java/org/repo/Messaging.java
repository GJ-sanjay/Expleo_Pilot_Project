package org.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Messaging {
	
			//click login
			@FindBy(xpath="//div[text()=' Login ']")
			public static WebElement login;
			
			//username
			@FindBy(xpath="//input[@placeholder='User']")
			public static WebElement username;
			
			//password
			@FindBy(xpath="//input[@type='password']")
			public static WebElement password;
			
			//submit
			@FindBy(xpath="//span[text()='Submit']")
			public static WebElement submit;
	
			//message icon
			@FindBy(id="messages-link")
			public static WebElement message_icon;
			
			//new message 
			@FindBy(xpath="//div[text()='New message']")
			public static WebElement new_message;
			
			//sent to 
			@FindBy(xpath="(//button[@type='button'])[3]")
			public static WebElement Sent_to;
			
			//sent to - user
			@FindBy(linkText="User")
			public static WebElement user;
			
			//to user
			@FindBy(xpath="//div[@class='d-flex']//button[1]")
			public static WebElement to_user;
			
			//to user-name 
			@FindBy(linkText="Hotel Oasis")
			public static WebElement hotel_oasis;
			
			//Administration
			@FindBy(xpath="//div[text()='Administration']")
			public static WebElement administration;
			
			//category
			@FindBy(xpath="//div[contains(@class,'w-100 open')]//button[1]")
			public static WebElement category;
			
			//subject
			@FindBy(css="input.form-control.w-100")
			public static WebElement subject;
			
			//text box
			@FindBy(className="editor")
			public static WebElement description;
			
			@FindBy(xpath="//span[text()='Send']")
			public static WebElement send;
			
			@FindBy(xpath="//label[text()=' Inbox ']")
			public static WebElement inbox;
			
			@FindBy(xpath="//div[text()='All']")
			public static WebElement from;
			
			@FindBy(linkText="User")
			public static WebElement from_user;
			
			
			@FindBy(xpath="//div[@class='d-flex']//button[1]")
			public static WebElement inbox_user;
			
			@FindBy(linkText="Active Walking")
			public static WebElement user_name;
			
			@FindBy(xpath="(//span[text()='Keywords']/following::input)[1]")
			public static WebElement keyword1;
			
			@FindBy(xpath="(//div[contains(@class,'page-content-body card-body')])[2]")
			public static WebElement inbox_result;
			
			@FindBy(xpath="//label[text()=' Sent ']")
			public static WebElement sent;
			
			@FindBy(xpath="//a[@tabindex=\"0\"]")
			public static WebElement sentTo;
			
			@FindBy(xpath="//div[@class='w-100']//button[1]")
			public static WebElement sent_user;
			
			@FindBy(xpath="//input[@placeholder='Type to search']")
			public static WebElement User;
			
			
			@FindBy(xpath="//a[@class='select-option autocomplete-option-0']")
			public static WebElement CarRepair;
			
			@FindBy(xpath="//table[contains(@class,'table table-hover')]")
			public static WebElement sent_result;
						
			@FindBy(linkText="Demo one")
			public static WebElement Demo_one;
			
			@FindBy(xpath="(//span[text()='Keywords']/following::input)[1]")
			public static WebElement Keyword;
			
			@FindBy(xpath="//label[text()=' Trash ']")
			public static WebElement trash;
			
			@FindBy(xpath="//span[text()='Administration']")
			public static WebElement trash_result;
			
	
			


}
