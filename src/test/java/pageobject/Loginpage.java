package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage
{
	
	
	public Loginpage(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	
@FindBy(xpath = "//input[@name=\"email\"]")
WebElement email;


@FindBy(xpath = "//input[@name=\"password\"]")
WebElement password;

@FindBy(xpath = "//button[text()=\"Login\"]")
WebElement loginbutton;


public void loginemail(String emaillog)
{
	email.sendKeys(emaillog);
}


public void loginpassword(String passwordlog)
{
	password.sendKeys(passwordlog);
}

public void loginbutt()
{
	loginbutton.click();
}


}
