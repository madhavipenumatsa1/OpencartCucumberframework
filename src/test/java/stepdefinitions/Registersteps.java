package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageObject.Errorpage;
import PageObject.Homepage;
import PageObject.RegisterPage;
import factory.driverfactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import utilities.Commonutilities;

public class Registersteps {
WebDriver driver;
RegisterPage register;
	@Given("user navigate to user register page")
	public void user_navigate_to_user_register_page() {
		driver = 	driverfactory.getDriver();
		Homepage home = new Homepage(driver);
		home.SetAccountmenuButton();
		 register	= home.clcionRegisterpagebutton();
	   
	}
	@When("user enaters the details into the below field")
	public void user_enaters_the_details_into_the_below_field(DataTable dataTable) {
	Map<String, String> datamap	= dataTable.asMap(String.class,String.class);
		register.setfirstnametext(datamap.get("firstname"));
		register.setLastName(datamap.get("lastname"));
	    register.setemailtext(Commonutilities.generatetimestamp());
	    register.setphonetext(datamap.get("telephone"));
	    register.setpassword(datamap.get("password"));
	    register.setConformpassword(datamap.get("conformpassword"));
	}

	@When("user selets pivacypolocy")
	public void user_selets_pivacypolocy() {
		register.privacypolocycheckbox();
	   
	}

	@When("user click on continue button")
	public void user_click_on_continue_button() {
	    register.clickoncontinuebutton();
	}

	@When("user account should successfully created")
	public void user_account_should_successfully_created() {
	   Assert.assertEquals("Your Account Has Been Created!", register.setAccountcreatedtext());
	}

	@When("user selects newletter field")
	public void user_selects_newletter_field() {
		register.setprivacypolocay();
	}

	@When("user should get proper error messages")
	public void user_should_get_proper_error_messages() {
		Errorpage error = new Errorpage(driver);
		Assert.assertEquals("First Name must be between 1 and 32 characters!", error.firstnameerrortext());
		Assert.assertEquals("Last Name must be between 1 and 32 characters!", error.lastnameerrortext());
	   Assert.assertEquals("E-Mail Address does not appear to be valid!",error.emailerrortext());
	   Assert.assertEquals("Telephone must be between 3 and 32 characters!", error.telephoneerrortext());
	   Assert.assertEquals("Password must be between 4 and 20 characters!", error.passworderror());

	}

	@When("user should get password error message")
	public void user_should_get_password_error_message() {
		Errorpage error = new Errorpage(driver);
	   Assert.assertEquals("Password confirmation does not match password!",error.conformpassword() );
	}



}
