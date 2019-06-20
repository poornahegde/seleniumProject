package skeleton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OR_LoginPage {
	@FindBy(how=How.ID,using = "Email")
	public static WebElement email;
	
	@FindBy(how= How.ID,using = "Password")
	public static WebElement password;
	
	@FindBy(how=How.CSS,using = "input[value='Log in']")
	public static WebElement signin;
}
