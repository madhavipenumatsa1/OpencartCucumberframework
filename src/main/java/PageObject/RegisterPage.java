package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ElementUtils;

public class RegisterPage {
 WebDriver driver;
 private ElementUtils elementutils;
	public RegisterPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		elementutils = new ElementUtils(driver);
	}
	@FindBy(id="input-firstname")
	private WebElement firstnameText;
	@FindBy(id="input-lastname")
	private WebElement lastnametext;
	@FindBy(id="input-email")
	private WebElement emailtext;
	@FindBy(id="input-telephone")
	private WebElement phonetext;
	@FindBy(id="input-confirm")
	private WebElement confirmtext;
	@FindBy(id="input-password")
	private WebElement passwordtext;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement privacypolocy;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement continuebutton;
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
	private WebElement acoountcreatedtext;
	
	@FindBy(xpath="//input[@name='newsletter' and @value='1']")
	private WebElement newsletterfield; 
	public void setfirstnametext(String firstname) {
		elementutils.javaScriptType(firstnameText, 20, firstname);
		//firstnameText.sendKeys(firstname);
	}
	public void setLastName(String lastname) {
		elementutils.javaScriptType(lastnametext, 20, lastname);
		//lastnametext.sendKeys(lastname);
	}
	public void setemailtext(String email) {
		elementutils.javaScriptType(emailtext, 0, email);
		//emailtext.sendKeys(email);
	}
	public void setphonetext(String phone) {
		elementutils.javaScriptType(phonetext, 20, phone);
		//phonetext.sendKeys(phone);
	}
	public void setConformpassword(String conform) {
		elementutils.javaScriptType(confirmtext, 20, conform);
		//confirmtext.sendKeys(conform);
	}
	public void setpassword(String pwd) {
		elementutils.javaScriptType(passwordtext, 20, pwd);
		//passwordtext.sendKeys(pwd);
	}
	public void privacypolocycheckbox() {
		elementutils.clickOnElement(privacypolocy, 20);
		//privacypolocy.click();
	}
	public void clickoncontinuebutton() {
		elementutils.clickOnElement(continuebutton, 20);
		//continuebutton.click();
	}
	public String setAccountcreatedtext() {
		return elementutils.getTextFromElement(acoountcreatedtext, 20);
		// return acoountcreatedtext.getText();
	}
	public void setprivacypolocay() {
		elementutils.clickOnElement(newsletterfield, 20);
		// newsletterfield.click();
	}
}
