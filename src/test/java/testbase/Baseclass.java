package testbase;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;




public class Baseclass 
{
	public static WebDriver driver;
	
	public Logger logger;
	
	public ResourceBundle rb;
	@BeforeClass
	//@Parameters("browser")
	public void setup()
	{
		rb=ResourceBundle.getBundle("config");
		
		logger= LogManager.getLogger(this.getClass());
		driver=new ChromeDriver();
		/*if(br.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(rb.getString("appURL"));
		//driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	}
	
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}

	
	public String randomalphabet()
	{
		String generatestring1=RandomStringUtils.randomAlphabetic(5);
		return (generatestring1);
	
	}
	
	public String randomnumber()
	{
		
		String generatestring2=RandomStringUtils.randomNumeric(10);
		return (generatestring2);
	}

	public String alpnum()
	{
		String alp=RandomStringUtils.randomAlphabetic(5);
		String num=RandomStringUtils.randomNumeric(10);
		return (alp+num);
	}
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date(0));
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshot\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;

	}
	
}
