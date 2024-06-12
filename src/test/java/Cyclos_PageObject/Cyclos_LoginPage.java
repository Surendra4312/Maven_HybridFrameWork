package Cyclos_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_LoginPage {
	WebDriver driver;
	public Cyclos_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//a[@id='login-link']//icon//*[name()='svg']")  
	WebElement login;
	@FindBy(xpath="//input[@placeholder='User']")
	WebElement Username;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Password;
	@FindBy(xpath="//span[text()='Submit']")
	WebElement Submitbutton;
	
	public void setLoginclick() 
	{
		 login.click();
	}
	public void setUsername(String uname) {
		Username.sendKeys(uname);
	}
	public void setpassword(String password)
	{
		Password.sendKeys(password);
	
	}
	public void setSubmit() 
	{
		Submitbutton.click();
	}

}
