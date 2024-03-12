package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ElementUtils;

public class Errorpage {
WebDriver driver;
private ElementUtils elementutils;

 public Errorpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	elementutils = new ElementUtils(driver);
 }
	@FindBy(xpath="//div[text()='Password confirmation does not match password!']")
	private WebElement passwordconform;
	@FindBy(xpath="//div[text()='First Name must be between 1 and 32 characters!']")
	private WebElement firstnameerror;
	@FindBy(xpath="//div[text()='Last Name must be between 1 and 32 characters!']")
	private WebElement lastnameerror;
	@FindBy(xpath="//div[text()='E-Mail Address does not appear to be valid!']")
	private WebElement emailerrormessage;
	@FindBy(xpath="//div[text()='Telephone must be between 3 and 32 characters!']")
	private WebElement telephoneerror;
	
	@FindBy(xpath="//div[text()='Password must be between 4 and 20 characters!']")
	private WebElement passworderror;
		
	public String conformpassword() {
		return elementutils.getTextFromElement(passwordconform, 20);
	//return	passwordconform.getText();
	}
	public String firstnameerrortext() {
		return elementutils.getTextFromElement(firstnameerror, 20);
		//return firstnameerror.getText();
	}
	public String lastnameerrortext() {
		return elementutils.getTextFromElement(lastnameerror, 20);
		//return lastnameerror.getText();
	}
	public String emailerrortext() {
		return elementutils.getTextFromElement(emailerrormessage, 20);
	//	return emailerrormessage.getText();
	}
	public String telephoneerrortext() {
		return elementutils.getTextFromElement(telephoneerror, 20);
		//return telephoneerror.getText();
	}
	public String passworderror() {
		return elementutils.getTextFromElement(passworderror, 20);
		//return passworderror.getText();
	}
	
	
	
	
	

}
