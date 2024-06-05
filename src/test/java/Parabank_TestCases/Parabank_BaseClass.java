package Parabank_TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Adactin_Utilities.ReadingData;
import Parabank_Utilities.Parabank_ReadingData;

public class Parabank_BaseClass {
Parabank_ReadingData prd=new Parabank_ReadingData();
	
	public String AppURL=prd.getAppURL();
	public String fName=prd.getfirstname();
	public String lastName=prd.getlastName();
	public String street=prd.getstreet();
	public String city=prd.getcity();
	public String state=prd.getstate();
	public String zipCode=prd.getzipCode();
	public String pNumber=prd.getphoneNumber();
	public String ssn=prd.getssn();
	public String UName=prd.getUsername();
	public String PWord=prd.getPassword();
	public String rPassword=prd.getrepeatedPassword();
	
	public static WebDriver driver;
	public static Logger log;
	@BeforeClass
	public void openApp() {
		
		driver=new ChromeDriver();
		
		driver.get(AppURL);
		driver.manage().window().maximize();
		
		log=Logger.getLogger(driver.getClass());
		PropertyConfigurator.configure("log4j.properties");
	}
	
	
	@AfterClass
	public void closeApp() {
		
		driver.close();
	}
	
	//create capture screenshot method in baseclass
	
	public void captureScreen(WebDriver driver,String RegisterTest) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File target=new File("E:\\FrameWorks\\Maven_HybridFrameWork\\ScreenShorts\\"+RegisterTest+".png");
	    FileUtils.copyFile(src, target);
	    log.info("Screenshot is taken");
	
	}

}
