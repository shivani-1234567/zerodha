package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	@FindBy(xpath="//input[@type='text']")
	private WebElement Password;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Login;
	
	
	
	

}
