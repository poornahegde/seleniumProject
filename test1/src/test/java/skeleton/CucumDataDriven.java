package skeleton;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.Drivers;

public class CucumDataDriven {
	
	WebDriver driver;
	@Given("URL of web shop")
	public void url_of_web_shop() {
		driver = Drivers.getDrivers("chrome");
		PageFactory.initElements(driver,  OR_LoginPage.class);
		driver.get("http://demowebshop.tricentis.com/login");
		Assert.assertEquals("Demo Web Shop. Login", driver.getTitle());
	}

	@When("user enters {word} as (guest|valid) username")
	public void user_enters_ask_gmail_com_as_guest_username(String string) {
		OR_LoginPage.email.sendKeys(string);
	}

	@When("user enters {word} as password")
	public void user_enters_abc_as_password(String string) {
		OR_LoginPage.password.sendKeys(string);
	}	
	
	@Then("User is in valid  page")
	public void user_is_in_valid_page() {
		OR_LoginPage.signin.click();
//		Assert.assertTrue(driver.findElement(By.partialLinkText("Log out")).isDisplayed());
	}

}