package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationpage extends Basepage {
	
	public AccountRegistrationpage(WebDriver driver)
	{
		
		super(driver);
	}

	
	//Elements
	
	@FindBy(name = "firstname")
	WebElement txtfirstname;
	
	
	@FindBy(name = "lastname")
	WebElement txtlastname;
	
	
	@FindBy(name = "email")
	WebElement txtemail;
	
	
	//@FindBy(xpath = "//select[@name=\"country_id\"]")
	//WebElement country;
		

	@FindBy(name = "password")
	WebElement txtpassword;
	
	
	//@FindBy(xpath = "//button[@class=\"btn btn-primary btn-lg hidden-xs\"]")
	//WebElement Register2;
	
	@FindBy(xpath = "//input[@type=\"checkbox\"]")
	WebElement agree;
	
	
	@FindBy(xpath = "//button[text()=\"Continue\"]")
	WebElement continuebn;
	
	@FindBy(xpath = "//h3[text()=\"Welcome to OpenCart, your account has been created\"]")
	WebElement regsuccess;
	
	
	
	
	public void firstname(String fname)
	{
		txtfirstname.sendKeys(fname);
	}
	
	
	
	public void lastname(String lname)
	{
		txtlastname.sendKeys(lname);
	}
	
	
	public void email(String email)
	{
		txtemail.sendKeys(email);
	}
	
	
	
	/* Method to select an option from the dropdown by visible text
    public void selectOptionByText(String optionText) {
        Select dropdown = new Select(country);
        dropdown.selectByVisibleText(optionText);
    }
		
	*/

	
	public void password(String psword)
	{
		txtpassword.sendKeys(psword);
	}
	
	/*public void clickregister()

	{
		
		
		Register2.click();
	}
	*/
	public void privacypolicy()
	{
		
		agree.click();
		
	}
	
	
	public void continuebutton()
	{
		
		continuebn.click();
		
	}
	public String getregsuccess()
	{
		try
		{
			
			return(regsuccess.getText());
		}
			
		catch(Exception e)
		{
			return e.getMessage();
		}
			
			
		
	}
	
	
}
