package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Loginpage;
import pageobject.Myaccountpage;
import testbase.Baseclass;
import utilities.Dataproviders;

public class TC_003_LoginDDT extends Baseclass
{
	
	@Test(dataProvider = "LoginData",dataProviderClass = Dataproviders.class)
	public void loginddt(String email,String password,String exp)
	{
		
		logger.info("**************starting TC_003_loginddt***************");
		Homepage hp=new Homepage(driver);
		hp.clickmyaccount();
		hp.clicklogin();
		
		Loginpage lp=new Loginpage(driver);
		lp.loginemail(email);
		lp.loginpassword(password);
		
		Myaccountpage map=new Myaccountpage(driver);
		boolean targetpage=map.ismyaccountpageexixts();
		
		if(exp.equals("valid"))
		{
			if(targetpage==true)
			{
				map.clicklogout();
				Assert.assertTrue(true);
			}
			
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equals("invalid"))
		{
			if(targetpage==true)
			{
				map.clicklogout();
				Assert.assertTrue(false);
			}
			
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		
		
		logger.info("***********finished TC_003_loginddt**********");
		
		
		
	}
	
}
