package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.AccountRegistrationpage;
import pageobject.Homepage;
import testbase.Baseclass;

public class TC_001_Accountregistration extends Baseclass 
{

	
@Test	
void test_account_registration()
{
	logger.info(" **********starting TC_001_Accountregistration*************");
	try
	{
	Homepage hp=new Homepage(driver);
	hp.clickmyaccount();
	logger.info("clicking on my account link");
	hp.clickregister();
	logger.info("clicking on register account link");
	AccountRegistrationpage ag=new AccountRegistrationpage(driver);
	logger.info("providing customer data");
	ag.firstname("vas");
	ag.lastname("am");
	//ag.email(randomalphabet()+"@gmail.com");
	ag.email("vasamvasam@gmail.com");
	ag.password("123456vasam");
	ag.privacypolicy();
	ag.continuebutton();
	logger.info("clicking on continue button");
	
	String msg=ag.getregsuccess();
	Assert.assertEquals(msg,"your Account Has Been Created!");
	}
	catch(Exception e)
	{
		Assert.fail();
	}
	logger.info("**********finished TC_001_Accountregistration*************");
}
	
	
	
	
	
	
	
	
}
