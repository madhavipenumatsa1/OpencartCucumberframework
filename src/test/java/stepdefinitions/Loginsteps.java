package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObject.Accountsucesspage;
import PageObject.Homepage;
import PageObject.Loginpage;
import factory.driverfactory;
import io.cucumber.java.en.*;
import utilities.Commonutilities;


public class Loginsteps {
	WebDriver driver;
	 private Loginpage login;
	@Given("user navigate to loginpage")
	public void user_navigate_to_loginpage() {
		driver = 	driverfactory.getDriver();
		Homepage home = new Homepage(driver);
		home.SetAccountmenuButton();
 login	= home.selectloginDropdownbox();
	}

	@When("user provide valid email {string}")
	public void user_provide_valid_email(String validemail) {
			 
		login.setEmailtext(validemail);
		int a = 10/0;
	}

	@When("user provide valid password {string}")
	public void user_provide_valid_password(String validpassword) {
			
		login.setPasswordtext(validpassword);
	}
	@Then("user login to the application")
	public void user_login_to_the_application() {
		Accountsucesspage page = new Accountsucesspage(driver);
		Assert.assertEquals("Edit your account information", page.Accountsuccesspageinfo());
	}

	@When("user provide Invalid email {string}")
	public void user_provide_invalid_email(String Invalidemail) {
			
		login.setEmailtext(Commonutilities.generatetimestamp());
	}

	@When("user provide Invalid password {string}")
	public void user_provide_invalid_password(String invalidpawd) {
			
		login.setPasswordtext(invalidpawd);
	}

	@Then("user should get proper error address")
	public void user_should_get_proper_error_address() {
			 
		Assert.assertEquals("Warning: No match for E-Mail Address and/or Password.", login.warningmessagetext());
	}

	@Given("click on login button")
	public void click_on_login_button() {
			
		login.clickOnLogin();
		}



}
