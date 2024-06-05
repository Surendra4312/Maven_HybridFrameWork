package Cyclos_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Cyclos_BaseClass {
	public static WebDriver driver;
	
	@BeforeClass
	public void openApp() throws InterruptedException {
		driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://demo.cyclos.org/ui/home");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void closeApp() {
	 driver.close();	
	}
	
	
	

}
