package DemoCyclos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Cyclos_Register {
	WebDriver driver;
	public Cyclos_Register(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='register-link']")
	WebElement register;
	@FindBy(id="id_1")
	WebElement txtName;
	@FindBy(id="id_2")
	WebElement txtLoginName;
	@FindBy(id="id_3")
	WebElement txtEmail;
	@FindBy(id="id_4")
	WebElement txtMobilephone;
	@FindBy(id="id_5")
	WebElement txtLandlinephone;
	@FindBy(xpath="//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")
	WebElement Nextbutton;
	@FindBy(id="id_7")
	WebElement txtPassword;
	@FindBy(id="id_8")
	WebElement txtPasswordconfirmation;
	@FindBy(xpath="//span[text()='Submit']")
	WebElement Submitbutton;

	
	public void clickRegister()
	{
		  register.click();
	}
	public void setname(String name)
	{
		txtName.sendKeys(name);
	}
	public void setLoginName(String LoginName)
	{
		txtLoginName.sendKeys(LoginName);
	}
	public void setEmail(String Email)
	{
		txtEmail.sendKeys(Email);
	}
	
	public void setMobilephone(String Mobilephone)
	{
		txtMobilephone.sendKeys(Mobilephone);
	}
	public void setLandlinephone(String Landlinephone)
	{
		txtLandlinephone.sendKeys(Landlinephone);
	}
	public void clickNext()
	{
		Nextbutton.click();
	}
	public void setPassword(String Password)
	{
		txtPassword.sendKeys();
	}
	public void setPasswordconfirmation(String Passwordconfirmation)
	{
		txtPasswordconfirmation.sendKeys();
	}
	public void clickSubmit()
	{
		clickSubmit();
	}

	
}




