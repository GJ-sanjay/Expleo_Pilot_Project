package org.repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserFunctionRepo {

	  //click login btn 1.2
  @FindBy(xpath="//a[@id='login-link']")
  public static  WebElement loginbutton;
  //enter user name
  @FindBy(xpath="//input[@autocomplete=\"username\"]")
  public static WebElement username;
 //Enter Password
  @FindBy(xpath="//input[@type='password']")
  public static WebElement password;
  //click submit button
  @FindBy(xpath="(//button[@type=\"button\"])[2]")
  public static  WebElement submitbutton;
  //click profile icon
  @FindBy(css="#profile-link")	    
  public static WebElement clickprofile;
  //click edit
  @FindBy(xpath="//div[text()='Edit']")
  public static WebElement edit;
  //enter email
  @FindBy(css="input#email")
  public static WebElement email;
  //add website 
  @FindBy(css="input[name='website']")
  public static WebElement website;
  
  //add name
  @FindBy(xpath="//input[@id=\"address_name_7762070814175351103\"]")
  public static WebElement name1;
  //enter city
  @FindBy(xpath="(//span[text()='City']/following::input)[1]")
  public static WebElement city;
  //enter address
  @FindBy(xpath="//input[@id='address_addressLine1_7762070814175351103']")
  public static WebElement address;
  @FindBy(xpath="//input[@id=\"address_region_7762070814175351103\"]")
  public static WebElement region;

  
  //click save
  @FindBy(xpath="//span[text()='Save']")
  public static WebElement save;
  
  

  //click add address
  @FindBy(xpath="(//button[starts-with(@class,'btn d-flex justify-content')])[5]")   // 5 t0 4
  public static WebElement addaddress2;
  //add name2
  @FindBy(css="#address_name_0")
  public static WebElement name2;
  //add address2
  @FindBy(css="#address_addressLine1_0")
  public static WebElement address2;
  //add zip code
  @FindBy(css="input#address_zip_0")
  public static WebElement zipcode2;
  //add city
  @FindBy(css="input#address_city_0")
  public static WebElement city2;
  //add country
  @FindBy(xpath="//button[@id=\"address_country_0\"]")
  public static WebElement country2;
  
  
  //click add mobiles 1.4
  @FindBy(xpath="(//button[contains(@class,'btn d-flex')])[4]")
  public static WebElement addmobiles3;
  //enter mobile name 
  @FindBy(css="input#phone_name_1")
  public static WebElement mobilename3;
  //enter phone number
  @FindBy(css="input[type='tel']")
  public static WebElement phonenumber3;
  
  
  //click save3
  @FindBy(xpath="//action-button[contains(@class,'btn-main d-inline-block')]//button[1]")
  public static WebElement save3;
  
  
  
  
  //click profile link (1.5)
  @FindBy(id="profile-link")
  public static WebElement profilelink4;
  //click password 
  @FindBy(xpath="(//a[@class='nav-item'])[3]")
  public static WebElement password4;
  //clicl change button
  @FindBy(css=" button.btn.d-flex")
  public static WebElement change4;
  //enter old password
  @FindBy(xpath="//input[@type=\"password\"][1]")
  public static WebElement oldpassword4;
  //enter newpassword    //At least 4 characters ✗
  @FindBy(xpath="(//input[@type=\"password\"])[2]")
  public static WebElement newpassword4;
  //enter confirmation password
  @FindBy(xpath="(//input[@type=\"password\"])[3]")
  public static WebElement confirmationpassword4;
  //click submit button
  @FindBy(xpath="(//button[contains(@class,'btn d-flex')])[2]")
  public static WebElement submit4;    
  
  
  //click docs
  @FindBy(xpath="(//a[@class='nav-item'])[4]")
  public static WebElement document;
 // click docs down
  @FindBy(xpath="(//button[@class='btn btn-icon'])[2]")
  public static WebElement docdown;
  
  
  //click profile link (1.6)
  @FindBy(id="profile-link")
  public static WebElement profilelink5;
  //click notification
  @FindBy(xpath="(//a[@class='nav-item'])[8]")
  public static WebElement notifications5;
  //click unread only check box
  @FindBy(css="label.custom-control-label")
  public static WebElement unreadonly5;
  //input[type='checkbox']
  
  
  //click profile link (1.7)
  @FindBy(id="profile-link")
  public static WebElement profilelink6;
  //click contacts
  @FindBy(xpath="(//a[@class='nav-item'])[2]")
  public static WebElement contact6;
  //click list view 
  @FindBy(xpath="(//label[@role='radio'])[2]")
  public static WebElement listview;
  
  //extra add setting  
  //click setting
  @FindBy(xpath="(//a[@class='nav-item'])[1]")
  public static WebElement clicksetting;
  //click dark
  @FindBy(xpath="//label[text()=' Dark ']")
  public static WebElement darkbutton;
  
  //add add reference
  @FindBy(xpath="(//a[@class='nav-item'])[9]")
  public static WebElement Reference7; 
  
  //upload image
  @FindBy(xpath="(//action-button[@class='d-inline-block button']//button)[1]")
  public static WebElement uploadimage; 
 
}
//(//button[@type='button'])[3]

