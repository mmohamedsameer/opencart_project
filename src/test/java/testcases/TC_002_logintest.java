package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Loginpage;
import pageobject.Myaccountpage;
import testbase.Baseclass;

public class TC_002_logintest extends Baseclass
{

@Test
public void testlogin()	
{
	
	logger.info("**************starting TC_002_logintest**********");
	try
	{
		Homepage hp=new Homepage(driver);
		hp.clickmyaccount();
		hp.clicklogin();
		Loginpage lp=new Loginpage(driver);
		lp.loginemail(rb.getString("email"));
		lp.loginpassword(rb.getString("pass"));
		lp.loginbutt();
		
		Myaccountpage map=new Myaccountpage(driver);
		boolean targetpage=map.ismyaccountpageexixts();
		Assert.assertEquals(targetpage, true);
		
	}
	
	catch(Exception e)
	{
		Assert.fail();
	}
	logger.info("**************finished TC_002_logintest***************");
	
	
	
}
	
	

	
}
