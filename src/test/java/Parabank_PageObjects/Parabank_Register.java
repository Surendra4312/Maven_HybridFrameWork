package Parabank_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Parabank_Register {
    public static WebDriver driver;
	public Parabank_Register(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Register']")
	WebElement btnclick;
	@FindBy(id="customer.firstName")
	WebElement txtfirstName;
	@FindBy(id="customer.lastName")
	WebElement txtlastName;
	@FindBy(id="customer.address.street")
	WebElement txtstreet;
	@FindBy(id="customer.address.city")
	WebElement txtcity;
	@FindBy(id="customer.address.state")
	WebElement txtstate;
	@FindBy(id="customer.address.zipCode")
	WebElement txtzipCode;
	@FindBy(id="customer.phoneNumber")
	WebElement txtphoneNumber;
	@FindBy(id="customer.ssn")
	WebElement txtssn;
	@FindBy(id="customer.username")
	WebElement txtusername;
	@FindBy(id="customer.password")
	WebElement txtpassword;
	@FindBy(id="repeatedPassword")
	WebElement txtrepeatedPassword;
	@FindBy(xpath="//input[@value='Register']")
	WebElement btnRegister;
	
	public void registerclick()
	{
		btnclick.click();
	}
	public void setfirstname(String fname)
	{
		txtfirstName.sendKeys(fname);
	}
	public void setlastName(String lname)
	{
		txtlastName.sendKeys(lname);
	}
	public void setstreet(String street)
	{
		txtstreet.sendKeys(street);
	}
	public void setcity(String city)
	{
		txtcity.sendKeys(city);
	}
	public void setstate(String state)
	{
		txtstate.sendKeys(state);
	}
	public void setzipCode(String zipCode)
	{
		txtzipCode.sendKeys(zipCode);
	}
	public void setphoneNumber(String pNumber)
	{
		txtphoneNumber.sendKeys(pNumber);
	}
	public void setssn(String ssn)
	{
		txtssn.sendKeys(ssn);
	}
	public void setusername(String username)
	{
		txtusername.sendKeys(username);
	}
	public void setPassword(String Password)
	{
		txtpassword.sendKeys(Password);
	}
	public void setrepeatedPassword(String rPassword)
	{
		txtrepeatedPassword.sendKeys(rPassword);
	}
	public void clickRegister()
	{
		btnRegister.click();
	}
	

}
