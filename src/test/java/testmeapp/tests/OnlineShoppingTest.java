package testmeapp.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testmeapp.utility.Drivers;

public class OnlineShoppingTest {
	WebDriver driver;
	
	@AfterTest
	public void endReportAfterTest() {
		
	}
	
	@AfterMethod
	public void getResultAfterMethod() {
		
	}
	
	@BeforeTest
	public void startReportBeforeTest() {
		
	}
	
	@Test(priority = 3)
	public void testCart() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.partialLinkText("All Categories"))).perform();
		action.click(driver.findElement(By.partialLinkText("Electronics"))).perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		action.click(driver.findElement(By.xpath("//*[@id="submenuul11290\"]/li[1]/a/span"))).perform();
//		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Head Phone')]"))).click().perform();
		action.click(driver.findElement(By.linkText("Head Phone"))).perform();
		Assert.assertTrue(driver.getTitle().contains("Search"));
		action.click(driver.findElement(By.linkText("Add to cart"))).perform();
	}
	
	@Test(priority=2)
	public void testLogin() {
		Assert.assertEquals(driver.getTitle(), "Login");
		driver.findElement(By.id("userName")).sendKeys("poorna_obc");
		driver.findElement(By.id("password")).sendKeys("poorna");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
	}
	
	@Test(priority = 4)
	public void testPayment() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
		Assert.assertTrue(driver.getTitle().contains("View Cart"));
		driver.findElement(By.partialLinkText("Checkout")).click();
		Assert.assertTrue(driver.getTitle().contains("Checkout"));
		driver.findElement(By.cssSelector("input[value='Proceed to Pay']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertTrue(driver.getTitle().contains("Payment Gateway"));
		
		Actions act = new Actions(driver);
		act.click(driver.findElement(By.xpath("//div[@id='horizontalTab']/div[2]/div/div/div/div[2]/div[7]/div/label/i"))).perform();
		act.click(driver.findElement(By.id("btn"))).perform();
		
//		act.click(driver.findElement(By.cssSelector("a[contains(text(),'Continue')]"))).perform();
//		act.click(driver.findElement(By.linkText("Continue"))).perform();
		
		driver.findElement(By.name("username")).sendKeys("123460");
		driver.findElement(By.name("password")).sendKeys("Pass@460");
		driver.findElement(By.xpath("//div[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='horizontalTab']/div/h2")).getText().contains("Welcome to Payment Support"));
		driver.findElement(By.name("transpwd")).sendKeys("Trans@460");
		driver.findElement(By.cssSelector("input[value='PayNow']")).click();
		
		WebElement order = driver.findElement(By.xpath("//h3[contains(text(),'Order details')]"));
		Assert.assertEquals(order.getText(), "Order details");
		
		WebElement orderId = driver.findElement(By.xpath("//table[@class='table']/tbody/tr/td[1]"));
		System.out.println(orderId);
		Assert.assertEquals(orderId, 50055);
	}
	
	@Test(priority=1)
	public void testRegistration() {
		driver = Drivers.getDrivers("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/");
		Assert.assertEquals(driver.getTitle(),"Home");
		driver.findElement(By.linkText("SignUp")).click();
		Assert.assertEquals(driver.getTitle(), "Sign Up");
		driver.findElement(By.id("userName")).sendKeys("tester_abc6");
		driver.findElement(By.id("firstName")).sendKeys("tester");
		driver.findElement(By.id("lastName")).sendKeys("hegde");
		driver.findElement(By.id("password")).sendKeys("poorna");
		driver.findElement(By.id("pass_confirmation")).sendKeys("poorna");
		driver.findElement(By.cssSelector("input[value='Female']")).click();
		driver.findElement(By.id("emailAddress")).sendKeys("poorna@gmail.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("9994448880");
		driver.findElement(By.id("dob")).sendKeys("06/14/2019");
		driver.findElement(By.id("address")).sendKeys("UK, Karnataka");
		
		Select sQuestion = new Select(driver.findElement(By.id("securityQuestion")));
		sQuestion.selectByVisibleText("What is your favour color?");
		
		driver.findElement(By.id("answer")).sendKeys("white");
		driver.findElement(By.cssSelector("input[value='Register']")).click();
	}
}
