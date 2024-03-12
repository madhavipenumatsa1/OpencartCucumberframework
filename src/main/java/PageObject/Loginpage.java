package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ElementUtils;

public class Loginpage {
	WebDriver driver;
	
	private ElementUtils elementutils;
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementutils= new ElementUtils(driver);
	}
	
	@FindBy(id="input-email")
	private WebElement emailtext;
	@FindBy(id="input-password")
	WebElement pwdtext;
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbutton;
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	WebElement errormessage;
	
	
	public void setEmailtext(String validemailtext) {
		elementutils.javaScriptType(emailtext, 20, validemailtext);
		//emailtext.sendKeys(validemailtext);
	}
	public void setPasswordtext(String validpwdtext) {
		elementutils.javaScriptType(pwdtext, 20, validpwdtext);
		//pwdtext.sendKeys(validpwdtext);
	}
	public void clickOnLogin() {
		elementutils.clickOnElement(loginbutton, 20);
		//loginbutton.click();
	}
	public String warningmessagetext() {
	return	elementutils.getTextFromElement(errormessage, 20);
	//return	errormessage.getText();
	}

}
