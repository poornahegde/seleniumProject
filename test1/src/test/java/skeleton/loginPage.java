package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.Drivers;

public class loginPage {
	WebDriver driver;
	
	@Given("The url of demoweb shop")
	public void the_url_of_demoweb_shop() {
	   driver = Drivers.getDrivers("chrome");
	   driver.get("http://demowebshop.tricentis.com/login");
	   Assert.assertEquals("Demo Web Shop. Login", driver.getTitle());
	}

	@When("User enters {string} as username")
	public void user_enters_as_username(String string) {
	    driver.findElement(By.id("Email")).sendKeys(string);
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String string) {
		driver.findElement(By.id("Password")).sendKeys(string);
	}

	@Then("User is in valid page")
	public void user_is_in_valid_page() {
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Assert.assertTrue(driver.findElement(By.partialLinkText("Log out")).isDisplayed());
	   
	}

}
