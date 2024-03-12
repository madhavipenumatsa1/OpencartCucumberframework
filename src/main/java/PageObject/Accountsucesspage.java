package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ElementUtils;

public class Accountsucesspage {
WebDriver driver;
private ElementUtils elementutils;
	public Accountsucesspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementutils= new ElementUtils(driver);
	}
	@FindBy(linkText="Edit your account information")
	WebElement Accountsuccess;
	
	public String Accountsuccesspageinfo() {
	return	elementutils.getTextFromElement(Accountsuccess, 20);
	//return 	Accountsuccess.getText();
	}
	
}
