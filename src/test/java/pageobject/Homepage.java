package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage
{
	public Homepage(WebDriver driver)
	{
		
		super(driver);
		
	}
	
	
//Elements
	
@FindBy(xpath = "//span[text()=\"My Account\"]")
WebElement MyAccount;
	
	
@FindBy(xpath = "//a[text()=\"Register\"]")
WebElement Register;

@FindBy(xpath = "//a[text()=\"Login\"]")
WebElement login;
		
	
//action methods



public void clickmyaccount()

{
	
	
	MyAccount.click();
}


public void clickregister()

{
	
	
	Register.click();
}


public void clicklogin()
{

	login.click();
	
}



}
