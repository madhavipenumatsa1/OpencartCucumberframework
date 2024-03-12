package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ElementUtils;

public class Homepage {
	 WebDriver driver;
	 private ElementUtils elementutils;
	public Homepage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		elementutils = new ElementUtils(driver);
		
	}
	@FindBy(xpath="//span[text()='My Account']")
 private WebElement myDropmenu;
	@FindBy(linkText="Login")
	private WebElement selectLoginDropdown;
	
	@FindBy(linkText="Register")
	private WebElement Registerbutton;
	
	public void SetAccountmenuButton() {
		elementutils.clickOnElement(myDropmenu, 20);
	}
	
	public Loginpage selectloginDropdownbox() {
		elementutils.clickOnElement(selectLoginDropdown, 20);
		return  new Loginpage(driver);
	}
	public RegisterPage clcionRegisterpagebutton() {
		elementutils.clickOnElement(Registerbutton, 20);
		return new RegisterPage(driver);
	}
	

	
}
