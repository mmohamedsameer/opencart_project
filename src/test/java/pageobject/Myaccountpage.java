package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccountpage extends Basepage
{

public Myaccountpage(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath = "//h2[text()='My Account']")
WebElement heading;

@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
WebElement logot;

public boolean ismyaccountpageexixts()
{
	try
	{
		return (heading.isDisplayed());
	}
	catch(Exception e)
	{
		return(false);
	}
	
}

public void clicklogout()
{
	logot.click();
}
	
}
